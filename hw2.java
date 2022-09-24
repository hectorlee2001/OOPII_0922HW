import java.util.*;

public class hw2{
	public static void main(String args[])
	{
		int i = 0;
		int mon = 0;
		String tt;
		HashMap<Integer, String> hp = new HashMap<>();
		hp.put(1,"January");
		hp.put(2,"Feburary");
		hp.put(3,"March");
		hp.put(4,"April");
		hp.put(5,"May");
		hp.put(6,"June");
		hp.put(7,"July");
		hp.put(8,"August");
		hp.put(9,"September");
		hp.put(10,"October");
		hp.put(11,"November");
		hp.put(12,"December");
		
		Scanner sc = new Scanner(System.in);
		while(i==0)
		{
			System.out.println("Please input a number from 1~12 ?");
			tt = sc.nextLine();
			if(tt.chars().allMatch(Character::isDigit))
			{
				mon = Integer.parseInt(tt);
				if(mon>12 || mon <1)
					System.out.println("error input");
				else
					i = 1;
			}
			else
				System.out.println("error input");
		}
		System.out.println("the "+mon+" month's english name is "+hp.get(mon));
	}
}