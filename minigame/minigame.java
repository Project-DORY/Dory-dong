public class minigame {
	class Character {
		double HP = 300.0;
		int ATK = 25;
		int INT = 15;
		
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

	class Monster {
		double HP = 500.0;
		int ATK = 10;
		int INT = 13;

		double SKILL() {
			double damage;

			damage = ATK * 1.3;
			
			return damage;
		}
	} 

	public static void main(String[] args) {
		System.out.println("적이 나타났다! 전투를 시작합니다.");
	}
}	
