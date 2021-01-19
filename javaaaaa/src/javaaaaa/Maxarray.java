package javaaaaa;

import java.util.HashMap;
import java.util.Map;

public class Maxarray {

	public static void main(String[] args) {
		String s= "mahendrasoni";
		Map<Character , Integer> m= new HashMap<>();
		for(int i = s.length()-1; i>=0; i--)
		{
			
			if (m.containsKey(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
					
				int count=m.get(s.charAt(i));
				m.put(s.charAt(i), ++count);
					}
			else {
				m.put(s.charAt(i),1);
				
			}
			System.out.println(m);

		}
		System.out.println(m);
			

	}

}
