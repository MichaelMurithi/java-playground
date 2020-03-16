package learn;

public class DollarBoxPattern {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int n=0;n<4;n++) {
				int b = n*i;
				if(b == 1 | b==2 | b==4)
					System.out.print(" ");
				else
					System.out.print("$");
			}
			System.out.println();
		}
}
}
