package app;

public class MainCommu {
	public static void main(String[] args) {
		
		String [] names = {"パパ","友達","上司",};
		Communication home = new HomeCommu();
		try {
			for (String name : names) {
				System.out.println(home.greet(name));
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			
		}
	}
}	
