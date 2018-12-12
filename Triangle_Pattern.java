import java.util.Scanner;
public class Triangle_Pattern 
{
    public static void main(String[] args) 
    {
        int i,j,n;
         System.out.println("Enter the Number of Rows: ");
         Scanner s = new Scanner(System.in);
         n = s.nextInt();
          for(i=0;i<n;i++){
              for(j=n-i;j>=0;j--){
                  System.out.print(" ");
                  
              }
              
              for(j=0;j<=i;j++){
			if(i%2==0)
			{
                  		System.out.print("* ");
                  	}
			else
			{
				System.out.print("$ ");
			}
              }
              System.out.println();
              
          }
    }
    
}

