package oopsPractice;

class outer{
	String name;
	public outer(String name){
		this.name = name;
	}
	public void show() {
		System.out.println("Hello "+name);
	}
	
	class inner{
		String career;
		public inner(String career) {
			this.career = career;
		}
		public void display() {
			System.out.println(career);
		}
	}
	static class stat{
		public void out() {
			System.out.println("This is a static class");
		}
	}
}
public class InnerDemo {
	public static void main(String[] args) {
		outer obj = new outer("Myke");
		obj.show();
		outer.inner obj1 = obj.new inner("Engineer");
		obj1.display();
		outer.stat obj2 = new outer.stat();
		obj2.out();
	}

}
