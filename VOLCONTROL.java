/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int iv = s.nextInt();
	        int fv = s.nextInt();
	        int press = 0;
	        if(fv>iv)
	        {
	            press = fv-iv;
	        }
	        else{
	            press = iv - fv;
	        }
	        System.out.println(press);
	    }
		// your code goes here
	}
}
