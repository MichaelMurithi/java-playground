package learn;

import java.util.Set;
import java.util.TreeSet;

public class SetPrac {
	public static void main(String[] args) {
		//Set <String> teachers = new HashSet<>();//HashSet prints data in a random order
		Set <String> teachers = new TreeSet<>(); //TreeSet displays data in order
		teachers.add("Doreen");
		teachers.add("Moshe");
		teachers.add("Njuki");
		for(String t:teachers)
			System.out.println(t);

}
}
