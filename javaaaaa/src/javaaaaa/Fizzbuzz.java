package javaaaaa;

import java.util.Scanner;

public class Fizzbuzz {
	public static void main (String args [])
	{
		Fizzbuzz fb= new Fizzbuzz();
		System.out.println(fb.hashCode());
		fb=null;
		System.gc();
	}
	protected void finalize()
	{
		System.out.println("sdfdsds");
	}

}

