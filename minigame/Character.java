package minigame_example;

public class Character {
	public double HP = 300.0;
	final double MAX_HP = 300.0;
	int ATK = 25;
	int INT = 15;
	int DEF = 5;

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
}
