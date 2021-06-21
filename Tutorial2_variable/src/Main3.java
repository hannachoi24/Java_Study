// 오버플로의 개념을 이해
public class Main3 {
	
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
		int a = INT_MAX;
		System.out.println(a+1);
		// 결과가 -가 나오는 이유는 오버플로때문 (가장 작은 값이 출력)

	}

}
