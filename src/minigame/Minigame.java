package minigame;

import java.util.Random;
import java.util.Scanner;

import textview.TextView;

public class Minigame {
	public static IView view = new TextView();

	public static void main(String[] args) {
		int run = 0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Character ch = new Character();
		Monster mt = new Monster();
		
		view.printSystemMessage("캐릭터의 이름을 설정해 주세요 : ");
		String chname = sc.nextLine();
		ch.Charactername = chname;
		
		view.printSystemMessageln("적이 나타났다! 전투를 시작합니다.");

		while (ch.HP > 0 && mt.HP > 0) {	
			view.printSystemMessage("현재 나의 체력 : ");
			view.printSystemMessageFormat("%.3f", ch.HP);
			view.printSystemMessage(" | 현재 적의 체력 : ");
			view.printSystemMessageFormat("%.3f", mt.HP);
			view.printSystemMessageln(" ");
			view.printSystemMessageln("=========사용 가능한 기술의 목록=========");
			view.printSystemMessageln("1.기본 공격");
			view.printSystemMessageln("2.공격 스킬");
			view.printSystemMessageln("3.회복 스킬");
			view.printSystemMessageln("4.도망가기");
			view.printSystemMessage("어떤 기술을 사용하시겠습니까? >> ");
			int a = view.getSelectIndex();
			
			switch(a) {
			case 1 :
				view.printSystemMessageln("'나'의 기본 공격!! ");
				view.printSystemMessageFormat("%.3f", ch.ATK + (mt.DEF * 0.3));
				view.printSystemMessageln("의 데미지를 주었다!");
				mt.HP = mt.HP - ch.ATK + (mt.DEF * 0.3);
				break;
			case 2 :
				view.printSystemMessageln("'나'는 공격 스킬을 사용했다!! ");
				view.printSystemMessageFormat("%.3f", ch.SKILL1() + (mt.DEF * 0.3));
				view.printSystemMessageln("의 데미지를 주었다!");
				mt.HP = mt.HP - ch.SKILL1() + (mt.DEF * 0.3);
				break;
			case 3 :
				if(ch.HP < ch.MAX_HP) {
					view.printSystemMessageln("'나'는 회복 스킬을 사용했다!! ");
					view.printSystemMessageFormat("%.3f", ch.SKILL2());
					view.printSystemMessageln("의 체력을 회복했다!");
					ch.HP = ch.HP + ch.SKILL2();
					if(ch.HP >= ch.MAX_HP) {
						view.printSystemMessageln("(*주의*)최대 체력 이상은 회복할 수 없습니다.");
						ch.HP = 300.0;
					}
					break;
				}
				else if(ch.HP >= ch.MAX_HP) {
						view.printSystemMessageln("이미 체력이 만땅이네요. 턴 스킵.");
						break;
					}
			case 4 :
				view.printSystemMessageln("으윽, 적이 너무 강력해...");
				run++;
				break;
			default :
				view.printSystemMessageln("잘못된 명령입니다. 한턴 쉬어갑니다.");
				break;
			}
			
			if(run == 1) break;
			
			int monsterskill = random.nextInt(2);
			
			switch(monsterskill) {
			case 0 :
				view.printSystemMessageln("'적'의 기본 공격!! ");
				view.printSystemMessageFormat("%.3f", mt.ATK + (ch.DEF * 0.3));
				view.printSystemMessageln("의 데미지를 입었다!");
				ch.HP = ch.HP - mt.ATK + (ch.DEF * 0.3);
				break;
			case 1 : 
				view.printSystemMessageln("'적'은 공격 스킬을 사용했다!! ");
				view.printSystemMessageFormat("%.3f", mt.SKILL() + (ch.DEF * 0.3));
				view.printSystemMessageln("의 데미지를 입었다!");
				ch.HP = ch.HP - mt.SKILL() + (ch.DEF * 0.3);
				break;
			}
		}
		
		if(run == 1) {
			view.printSystemMessageln("적에게서 도망쳤다... 다음엔 만나지 않도록 조심하자");
		}
		else {
			if(ch.HP < 0) {
				view.printSystemMessageln("적에게 패배하였다. 수련을 쌓고 오자.");
			}
			else if(mt.HP < 0) {
				view.printSystemMessageln("적에게 승리하였다! 경험치를 획득했어!");
				ch.Get_Exp(mt.exp);
				ch.Check_levelup();
			}
			else if(mt.HP < 0) {
				view.printSystemMessageln("동시에 쓰러지다니, 분하다...");
			}
		}
		
		view.printSystemMessage("현재 경험치 : ");
		view.printSystemMessageFormat("%d", ch.EXP_P);
		view.printSystemMessageln(" ");
		view.printSystemMessage("현재 레벨 : ");
		view.printSystemMessageFormat("%d",  ch.LEVEL);
		view.printSystemMessageln(" ");
		
		sc.close();
		return;
	}
}
