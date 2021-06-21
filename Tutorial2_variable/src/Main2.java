// final 키워드를 활용해 상수를 정의하고 이를 사용해보기
public class Main2 {
	final static double PI = 3.141592;
	// final: 한번 선언이 되면 절대 바뀔 수 없음을 의미
	// 상수는 메인함수 바깥에서 선언
	public static void main(String[] args) {
		int r = 30;
		System.out.println(r*r*PI);
		

	}

}
