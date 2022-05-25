package com.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int arr[]=new int[5];
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element at"+i+":");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Printing array elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
