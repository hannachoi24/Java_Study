
public class Warrior extends Hero{

	public Warrior(String name) {
		super(name); // super: 자신의 부모 클래가 가지고 있던 변수를 기본적으로 초기화 해주는 역할 
	}
	
	public void groundCutting() {
		System.out.println("대지 가르기!");
	}

}
