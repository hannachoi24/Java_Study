/*��ü(Object) Ŭ������ ��� ��ü�� �������μ� ���Դϴ�. 
�ڹٿ��� ��� ��� Ŭ������ �Ͻ������� Object Ŭ������ ��� �ް� �ֽ��ϴ�.
�׷��� �������� Object Ŭ������ ��� Ŭ������ �����̶�� �� �� �ִ� ���Դϴ�.
�̷��� Ŭ������ �����ϴ� ������ ��� Ŭ������ �������� �����ϰ� �־�� �ϴ� ����� �����ϱ� ���ؼ� �Դϴ�.*/

// �ڵ����� object(���� Ŭ����) ����� ����
public class Archer {
	
	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) {
		// obj ������ Archer��� Ŭ������ �ν��Ͻ��� ������ Ȯ��
		// Archer�� obj�� �ڽ� Ŭ������ ��
		Archer temp = (Archer) obj; // Archer ���·� �ٲ���
		if (name == temp.name && power == temp.power) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
