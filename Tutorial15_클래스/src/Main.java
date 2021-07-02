
public class Main {

	public static void main(String[] args) {
		
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two); // one과 two의 정중앙 좌표값 할당
		System.out.println("x : " + result.getX() + ", y : " + result.getY());
	}

}
