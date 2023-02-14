package com.sg.returnMethodPrograms1;
class StringArray
{
	String[] secondHalfOfElements(String x[])
	{
		int l=0;
		String y[]=new String[x.length/2];
		for(int i=x.length/2; i<=x.length-1; i++)
		{
			y[l]=x[i];
			l++;
		}
		return y;
	}
}
public class ReturnMethodAssignment3 {

	public static void main(String[] args) {
		String x[]= {"shaik", "subhani", "rabbani", "sruthi"};
		StringArray obj=new StringArray();
		String z[]=obj.secondHalfOfElements(x);
		for(int k=0; k<=z.length-1; k++)
		{
			System.out.println(z[k]);
		}
	}
}
