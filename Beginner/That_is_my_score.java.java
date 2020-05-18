/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int t=sc.nextInt(); t>0 ; t--){
		    int max[] = new int[8];
		    int n = sc.nextInt();
		    int sum =0;
		    for(int i=0;i<n ;i++){
		        int q = sc.nextInt() -1;
		        int scr = sc.nextInt();
		        if(q < 8 && max[q] < scr){
		            sum  = sum - max[q] + scr;
		            max[q] = scr;
		        }
		    }
		    System.out.println(sum);
		  
		}
		
	}
}