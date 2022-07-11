package overloadingconcepts;
class Arrays{
	public void printarray(int arr[][]) {
		System.out.println("Interger Array");
		for (int i=0;i< arr.length ;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
			
		}
	}
	public void printarray(double arr[][]) {
		System.out.println("Double array");
		for (int i=0;i< arr.length ;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
			
		}
	}

	public void printarray(char arr[][]) {
		System.out.println("Character array");
		for (int i=0;i< arr.length ;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
			
		}
	}

}
public class Overloadingex1 {

	public static void main(String[] args) {
    int arr1[][]= {{1,2},{3,4},{5,6}};
    double arr2[][]= {{1.0,2.0},{3.0,4.0},{5.0,6.0}};
    char arr3[][]= {{'a','b'},{'c','d'},{'e','f'}};
    Arrays a=new Arrays();
    a.printarray(arr1);
    a.printarray(arr2);
    a.printarray(arr3);
    
	}

}
