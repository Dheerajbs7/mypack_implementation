import java.util.Scanner;
import addition.*;
public class summation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1)binary and 2)Decimal");
		Scanner key = new Scanner(System.in);
		int c = Integer.parseInt(key.nextLine());
		bin_add obj = new bin_add();
		
		if(c==1)
		{
			obj.binary();
		}
		if(c==2)
		{
			obj.decimal();
		}
	}

}
