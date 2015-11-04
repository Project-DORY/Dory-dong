package minigame_example;

public class Character {
	public double HP = 300.0;
	final double MAX_HP = 300.0;
	int ATK = 25;
	int INT = 15;
	int DEF = 5;
	int LEVEL = 1;
	int EXP_L = 1000;
	int EXP_P = 0;
	int MAX_LEVEL = 10;
	

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
	
	void Check_levelup(int expp) {
		if(expp < EXP_L) {
			return;
		}
		
		else if(expp >= EXP_L) {
			LEVEL++;
			
			if(LEVEL < MAX_LEVEL) {
				EXP_P = 0;
				EXP_L = LEVEL * 1000;
				return;
			} else if(LEVEL == MAX_LEVEL) {
				EXP_L = 0;
				return;
			}
		}
	}
}
