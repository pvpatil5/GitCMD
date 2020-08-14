package pac;

import org.testng.annotations.Test;

public class SAmple1 
{	
		@Test
		public void reverse()
		{
			String s1= "Selenium";
			String s2 = "";

			char c[] = s1.toCharArray();

			for (int i = c.length-1; i >=0; i--) 
			{
				s2= s2+c[i];
			}
			System.out.println(s2);
		}
	}

