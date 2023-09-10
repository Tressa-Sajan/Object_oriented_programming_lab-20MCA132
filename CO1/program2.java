import java.util.*;
public class program2
{
	public static void main(String args[])
	{
	 Scanner a= new Scanner(System.in);
	 int i,j;
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
		
	System.out.println("Matrix 1 is:");	
	for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	System.out.print(matrix1[i][j]+"\t");	
		 }
		 System.out.println("\n");	
		}
		System.out.print("Enter the elements of the matrix 2:");
		int matrix2[][]=new int[r][c];
	 
	 for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	matrix2[i] [j]=a.nextInt();	 
		 }
		}
		
	System.out.println("Matrix 2 is:");	
	for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	System.out.print(matrix2[i][j]+"\t");	
		 }
		System.out.println("\n");
		}
	System.out.println("Sum of two matrix is:");
	int matrix3[][]=new int[r][c];
for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
		 }
		}	
		for(i=0;i<r;i++)
		{
		 for(j=0;j<c;j++)
		 {
           	System.out.print(matrix3[i][j]+"\t");	
		 }
			System.out.println("\n");
		}
	}
}