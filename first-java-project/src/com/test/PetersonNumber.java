package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetersonNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.println("Nter Number:");
		int number,factorial=1,remainder,sumOfFactorial=0;
		number=Integer.parseInt(br.readLine());
		int temp=number;
		while(number>0)
		{
			remainder=number%10;
			int i=1;
			while(i<=remainder)
			{
				factorial=factorial*i;
				i++;
			}
			sumOfFactorial=sumOfFactorial+factorial;
			number=number/10;
			factorial=1;
		}
		if(sumOfFactorial==temp)
			System.out.println("Peterson number");
		else
			System.out.println("not a Peterson Number");

	}

}
