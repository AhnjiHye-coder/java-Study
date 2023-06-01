package reference;

class Unit{
	int hp;
	int atk;
	String name;
	
	Unit(String name, int hp, int atk){
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	void attack(Unit othar) { // 상대방호출
		othar.hp -= this.atk; // 상대 피. 내 공격력을 서로 주고받고 한다
	}
	
	boolean isAlive() { // 싸우는데 피가 얼마나 남았는지 출력
		return this.hp > 0;
	}
	
	
}



public class Ex06 {
	public static void main(String[] args) {
		Unit ob1 = new Unit("울트라", 400, 20);
		Unit ob2 = new Unit("아칸", 360, 30);
		
		while(true) {
			ob2.attack(ob1); // ob2가 먼저 때린다
			System.out.printf("%s : %d vs %d : %s\n", ob1.name, ob1.hp, ob2.hp, ob2.name);
			
			// 만약 둘중 하나라도 hp가 0이면 종료(break)
			if(ob1.hp <= 0 || ob2.hp <= 0) break;
			
			// 이번에는 ob1이 먼저 떄린다
			ob1.attack(ob2);
			System.out.printf("%s : %d vs %d : %s\n", ob1.name, ob1.hp, ob2.hp, ob2.name);

			// hp가 0보다 많다면 false(살아있다)
			if(ob1.isAlive() == false || ob2.isAlive() == false);
			
			
		}
		
	}
}












