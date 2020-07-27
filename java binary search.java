package HelloJava;

import java.util.*;

public class HelloJava {

	public static void main(String[] args){

		
		Scanner scan = new Scanner(System.in);
		int a[]=new int[20];
		int i,num,n,temp,j,mid,beg,end,flag=0;
		
	    System.out.println("Enter number of inputs");
	     n=scan.nextInt();
	     System.out.println("Enter array");
      for(i=0;i<n;i++)
      {
    	  System.out.println("ELEMENT->");
    	  a[i]=scan.nextInt();
      }
      for(i=1;i<n;i++)
      {
    	  for(j=0;j<n-1;j++)
    	  {
    		  if(a[j]>a[j+1])
    		  {
    			  temp=a[j];
    			  a[j]=a[j+1];
    			  a[j+1]=temp;
    		  }
    	  }
      }
      System.out.println("Sorted array will be");
      for(i=0;i<n;i++)
      {
    	  System.out.println("data->"+a[i]);
      }
      System.out.println("Enter element you want to search");
         num=scan.nextInt();
        beg=0;
        end=n-1;
        
        while(beg<=end)
        {
        	mid=(beg+end)/2;
        	if(a[mid]==num)
        	{
        		flag=1;
        		System.out.println("element is found at position "+mid);
        		System.out.println("element will be "+a[mid]);
        		break;
        	}
        	else if(a[mid]>num)
        	{
        		end=mid-1;
        	}
        	else if(a[mid]<num)
        	{
        		beg=mid+1;
        	}
        }
        if(flag==0)
        {
        	System.out.println("element is not found in array");
        }
        
	}
}