package LambaExpressions;

public class ServiceImp1

{

	public static void main(String[] args) {

  
		/*CustomerService service=new CustomerService() {
			
			@Override
			public void show1(String msg) {

System.out.println(msg);
				
			}
			
			@Override
			public String generatePassword(String name, long phone) {

				String s1=name.substring(2);
		    	String  s2=String.valueOf(phone);
		    	String s3=s2.substring(4);

		    			return s1+s3;
			}
		};*/
		//The target type of this expression must be functioanl interface
	//	()->{ }
		String para1="Afham";
		long para2=98765436;
		 CustomerService service=  (para, para4)->{
			 //body of the method 
			 //"abccd
			 //"12345667"
		    	String s1=para.substring(2);
		    	String  s2=String.valueOf(para4);
		    	String s3=s2.substring(4);

		    			return s1+s3;
		    	};
		    	
		    	System.out.println(service.generatePassword(para1, para2));
		// class A impelements CustomerService
		// CustomerService service=new A();
		
	//CustomerService service=(p1)-> {System.out.println(p1); };
		//    	service.show1("Hiiiii");
		  //  String password=	service.generatePassword("abcd", 123456789);
//System.out.println(password);
//service.show();
//System.out.println(service.getStatus());
	

	}

	/*@Override
	public String generatePassword(String name, long phone) {

String s1=name.substring(2);
String  s2=String.valueOf(phone);
String s3=s2.substring(4);

		return s1+s3;
	}*/
	//()->{ };
	 


	    }
