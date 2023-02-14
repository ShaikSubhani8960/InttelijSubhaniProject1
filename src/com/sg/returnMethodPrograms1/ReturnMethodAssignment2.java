package com.sg.returnMethodPrograms1;
class DoubleArray
{
	double[] firstHalfOfElements(double x[])
	{
		double y[]=new double[x.length/2];
		for(int i=0; i<=x.length/2-1; i++)
		{
			y[i]=x[i];
		}
		return y;
	}
}
public class ReturnMethodAssignment2 {

	public static void main(String[] args) {
		double x[]= {10.2, 12.5, 13.9, 14.2, 15.6, 16.8};
		DoubleArray obj=new DoubleArray();
		double z[]=obj.firstHalfOfElements(x);
		for(int k=0; k<=z.length-1; k++)
		{
			System.out.println(z[k]);
		}
	}
}
