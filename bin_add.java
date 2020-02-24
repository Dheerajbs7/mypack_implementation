package addition;

import java.util.Scanner;

public class bin_add {
public void binary()
{
	int val1;
	int val2;
	int i = 0, carry = 0;
	int[] sum = new int[10];
	Scanner key = new Scanner(System.in);
	System.out.println("Enter the first binary number");
	val1=key.nextInt();
	System.out.println("Enter second binary number");
	val2=key.nextInt();
	while (val1 != 0 || val2 != 0) 
	{
		sum[i++] = (int)((val1 % 10 + val2 % 10 + carry) % 2);
		carry = (int)((val1 % 10 + val2 % 10 + carry) / 2);
		val1 = val1 / 10;
		val2 = val2 / 10;
	}
	if (carry != 0) {
		sum[i++] = carry;
	}
	--i;
	System.out.print("Output: ");
	while (i >= 0) {
		System.out.print(sum[i--]);

	}
}
public void decimal()
{
	int val1;
	int val2;
	Scanner key = new Scanner(System.in);
	System.out.println("Enter the first decimal value");
	val1=key.nextInt();
	System.out.println("Enter the second decimal value");
	val2=key.nextInt();
	int sum=val1+val2;
	System.out.println("The sum is"+sum);
}
}

