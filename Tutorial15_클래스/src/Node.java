
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
	
	public Node getCenter(Node other) { // �ٸ� ���� �� => �ڽ��� ������ �ִ� x, y ��ǥ�� �ٸ� ����� x, y ��ǥ�� ���� ��Ȯ�� �߾��� ��ȯ
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
