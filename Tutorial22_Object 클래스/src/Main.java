
public class Main {

	public static void main(String[] args) {
		
		Archer archer1 = new Archer("�ü�1", "��");
		Archer archer2 = new Archer("�ü�1", "��");
		// ���� ������ ������ �ٸ� �ν��Ͻ��̱� ������ �ٸ��� �ν�
		System.out.println(archer1 == archer2);
		// equals: �������� ���� ������ 
		System.out.println(archer1.equals(archer2));
	}

}

// ���� ������ ������ �ٸ� �ν��Ͻ��̱� ������ �ٸ��� �ν�