
public class Main implements Dog, Cat {

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();
		main.show();
		main.one();
		main.two();
	}
	
	@Override
	public void crying() {
		
		System.out.println("Па! Па!");
	}
	
	@Override
	public void show() {
		
		System.out.println("Hello World!");
	}

	@Override
	public void one() {
		System.out.println("One!");
		
	}

	@Override
	public void two() {
		System.out.println("Two!");
		
	}

}
