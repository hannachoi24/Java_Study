// if문을 이용하여 문자열이 특정 문자열을 포함하는지 확인
public class Main {

	public static void main(String[] args) {
		String a = "I Love You.";
		if(a.contains("Love")) // contains: 특정 문자열을 포함하는지
		{
			System.out.println("Me Too.");
		}
		else
		{
			System.out.println("I Hate You.");
		}
	}
}
