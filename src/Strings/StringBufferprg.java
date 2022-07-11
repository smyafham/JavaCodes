package Strings;

public class StringBufferprg {

		public static void main(String[] args) {

	String str="Good morning everyone";
	/*
	 * StringBuffer()--16 characters
	 * StringBuffer(str)
	 * 
	 * 
	 */
	//String is thread-safe
	//not much faster than string builder
	StringBuffer sb=new  StringBuffer(str);
	//is not thread safe
	StringBuilder sb3=new StringBuilder(str);
	//append()--StringBuffer

		sb.append(" ").append("Hi").append(100);
		System.out.println(sb);

		sb.insert(7, "  ");
		sb.insert(8, "XXX");
		System.out.println(sb);
		
		
		
			sb.deleteCharAt(8);
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
		//	sb.delete(0, sb.length());
			StringBuffer sb1=new StringBuffer();
			sb1.append("Good morning");
			System.out.println(sb1);
			//sb1.delete(0,sb1.indexOf(" ") );
			sb1.replace(0, 5, "");
		System.out.print(sb1);
			//System.out.println("after deleting"+ " "+sb1 +" Hi");
			//System.out.println(sb);
			
		}

	
}
