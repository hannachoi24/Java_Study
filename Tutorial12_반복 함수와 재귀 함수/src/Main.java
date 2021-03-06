// // 피보나치 수열을 반복 함수로 구현
public class Main {

	public static int fibonacci(int number) {
		int one = 1;
		int two = 2;
		int result = -1;
		if(number == 1)
		{
			return one;
		}
		else if (number == 2)
		{
			return two;
		}
		else
		{
			for(int i = 2; i < number; i++)
			{
				result = one + two;
				one = two;
				// 1 1 2 3 5 8
				two = result;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(-1) + "입니다.");

	}

}
