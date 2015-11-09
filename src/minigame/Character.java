package minigame;

import textview.TextView;

public class Character {
	public static IView view = new TextView();

	private String name = null;
	private String skilList[] = null;
	private double hp = 300.0;
	
	private double maxHp = 300.0;
	public final int MAX_LEVEL = 10;
	
	private int atk = 25;
	private int smt = 15;
	private int def = 5;
	private int level = 1;
	private int expLimit = 100;
	private int exp = 0;
	private int atkSustain = 0;
	private int defSustain = 0;
	private int skillPoint = 3;
	private int statusPoint = 3;
	private int job = 0;

	double SKILL1() {
		double damage;

		damage = atk * 1.5;

		return damage;
	}

	double SKILL2() {
		double heal;

		heal = smt * 1.1;

		return heal;
	}

	void Get_Exp(int exp) {
		if (level < MAX_LEVEL) {
			exp += exp;
			return;
		} else
			return;
	}

	void Check_levelup() {
		if (exp < expLimit) {
			return;
		}

		else if (exp >= expLimit) {
			level++;

			if (level < MAX_LEVEL) {
				exp = 0 + (exp - expLimit);
				expLimit = level * 100;
				view.printSystemMessageln("레벨 업!!");
				return;
			} else if (level == MAX_LEVEL) {
				expLimit = 0;
				view.printSystemMessageln("만렙 달성!!");
				return;
			}
		}
	}

	public static IView getView() {
		return view;
	}

	public static void setView(IView view) {
		Character.view = view;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSkilList() {
		return skilList;
	}

	public void setSkilList(String[] skilList) {
		this.skilList = skilList;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(double maxHp) {
		this.maxHp = maxHp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getSmt() {
		return smt;
	}

	public void setSmt(int smt) {
		this.smt = smt;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExpLimit() {
		return expLimit;
	}

	public void setExpLimit(int expLimit) {
		this.expLimit = expLimit;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAtkSustain() {
		return atkSustain;
	}

	public void setAtkSustain(int atkSustain) {
		this.atkSustain = atkSustain;
	}

	public int getDefSustain() {
		return defSustain;
	}

	public void setDefSustain(int defSustain) {
		this.defSustain = defSustain;
	}

	public int getSkillPoint() {
		return skillPoint;
	}

	public void setSkillPoint(int skillPoint) {
		this.skillPoint = skillPoint;
	}

	public int getStatusPoint() {
		return statusPoint;
	}

	public void setStatusPoint(int statusPoint) {
		this.statusPoint = statusPoint;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}

	public int getMAX_LEVEL() {
		return MAX_LEVEL;
	}
	
	
}
