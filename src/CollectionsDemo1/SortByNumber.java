package CollectionsDemo1;


import java.util.Comparator;

public class SortByNumber  implements Comparator<Insurance> {

	@Override
	public int compare(Insurance o1, Insurance o2) {

     if(o1.getInsuranceId() < o2.getInsuranceId())
     {
    	 return 1;
     }
		return -1;
}
}