// for(;;)는 while(true)와 똑같이 무한 루프라는 의미로 동작
// break문으로 반복문 빠져나오기
public class Main6 {

	public static void main(String[] args) {
		int count = 0;
		
		for(;;)
		{
			System.out.println("출력");
			count++;
			if(count == 10)
			{
				break;
			}
		}

	}

}
