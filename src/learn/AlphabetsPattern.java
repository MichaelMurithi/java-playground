package learn;

public class AlphabetsPattern {
	public static void main(String[] args) {
		char b = 65;
		for(b = 66;b<69;b++ ) {
			for(char c = 65;c<b;c++) {
				System.out.print(c);
			}
			
			System.out.println();
		}
	}

}
