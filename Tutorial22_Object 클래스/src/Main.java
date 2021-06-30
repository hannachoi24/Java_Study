
public class Main {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		// 내부 변수가 같더라도 다른 인스턴스이기 때문에 다르게 인식
		System.out.println(archer1 == archer2);
		// equals: 내부적인 값이 같은지 
		System.out.println(archer1.equals(archer2));
	}

}

// 내부 변수가 같더라도 다른 인스턴스이기 때문에 다르게 인식