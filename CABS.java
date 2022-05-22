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
	        int cab1 = s.nextInt();
	        int cab2 = s.nextInt();
	        if(cab1<cab2)
	        {
	            System.out.println("FIRST");
	        }
	        else if(cab2<cab1)
	        {
	            System.out.println("SECOND");
	        }
	        else
	        {
	            System.out.println("ANY");
	        }
	    }
		// your code goes here
	}
}
