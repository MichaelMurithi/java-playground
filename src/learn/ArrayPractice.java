package learn;

class units{
	String unitCode;
	String unitName;
	public units(String unitCode,String unitName) {
	this.unitCode = unitCode;
	this.unitName = unitName;
	}
}
public class ArrayPractice {
	public static void main(String[] args) {
		String units[] = {"Calculus", "Chemistry","Physics","Drawing","Digital Logic"};
		for(int i = 0; i<5;i++) {
			System.out.println(units[i]);
		}
		//creates a multidimensional juggled array
	int nums[][] = {
			{1,3,4,5},
			{2,4,5,6,5,6},
			{6,7,1,2}
	};
	//checks for each array in  the outer array
	for(int i = 0; i<nums.length;i++) {
		//checks for each element in an inner array
		for(int j=0; j<nums[i].length;j++) {
			//prints each element in the array
			System.out.print(" "+nums[i][j]);
		}
		System.out.println();
	}
	//using enhanced for loop
	for(int num[]: nums) {
		for(int n : num) {
			System.out.print(" "+n);
		}
		System.out.println();
	}
	}
}
