package epam;
import java.util.*;
public class KISS {
	public static String attendance(int attend) 
	{
		if((attend<65 || attend>100)) return "FAIL"; 
		return "PASS";
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int student=in.nextInt();
		String result=attendance(student);
		System.out.println(result);
		in.close();
	}
}
