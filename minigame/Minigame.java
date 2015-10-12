package minigame_example;

import java.util.Scanner;
import java.util.Random;

public class Minigame {

	public static void main(String[] args) {
		int run = 0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Character ch = new Character();
		Monster mt = new Monster();
		System.out.println("적이 나타났다! 전투를 시작합니다.");

		while (ch.HP > 0 && mt.HP > 0) {	
			System.out.print("현재 나의 체력 : ");
			System.out.format("%.3f", ch.HP);
			System.out.print(" | 현재 적의 체력 : ");
			System.out.format("%.3f", mt.HP);
			System.out.println(" ");
			System.out.println("=========사용 가능한 기술의 목록=========");
			System.out.println("1.기본 공격");
			System.out.println("2.공격 스킬");
			System.out.println("3.회복 스킬");
			System.out.println("4.도망가기");
			System.out.print("어떤 기술을 사용하시겠습니까? >> ");
			int a = sc.nextInt();
			
			switch(a) {
			case 1 :
				System.out.print("'나'의 기본 공격!! ");
				System.out.format("%.3f", ch.ATK + (mt.DEF * 0.3));
				System.out.println("의 데미지를 주었다!");
				mt.HP = mt.HP - ch.ATK + (mt.DEF * 0.3);
				break;
			case 2 :
				System.out.print("'나'는 공격 스킬을 사용했다!! ");
				System.out.format("%.3f", ch.SKILL1() + (mt.DEF * 0.3));
				System.out.println("의 데미지를 주었다!");
				mt.HP = mt.HP - ch.SKILL1() + (mt.DEF * 0.3);
				break;
			case 3 :
				if(ch.HP < ch.MAX_HP) {
					System.out.print("'나'는 회복 스킬을 사용했다!! ");
					System.out.format("%.3f", ch.SKILL2());
					System.out.println("의 체력을 회복했다!");
					ch.HP = ch.HP + ch.SKILL2();
					if(ch.HP >= ch.MAX_HP) {
						System.out.println("(*주의*)최대 체력 이상은 회복할 수 없습니다.");
						ch.HP = 300.0;
					}
					break;
				}
				else if(ch.HP >= ch.MAX_HP) {
						System.out.println("이미 체력이 만땅이네요. 턴 스킵.");
						break;
					}
			case 4 :
				System.out.println("으윽, 적이 너무 강력해...");
				run++;
				break;
			default :
				System.out.println("잘못된 명령입니다. 한턴 쉬어갑니다.");
				break;
			}
			
			if(run == 1) break;
			
			int monsterskill = random.nextInt(2);
			
			switch(monsterskill) {
			case 0 :
				System.out.print("'적'의 기본 공격!! ");
				System.out.format("%.3f", mt.ATK + (ch.DEF * 0.3));
				System.out.println("의 데미지를 입었다!");
				ch.HP = ch.HP - mt.ATK + (ch.DEF * 0.3);
				break;
			case 1 : 
				System.out.print("'적'은 공격 스킬을 사용했다!! ");
				System.out.format("%.3f", mt.SKILL() + (ch.DEF * 0.3));
				System.out.println("의 데미지를 입었다!");
				ch.HP = ch.HP - mt.SKILL() + (ch.DEF * 0.3);
				break;
			}
		}
		
		if(run == 1) {
			System.out.println("적에게서 도망쳤다... 다음엔 만나지 않도록 조심하자");
		}
		else {
			if(ch.HP < 0) {
				System.out.println("적에게 패배하였다. 수련을 쌓고 오자.");
			}
			else if(mt.HP < 0) {
				System.out.println("적에게 승리하였다! 경험치를 획득했어!");
			}
			else if(mt.HP < 0) {
				System.out.println("동시에 쓰러지다니, 분하다...");
			}
		}
		
		return;
	}
}
