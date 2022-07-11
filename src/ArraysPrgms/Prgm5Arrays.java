package ArraysPrgms;
import java.util.Arrays;
public class Prgm5Arrays {




		public static void main(String[] args) {

	 int[] a= {10,1,30,7,7, 1,80,60,60,90};
			/*
			 * Arrays --java.util.*
			 * 
			 * 
			 */
		System.out.println("Before sorting" + " "+Arrays.toString(a));	
		Arrays.sort(a);
		System.out.println("after sorting"+ " "+Arrays.toString(a));	
			int[] result=Arrays.stream(a).distinct().toArray();
			System.out.println(Arrays.toString(result));
	   
		int[] result1=	Arrays.copyOf(result, 10);
		System.out.println(Arrays.toString(result1));
		int[] r=Arrays.copyOfRange(result, 1, 4);
	System.out.println(Arrays.toString(r));
	   Arrays.fill(result, 8);
	   System.out.println(Arrays.toString(result));
		}

	}

