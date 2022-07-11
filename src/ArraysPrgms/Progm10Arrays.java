package ArraysPrgms;
import java.util.Scanner;

public class Progm10Arrays {

	public static void main(String[] args) {
//{{20,30}{10,20,40,50}{1,12,3,4,5,}}
		//{{}{}{}}
int[][] num=new int[3][];
num[0]=new int[2];
num[1]=new int[4];
num[2]=new int[5];
//int count=0;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the elements into array");
for(int i=0; i<num.length; i++)
{
	for(int j=0; j<num[i].length; j++)
	{
		//num[i][j]=count++;
		num[i][j]=scanner.nextInt();
	}
}
for(int i=0; i<num.length; i++)
{
	for(int j=0; j<num[i].length; j++)
	{
		System.out.print(num[i][j]+ " ");
	}
	System.out.println();
}




	}

}