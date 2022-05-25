package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int number,count=0,rem,sum=0,k=0;
		System.out.println("enter number to check Armstrong Number:");
		number=Integer.parseInt(br.readLine());
		int temp=number;
		k=number;
		for(;temp>0;temp=temp/10)
		{
			count++;
		}
		
		while(number>0)
		{
			rem=number%10;
			sum=sum+(int)Math.pow(rem, count);
			number=number/10;
		}
		if(sum==k)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("not a armstrong Number");
		}
	}

}
