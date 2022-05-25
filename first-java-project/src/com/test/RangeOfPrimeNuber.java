package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangeOfPrimeNuber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int i,count=0;
		int lowerlimit,upperlimit;
		System.out.println("enter lowerlimit number:");
		lowerlimit=Integer.parseInt(br.readLine());
		System.out.println("enter uppderlimit number:");
		upperlimit=Integer.parseInt(br.readLine());
		for(i=lowerlimit;i<=upperlimit;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
			count=0;
		}
	}

}
