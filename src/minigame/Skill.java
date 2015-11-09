package minigame;

public class Skill {
	String name;
	double damage;
	double healing;
	int sustain;
	public Skill(String name, double damage, double healing, int sustain) {
		super();
		this.name = name;
		this.damage = damage;
		this.healing = healing;
		this.sustain = sustain;
	}
	
	
	int getFinalDamage(int atk) {
		return (int) (atk * damage);
	}
	
	int getFinalHealing(int smt) {
		return (int) (smt * healing);
	}
	
}