package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated 
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int sum=0,LowerLimit,UpperLimit;
		System.out.println("enter LowerLimit number:");
		LowerLimit=Integer.parseInt(br.readLine());
		System.out.println("enter UpperLimit Number:");
		UpperLimit=Integer.parseInt(br.readLine());
		for(int i=LowerLimit;i<=UpperLimit;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)
				System.out.println(i+" ");
			
				sum=0;
		}

	}

}
