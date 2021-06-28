// Person 클래스를 생성
// Person을 상속받아 하나의 학생을 의미하는 Student 클래스
// Student 클래스를 이용하여 객체 생성
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 20, 175, 70, "20183423", 1, 4.5);
		Student student2 = new Student("이순신", 30, 180, 80, "20170101", 4, 3.5);
		student1.show();
		student2.show();
	}

}
