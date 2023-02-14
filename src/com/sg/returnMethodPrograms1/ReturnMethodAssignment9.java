package com.sg.returnMethodPrograms1;
class PrimeNumberOrNot
{
	boolean primeOrNot(int num)
	{
		int condition=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				condition=condition+1;
				break;
			}
		}
		if(condition==0)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}
	void displayPrimeNumberSeries()
	{
		for(int i=1; i<=50; i++)
		{
			if(primeOrNot(i)==true)
			{
				System.out.println(i+" ");
			}
		}
	}
}
public class ReturnMethodAssignment9 {

	public static void main(String[] args) {
		PrimeNumberOrNot obj= new PrimeNumberOrNot();
		obj.displayPrimeNumberSeries();
		//		boolean b=obj.primeOrNot(39);
		//		if(b==true)
		//			{
		//				System.out.print("is a prime number");
		//			}
		//		else
		//		{
		//			System.out.println(" is not a prime number");
		//		}
	}
}
