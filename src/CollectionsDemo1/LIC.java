package CollectionsDemo1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LIC implements PolicyServiceProvider {

	List<Insurance> listOfInsurance;
	@Override
	public void addInsurance(List<Insurance> listOfInsurance) {

    this.listOfInsurance=listOfInsurance;
		}

	@Override
	public List<Insurance> getAllPolicies() {
		// TODO Auto-generated method stub
		return listOfInsurance;
	}

	@Override
	public Insurance getInsuranceById(int insuranceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Insurance removePolicy(int insuranceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Insurance> sortPoliciesByPolicyNumber() {
  
		
		ArrayList<Integer> al=new ArrayList();
		al.add(1);
		al.add(45);
		al.add(7);
		Collections.sort(al);
		System.out.println(al);
		//Collections in java.util.
		//Arrays
		//Collections.sort(listOfInsurance);
		 Collections.sort(listOfInsurance,new SortByNumber());
		 

		return  listOfInsurance;
	}

	@Override
	public List<Insurance> updatePolicy(int insuranceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Insurance> sortByName() {

  Collections.sort(listOfInsurance, new SortByPolicyName());
		return null;
	}

}