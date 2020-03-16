package learn;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {
	public static void main(String[] args) {
		Collection values = new ArrayList();
		 values.add(12);
		 values.add(13);
		 values.add(15);
		 values.add(17);
		 System.out.println(values);
		 Iterator it = values.iterator();
		 while(it.hasNext()) {
		 System.out.println(it.next());
		 }
		 List<String> students = new ArrayList<>();
		 students.add("Myke");
		 students.add("William");
		 students.add(1,"Brian");  
		 for(int i =0;i<students.size();i++) {
		 System.out.println(students.get(i));
		 }
		 }
		 }
