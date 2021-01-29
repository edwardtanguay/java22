public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello World");
		OutputManager om = new OutputManager();
		om.displayTest();
	}	
}

class OutputManager {
	public void displayTest() {
		System.out.println("The test.");
	}
}