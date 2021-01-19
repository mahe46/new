package javaaaaa;

public class A {
	public static void main(String[] args) {
		
	
		String s= "mahendra kumar soni";
		String w[]= s.split(" ");
		String rev="";
		for(int i=0;i<w.length;i++)
		{
			String words=w[i];
			String rever="";
			for(int j=words.length()-1;j>=0;j--)
			{
				rever=rever+words.charAt(j);
				//System.out.println(rever);
			}
			rev=rev+rever+" ";
		}
		System.out.println(rev);
		
}
}