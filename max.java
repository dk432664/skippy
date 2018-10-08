//to find the greater number between 3
import java.util.Scanner;
public class ass3 {
	public static void main(String[] args)
	{
		Scanner xy=new Scanner(System.in);
		int x=xy.nextInt();
		int y=xy.nextInt();
		int z=xy.nextInt();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int m;
		if(x>y&&x>z)
		{
			m=x;
		}
		else if(y>z)
		{
			m=y;
		}
		else
		{
			m=z;
		}
		System.out.println(m);
	
		
	
		
		
	}
