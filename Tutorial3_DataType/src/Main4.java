// 10진수를 8진수 혹은 16진수로 바꾸어 출력
public class Main4 {

	public static void main(String[] args) {
		int a = 200;
		
		System.out.println("10진수:"+a);
		System.out.format("8진수: %o\n",a);
		// %o: 형식 지정자(10진수 정수를 8진수로 출력해주는 역할)
		System.out.format("16진수: %x",a);
		// %x: 형식 지정자(10진수 정수를 16진수로 출력해주는 역할)
	}

}
