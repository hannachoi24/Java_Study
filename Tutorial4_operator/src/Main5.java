// '���� ? �� : ����' ������ ���¸� �����ϰ� ���α׷� �ۼ�
public class Main5 {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
		System.out.println("�ִ��� " + max(x, y) + "�Դϴ�.");

	}
	
	static int max(int a, int b) {
		int result = (a > b) ? a : b; // ���� ? �� : ����
		return result;
	}

}