package Assignments.Assignment2;

import java.util.*;
public class Assignment2 {
public static boolean containsAll(String input)
{
	Set<Character> set=new HashSet<Character>();

	for(int i=0;i<input.length();i++)
	{
		set.add(input.charAt(i));
	}
	//System.out.println(set.size());
	if(set.size()==26)
		return true;
	else
		return false;
}
	public static void main(String[] args) {
		System.out.println("Enter the input String : ");
		Scanner scan = new Scanner(System.in);
		String input=scan.nextLine().toLowerCase();
		input=input.trim();
		input = input.replaceAll("\\s+", "");
		System.out.println(input);
		if(containsAll(input))
			System.out.println("Contains All the Characters");
		else
			System.out.println("Does not contain all the characters");
	}

}
// O(n) - n is length of input string