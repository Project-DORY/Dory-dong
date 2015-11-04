package minigame;

import textview.TextView;

public class Character {
	public static IView view = new TextView();
	
	String Charactername = null;
	public double HP = 300.0;
	final double MAX_HP = 300.0;
	int ATK = 25;
	int INT = 15;
	int DEF = 5;
	int LEVEL = 1;
	int EXP_L = 100;
	int EXP_P = 0;
	int MAX_LEVEL = 10;
	int atksustain = 0;
	int defsustain = 0;
	int skillpoint = 3;
	int statuspoint = 3;

	double SKILL1() {
		double damage;

		damage = ATK * 1.5;

		return damage;
	}

	double SKILL2() {
		double heal;

		heal = INT * 1.1;

		return heal;
	}
	
	void Get_Exp(int exp) {
		if(LEVEL < MAX_LEVEL) {
			EXP_P += exp;
			return;
		}
		else return;
	}
	
	void Check_levelup() {
		if(EXP_P < EXP_L) {
			return;
		}
		
		else if(EXP_P >= EXP_L) {
			LEVEL++;
			
			if(LEVEL < MAX_LEVEL) {
				EXP_P = 0 + (EXP_P - EXP_L);
				EXP_L = LEVEL * 100;
				view.printSystemMessageln("레벨 업!!");
				return;
			} else if(LEVEL == MAX_LEVEL) {
				EXP_L = 0;
				view.printSystemMessageln("만렙 달성!!");
				return;
			}
		}
	}
}
