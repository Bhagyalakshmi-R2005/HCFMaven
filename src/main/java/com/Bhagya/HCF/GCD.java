package com.Bhagya.HCF;

public class GCD {
	public int gcd(int a,int b)
	{
		while(b != 0)
		{
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
