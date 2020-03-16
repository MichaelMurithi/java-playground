package learn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputPractice {
	public static void main(String[] args)
	{
		int n = 0;
		System.out.println("Enter a Number");
		/*
		 * try{ BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); n = Integer.parseInt(br.readLine());
		 * System.out.println(n); } catch(Exception e) {
		 * System.out.println("An error Occured in the input"); }
		 */		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(n);
	}
}
