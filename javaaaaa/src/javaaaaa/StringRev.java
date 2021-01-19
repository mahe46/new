package javaaaaa;

public class StringRev {

	public static void main(String[] args) {
		String s = "mahendra kumar soni";
		String g[] =s.split(" ");
		String rev="";
		for (int i=g.length-1; i>=0;i--)
		{
			rev= rev+g[i]+" ";
		}
		System.out.println(rev);
	}

}
