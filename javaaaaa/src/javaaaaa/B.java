package javaaaaa;

import org.testng.annotations.Parameters;

public class B extends A {
	
	public static void main(String[] args) {
		
		B b = (B) new A();
		@Parameters({"browser"})	
		  

		int a[]= {1,2,23,5,34,6};
		int temp;
		int s=a.length;
		for(int i=0;i<s;i++)
		{
	   for(int j=i+1;j<s;j++)
	   {
			if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(a[s-1]);
	}
}
	

