package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedListEx6 {
	public static void main(String[] args) {
		System.out.println("Enter number of inputs");
		int sum=0;
		Scanner s =new Scanner (System.in);
		int n =s.nextInt();
		List<Integer> l1=new ArrayList<Integer>(n);
		System.out.println("Enter input");
		for(int i=0;i<n;i++) {
			System.out.println("Input"+(i+1)+":");
			l1.add(s.nextInt());
		}
		
	//	for(int j=0;j<n;j++) {
			/*
			if((l1.get(j)==13)){
				j++;
				continue;
			}
			else {
				sum+=l1.get(j);
			}
			}*/
	   
	        if(l1.get(0)!=13)sum+=l1.get(0);
	        for(int i=1;i<l1.size();i++){
	            if(l1.get(i)==13 || l1.get(i-1)==13){
	                
	            }
	            else{
	                sum+=l1.get(i);
	            }
	        }
	        System.out.println("sum is "+sum);
		System.out.println("sum="+sum);

	}

}
