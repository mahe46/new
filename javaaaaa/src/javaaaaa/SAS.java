package javaaaaa;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SAS {
	public static void main(String[] args) {
//		String s= "mahendra kumar soni";
//		String []w=s.split(" ");
//		String rever= "";
//		for(int i=0;i<w.length;i++)
//		{
//			String words=w[i];
//			String rev="";
//			for(int j=words.length()-1;j>=0;j--)
//			{
//				rev=rev+words.charAt(j);
//			}
//			rever=rever+rev+" ";
//		}
//		System.out.println(rever);
//	}}
  int n= 7	;int temp=0;
  for(int i=2;i<=n-1;i++)
  {
	  if(n%i==0)
	  {
		  temp=temp+1;
	  }
  }
  if(temp>0)
  {
	  System.out.println("not prime");
  }
  else
	  
  {
	  System.out.println(" prime");
  }
		
	}}