import java.lang.*;
import java.io.*;
import java.util.*;

public class reverse 
{

	public static void main(String[] args)
		{
			String input = "SRISHA";

			char[] try1 = input.toCharArray();

			for (int i = try1.length - 1; i >= 0; i--)
				System.out.print(try1[i]);
		}
	}

/*
 // Java program to demonstrate conversion from
// String to StringBuffer and reverse of string
import java.lang.*;
import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args)
	{
		String str = "Geeks";

		
		StringBuffer sbr = new StringBuffer(str);//using string builder or string buffer
		
		sbr.reverse();
		System.out.println(sbr);
	}
}

 */