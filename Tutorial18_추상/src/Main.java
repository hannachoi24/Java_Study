// �߻��� ������ �̿��Ͽ� ���� �÷��̾� Ŭ���� ����
// �߻��� ������ �̿��Ͽ� ���� Ŭ���� ����
public class Main extends Player {

	public static void main(String[] args) {
		
		Main main = new Main(); // static���� ����� main �޼ҵ� �ȿ� �ٸ� �޼ҵ带 �ҷ��� ��� �ҷ����� �޼ҵ� ���� static���� ���� �ž� �Ǳ� ����
		main.play("Joakim Karud - Might Love");
		main.pause();
		main.stop();

	}

	@Override
	void play(String songName) {
		
		System.out.println(songName + "���� ����մϴ�.");
		
	}

	@Override
	void pause() {
		
		System.out.println("���� �Ͻ������մϴ�.");
	
	}

	@Override
	void stop() {
		
		System.out.println("���� �����մϴ�.");
	
	}

}
