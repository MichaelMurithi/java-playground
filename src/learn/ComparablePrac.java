package learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Students implements Comparable<Students>
{
	int rollNo,marks;
	String name;
	public Students(int rollNo,int marks,String name) {
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return marks>o.marks?1:-1;
	}
}
public class ComparablePrac {
	public static void main(String[] args) {
		List<Students> Students = new ArrayList<>();
		Students.add(new Students(100, 50,"Myke"));
		Students.add(new Students(130, 60,"Musa"));
		Students.add(new Students(101, 54,"John"));
		Students.add(new Students(122, 34,"William"));
		Collection.sort(Students);
		for(Students s:Students) {
			System.out.println(s);
		}
	}
}

