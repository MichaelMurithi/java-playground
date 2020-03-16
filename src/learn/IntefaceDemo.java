package learn;

interface trial{
	void greet();
	void comfort();
	}

class teacher implements trial{
	public void greet() {
		System.out.println("Hello Teacher");
	}
	public void comfort() {
		 System.out.println("Sorry Student");
	}
}

public interface IntefaceDemo {
	public static void main(String[] args) {
		teacher t1 = new teacher();
		t1.comfort();
	}
}
