// while을 이용하여 1 부터 1000까지의 합을 출력
public class Main3 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i <= 1000)
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");

	}

}
