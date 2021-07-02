
public class Node {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) { // 다른 노드와 비교 => 자신이 가지고 있는 x, y 좌표와 다른 노드의 x, y 좌표를 비교해 정확히 중앙을 반환
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
