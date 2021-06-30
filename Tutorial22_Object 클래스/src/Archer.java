/*객체(Object) 클래스는 모든 객체의 조상으로서 쓰입니다. 
자바에서 사실 모든 클래스는 암시적으로 Object 클래스를 상속 받고 있습니다.
그러한 이유에서 Object 클래스는 모든 클래스의 조상이라고 할 수 있는 것입니다.
이러한 클래스가 존재하는 이유는 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공하기 위해서 입니다.*/

// 자동으로 object(조상 클래스) 상속을 받음
public class Archer {
	
	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) {
		// obj 변수가 Archer라는 클래스의 인스턴스와 같은지 확인
		// Archer는 obj의 자식 클래스가 됨
		Archer temp = (Archer) obj; // Archer 형태로 바꿔줌
		if (name == temp.name && power == temp.power) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
