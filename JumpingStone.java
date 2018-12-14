//program by me to get Number of jumps you need to reach a particular number
//for example 1,(2,3),(4,5),(6,7),(8,9)
//So the pair is considered as single stone
//if you press 5 you will get 2 jumps as output 
import java.util.Scanner;
public class JumpingStone 
{
    public static void main(String[] args) 
    {
        int i,j,x,c=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Last Number= ");
        j = sc.nextInt();
        
	System.out.println("Number on which to jump on= ");
        x = sc.nextInt();
        
	if(x<j&&x>1)
	{
	for(i=1;i<j;i++)
        {
            	if(i==x)
            	{
            	   break;
            	}
            	else
            	{
                c++;
	        }
	}
    
	
	        if(x%2==0 || (x==j))
		{
	            System.out.println("Total jumps you have to take= \n" + (c/2+1));
	        }
	        else
	        {
	            System.out.println("Total jumps you have to take= \n" + (c/2));
	        }
	}
	else if(x>j||x<1)
	{System.out.println("Invalid Request");}
    }
}

