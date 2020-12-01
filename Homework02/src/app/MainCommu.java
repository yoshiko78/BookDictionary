package app;

public class MainCommu {
	public static void main(String[] args) {
		
		String name = "友達";
		Communication work = new WorkCommu();
		try {
			System.out.println(work.greet(name));
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			
		}
	}
}	
