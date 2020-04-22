package lockdown.com;

public class HashPattern {
static void hash(){
	int hp=4;
	int maxHash=hp*2-1;
	int space=hp-1;
	for (int i = hp; i >=1 ; i--) {
		for (int j = space; j>=i; j--) {
			System.out.print(" ");
		}
		for (int k = 1; k<=maxHash; k++) {
			System.out.print("#");
		}
		maxHash-=2;
		System.out.println();
		
	}
}
	public static void main(String[] args) {
hash();
	}

}
