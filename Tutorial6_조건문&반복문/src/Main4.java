// for문을 이용하여 삼각형을 출력
public class Main4 {

	final static int N = 30; 
	
	public static void main(String[] args) {
		for(int i = N; i > 0; i--) {
			for(int j = i; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
