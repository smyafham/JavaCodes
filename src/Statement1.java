import java.util.Scanner;


public class Statement1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of students placed in CSE:");
		int cs=s.nextInt();
		System.out.println("enter the no of students placed in ECE:");
		int ec =s.nextInt();
		System.out.println("enter the no of students placed in MECH:");
		int me=s.nextInt();
		int max=cs;
		if (ec<0 || me <0 ||cs <0) {
			System.out.println("input is invalid");
			System.exit(0);
		}
		else {

			if(cs==ec && ec==me)
			{
				System.out.println("None of the departments have got the highest placements");
			}
			else {
				if(cs>=ec && cs>=me) {
					System.out.println("HIGHEST placement in CSE");
					if(cs==ec) {
						System.out.println("HIGHEST placement in ECE");
					}
					if(cs==me) {
						System.out.println("HIGHEST placement in MECH");
					}
				}
				else if (ec >= me) {
					System.out.println("HIGHEST placement in ECE");
					if(ec==me) {
						System.out.println("HIGHEST placement in MECH");
					}
				}

				else {
						System.out.println("HIGHEST placement in MECH");
					}

				}
			}
		}
	}


