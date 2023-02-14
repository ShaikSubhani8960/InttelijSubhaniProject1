package com.sg.returnMethodPrograms1;
class TwoDArrayAddition
{
	int[][] additionOf2DArray(int k[][], int p[][])
	{
		int z[][]=new int[k.length][k[0].length];
		for(int i=0; i<=k.length-1; i++)
		{
			for (int j=0; j<=k[0].length-1; j++)
			{
				z[i][j]=k[i][j]+p[i][j];
			}
		}
		return z;
	}
}
public class ReturnMethodAssignment4 {

	public static void main(String[] args) {
		int x[][]= {{1,2,3,4}, {5,6,7,8}};
		int y[][]= {{1,2,3,4}, {5,6,7,8}};
		TwoDArrayAddition obj=new TwoDArrayAddition();
		int a[][]=obj.additionOf2DArray(x,y);
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
