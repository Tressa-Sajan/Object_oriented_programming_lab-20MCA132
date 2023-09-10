//4. Read a matrix from the console and check whether it is symmetric or not.
import java.util.*;
public class program4
{
	public static void main(String args[])
	{
	 Scanner a= new Scanner(System.in);
	 int i,j,flag=0;
	 System.out.print("\nEnter the number of rows: ");
	 int r=a.nextInt();
	 System.out.print("Enter the number of columns: ");
	 int c=a.nextInt();
	 System.out.println("Enter the elements of the matrix 1: ");
	 int matrix1[][]=new int[r][c];
	 
	 for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	matrix1[i][j]=a.nextInt();	 
		 }
		}
		
	System.out.println("\nMatrix 1 is:");	
	for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	System.out.print(matrix1[i][j]+"\t");	
		 }
		 System.out.println(" ");	
		}
    System.out.println("\nTranspose of Matrix 1 is:");	
	for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	System.out.print(matrix1[j][i]+"\t");	
		 }
		 System.out.println(" ");
		}	
    for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {		
			if(matrix1[i][j]!=matrix1[j][i])	
				{
					flag=1;
					break;
				}
			
		}}
		if(flag==0)	
				{
						System.out.print("\nMatrix is symmetric\n");	
				}
		else
		{
			System.out.print("\nMatrix is non symmetric\n");
		}
	}
}	