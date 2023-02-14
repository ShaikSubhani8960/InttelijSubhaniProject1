package com.sg.returnMethodPrograms1;
class NinthTable
{
	int [] ninthTableResult(int x)
	{
		int a[]=new int[10];
		for(int i=1; i<=10; i++)
		{
			a[i-1]=i*x;
		}
		return a; 
	}
}
public class ReturnMethodAssignment8 {

	public static void main(String[] args) {
		NinthTable obj= new NinthTable();
		int c[]=obj.ninthTableResult(9);
		for(int i=0; i<=c.length-1; i++)
		{
			System.out.println(c[i]);
		}
	}
}
