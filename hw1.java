import java.util.*;

public class hw1{
	public static void main(String args[])
	{
		int r,i;
		var tree = new TreeSet<>();
		for(i=1;i<=10;i++)
		{
			r = (int)(Math.random()*100)+1;
			tree.add(r);
			System.out.println("the "+i+" number is "+r);
		}
		System.out.println("the amount of contains in the tree is: "+(i-1));
		System.out.println("the contains in the tree is: "+tree);
		System.out.println("the first number is: "+tree.first());
		System.out.println("the last number is: "+tree.last());
		System.out.println("the numbers between 30-70 is: "+tree.subSet(30, 70));
		
	}
}