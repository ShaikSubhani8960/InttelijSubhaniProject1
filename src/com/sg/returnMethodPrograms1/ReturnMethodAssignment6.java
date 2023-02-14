package com.sg.returnMethodPrograms1;
class FactorialUsingReturnMethod
{
	int factorialUsingReturnMethod(int x)
	{
		int fact=1;
		for(int i=x; i>=1; i--)
		{
			fact=fact*i;
		}  
		return fact; 
	}
}
public class ReturnMethodAssignment6 {

	public static void main(String[] args) {
		FactorialUsingReturnMethod obj= new FactorialUsingReturnMethod();
		int a=obj.factorialUsingReturnMethod(4);
		System.out.println(a);
	}
}

