package CollectionsDemo1;

import java.util.Comparator;
import java.util.Date;

//Comparable in java.lang
//compareTo(Object obj) ---int 
//Comparator 
//public class Insurance implements Comparable<Insurance>  {
public class Insurance  {
	//java.util.Date---that is used by java
	//java.sql.Date---uses to db server
	private int insuranceId;
	private String policyNumber;
	private String policyHolderName;
	private Date policyDate;
	public int getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public Date getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(Date policyDate) {
		this.policyDate = policyDate;
	}
	/*@Override
	public int compareTo(Insurance ins) {
      //[][][]
		//Insurance ins=(Insurance)obj;
      if(this.insuranceId < ins.insuranceId)
      {
    	  return 1;
      }
		return -1;
	}*/
	
}
