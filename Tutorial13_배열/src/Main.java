// ���ϴ� ������ŭ�� �迭�� ���� �� �ִ밪 ���ϱ� 
import java.util.Scanner;

public class Main {
	
	public static int max(int a, int b) {
		return(a > b) ? a : b;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �迭�� ũ�⸦ �Է��ϼ���: ");
		int number = scanner.nextInt(); // ����ڰ� �Է��ϴ� ���� ������ �Ҵ�
		int[] array = new int[number];
		for(int i = 0; i < number; i++)
		{
			System.out.println("�迭�� �Է��� ������ �Է��ϼ���: ");
			array[i] = scanner.nextInt(); // ����ڰ� �Է��ϴ� ���� ������ �Ҵ�
		}
		int result = -1;
		for (int i = 0; i < number; i++)
		{
			result = max(result, array[i]); // result�� array�� ��� ���ڸ� ���ؼ� ���� ū �� �Ҵ�
		}
		System.out.println("�Է��� ��� ���� �߿��� ���� ū ����: " + result + "�Դϴ�.");
	}

}
