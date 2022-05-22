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
	        int n = s.nextInt();
	        int count = 0;
	        int arr[] = new int[1000];
	        for(int j = 0;j<n;j++)
	        {
	            arr[i] = s.nextInt();
	            if(arr[i] >= 1000)
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
		// your code goes here
	}
}
