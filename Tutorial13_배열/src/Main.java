// 원하는 개수만큼의 배열을 생성 및 최대값 구하기 
import java.util.Scanner;

public class Main {
	
	public static int max(int a, int b) {
		return(a > b) ? a : b;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("생성할 배열의 크기를 입력하세요: ");
		int number = scanner.nextInt(); // 사용자가 입력하는 다음 정수를 할당
		int[] array = new int[number];
		for(int i = 0; i < number; i++)
		{
			System.out.println("배열에 입력할 정수를 입력하세요: ");
			array[i] = scanner.nextInt(); // 사용자가 입력하는 다음 정수를 할당
		}
		int result = -1;
		for (int i = 0; i < number; i++)
		{
			result = max(result, array[i]); // result와 array에 담김 숫자를 비교해서 가장 큰 값 할당
		}
		System.out.println("입력한 모든 정수 중에서 가장 큰 값은: " + result + "입니다.");
	}

}
