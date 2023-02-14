package com.sg.returnMethodPrograms1;
class EvenNumberInBetweenTwoNumbers
{
	int[] evenNumbersBtw2Numbers(int p, int k)
	{
		int x=0;int y=0;
		if(p<k) {
			x=p;
			y=k;
		}
		else {
			x=k;
			y=p;
		}
		int count = 0;
		for(int i=x; i<=y; i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		
		int [] a=new int [count];
		int j=0;
		for(int i=x; i<=y; i++) 
		{
			if(i%2==0)
			{
				a[j]=i;
				j++;
			}
		}
		return a;
	}

}
public class ReturnMethodAssignment7 {

	public static void main(String[] args) {
		EvenNumberInBetweenTwoNumbers obj= new EvenNumberInBetweenTwoNumbers();
		int b[]=obj.evenNumbersBtw2Numbers(200, 60);
		for(int i=0; i<=b.length-1; i++)
		{
			System.out.println(b[i]);
		}
	}
}
