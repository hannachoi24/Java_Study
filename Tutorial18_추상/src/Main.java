// 추상의 개념을 이용하여 음악 플레이어 클래스 구현
// 추상의 개념을 이용하여 동물 클래스 구현
public class Main extends Player {

	public static void main(String[] args) {
		
		Main main = new Main(); // static으로 선언된 main 메소드 안에 다른 메소드를 불러올 경우 불러와진 메소드 또한 static으로 선언 돼야 되기 때문
		main.play("Joakim Karud - Might Love");
		main.pause();
		main.stop();

	}

	@Override
	void play(String songName) {
		
		System.out.println(songName + "곡을 재생합니다.");
		
	}

	@Override
	void pause() {
		
		System.out.println("곡을 일시정지합니다.");
	
	}

	@Override
	void stop() {
		
		System.out.println("곡을 정지합니다.");
	
	}

}
