package lockdown.com;

public class StarPattern1 {
	static void star(){
		for (int i = 1; i <5; i++) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
			for (int p = 5; p >i; p--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		star();
		
	}

}
