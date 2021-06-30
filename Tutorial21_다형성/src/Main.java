import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("바나나 : 1, 복숭아 : 2 ?");
		int input = scanner.nextInt();
		Fruit fruit;
		
		if(input == 1) {
			fruit = new Banana();
			fruit.show();
		}
		else if(input == 2) {
			fruit = new Peach();
			fruit.show();
		}
		
		// 본인 변수에 자식 클래스의 instance를 넣을 수 있음
		// Fruit fruit = new Peach();
		// fruit.show();
	}

}
