// '조건 ? 참 : 거짓' 연산의 형태를 숙지하고 프로그램 작성
public class Main5 {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
		System.out.println("최댓값은 " + max(x, y) + "입니다.");

	}
	
	static int max(int a, int b) {
		int result = (a > b) ? a : b; // 조건 ? 참 : 거짓
		return result;
	}

}
