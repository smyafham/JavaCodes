package ArraysPrgms;

public class Prgm1Arrays {
	public static void main(String[] args) {
        //0    1   2   3   4
		//[50][80][70][40][100]
		int[] marks={50,80,70,40,100};
		System.out.println(marks.length);
		System.out.println(marks[0] + " "+marks[3]);
		/*int i=0;
		while(i<marks.length)
		{
			System.out.println(marks[i]);
			i++;
		}*/
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
			if(i==2)
			{
				break;
			}
			
		}
		System.out.println("Thank you");

	}

}
