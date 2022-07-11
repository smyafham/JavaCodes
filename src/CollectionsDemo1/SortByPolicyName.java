package CollectionsDemo1;

import java.util.Comparator;

public class SortByPolicyName implements Comparator<Insurance> {

	@Override
	public int compare(Insurance o1, Insurance o2) {
		if(o1.getPolicyNumber().compareTo(o2.getPolicyNumber())==1)
		{
			return 1;
		}
		return -1;
	}

}