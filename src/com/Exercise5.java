package com;
import java.util.*;
public class Exercise5 {

	public static void main(String[] args) {

		int a, sum=0;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter  number- ");  
		a = n.nextInt();
		for(int i =1 ; i<=a ; i++)
		{
			if(i%3 == 0 || i%5 == 0)
			{
				sum+=i;
			}
		}

		System.out.println(sum);

	}

}
