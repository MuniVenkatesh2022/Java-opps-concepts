package com.test;

public class MyFirstJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to java ");
		int i=1,sum;
		for(i=1,sum=0;i<=5;)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		i=1;
		while(i<=50)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=50;
		do
		{
			System.out.print(i+" ");
			i--;
		}while(i>=1);
	}

}
