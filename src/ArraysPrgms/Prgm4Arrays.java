package ArraysPrgms;

import java.util.Scanner;


/*
 * .Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order

 

Method Name

modifyArray

Method Description

Remove duplicates

Argument

int []

Return Type

int []

Logic

Remove the duplicate elements in the array and sort it in descending order

 
 * for (int i = 0; i < marks.length; i++) {    
            for (int j = i+1; j < marks.length; j++) {    
               if(marks[i] > marks[j]) {   
                   temp = marks[i];   
                   marks[i] = marks[j];   
                   marks[j] = temp;   
               }    
              
            }    
 * Arrays.sort(marks)
 * a={1,2,3,4,5,}

 


int[] temp = new int[a.length];
        int j = 0;
  
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 */
public class Prgm4Arrays {
static void removeDub(int[] arr) {
	
	int[] temp = new int[arr.length];
    int j = 0;

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] != arr[i + 1]) {
            temp[j++] = arr[i];
        }
    }

    temp[j++] = arr[arr.length - 1];

    // Changing the original array
    for (int i = 0; i < j; i++) {
        arr[i] = temp[i];
    }
    
    
    for (int x = 0; x < arr.length; x++) {    
        for (int y = y+1; j < arr.length; y++) {    
           if(arr[x] > arr[y]) {   
               temp = arr[x];   
               arr[x] = arr[y];   
               arr[y] = temp;   
           }    
          
        }  
	}
	//for(int i:arr)
		//System.out.println(i);
	
}
	public static void main(String[] args) {
System.out.println("Enter array length");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println("Enter array");
int[] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
removeDub(arr);

	}

}
