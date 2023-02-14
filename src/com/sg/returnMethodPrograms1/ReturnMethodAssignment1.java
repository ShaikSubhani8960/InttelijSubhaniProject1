package com.sg.returnMethodPrograms1;
class CharArrayInReverseOrder
{
	char[] returnCharacterArray(char[] arr)
	{
		int j=0;
		char[] arrReverse=new char[arr.length];
		for(int i=arr.length-1; i>=0; i--)
		{
			arrReverse[j]=arr[i];
			j++;
		}
		return arrReverse;
	}
}

public class ReturnMethodAssignment1 {

	public static void main(String[] args) {
		CharArrayInReverseOrder obj=new CharArrayInReverseOrder();
		char arr[]= {'a', 'b', 'c', 'd', 'e', 'f'};
		char arrReversed[]=obj.returnCharacterArray(arr);
		for(int i=0; i<=arrReversed.length-1; i++)
		{
			System.out.println(arrReversed[i]);
		}
	}

}
