package com.sg.returnMethodPrograms1;
class TwoDoubleArraySubstraction
{
	double[][] substractionof2DArray(double k[][], double p[][])
	{
		double z[][]=new double[k.length][k[0].length];
		for(int i=0; i<=k.length-1; i++)
		{
			for (int j=0; j<=k[0].length-1; j++)
			{
				z[i][j]=k[i][j]-p[i][j];
			}
		}
		return z;
	}
}
public class ReturnMethodAssignment5 {

	public static void main(String[] args) {
		double x[][]= {{3.3,2.4,3.5,4.8}, {2.5,6.5,7.4,8.3}};
		double y[][]= {{1.3,1.4,2.5,2.8}, {1.5,3.5,5.4,3.3}};
		TwoDoubleArraySubstraction obj=new TwoDoubleArraySubstraction();
		double a[][]=obj.substractionof2DArray(x,y);
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[0].length-1; j++)
			{
				System.out.print(a[i][j]+" ");		
			}
		System.out.println();
		}
	}
}
