package com.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  Min_Max
{
	public void findMinMax() throws NumberFormatException, IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.println("Enter the size of the Array:");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element "+i+":");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int max=arr[0],min=arr[0],sum=0;
		
		for(int i=1;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum element of array is:"+max);
		System.out.println("Minimum element of array is:"+min);
		System.out.println("Sum of the array elements is:"+sum);
	}
	
	public void arrayOfOdd()
	{
		int arr[]= {22,33,45,68,97,42,75};
		System.out.println("Printing odd Numbers:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
			
		}
	}
}

public class ArrayDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Min_Max obj=new Min_Max();
	
		obj.arrayOfOdd();
	}

}
