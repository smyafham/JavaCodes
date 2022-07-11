package CollectionsDemo1;


import java.util.List;

//public static final
public interface PolicyServiceProvider {

	public void addInsurance(List<Insurance> listOfInsurance);
	public List<Insurance> getAllPolicies();
	public Insurance getInsuranceById(int insuranceId);
	public Insurance removePolicy(int insuranceId);
	public List<Insurance> sortPoliciesByPolicyNumber();
	public List<Insurance> sortByName();
	public List<Insurance> updatePolicy(int insuranceId);
	
	
	
	
}