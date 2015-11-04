package minigame;

public class Monster {
	double HP = 500.0;
	int ATK = 10;
	int INT = 8;
	int DEF = 3;
	int exp = 55;
	int condition = 0;
	int condition_index = 0;

	double SKILL() {
		double damage;

		damage = ATK * 1.3;

		return damage;
	}
}
