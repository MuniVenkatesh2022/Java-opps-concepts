package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorOfNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int number;
		System.out.println("enter any number:");
		number=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
