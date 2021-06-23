// 특정한 정수를 입력 받아서 그대로 출력 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i + "입니다.");
		sc.close();

	}

}
