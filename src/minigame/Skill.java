package minigame;

public class Skill {
	double cut(int ATK) {
		String skname = "cut";
		double damage = 0;
		
		damage += ATK * 1.2;
		
		return damage;
	}
	
	double stab(int ATK) {
		String skname = "stab";
		double damage = 0;
		
		damage += ATK * 0.8;
		
		return damage;
	}
	
	double heal(int INT) {
		String skname = "heal";
		double healling = 0;
		
		healling += INT * 0.4;
		
		return healling;
	}
	
	int magicsword() {
		String skname = "magicsword";
		int sustain = 3;
		return 15;
	}
	
	int protector() {
		String skname = "protector";
		int sustain = 2;
		return 20;
	}
}