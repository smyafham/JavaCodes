package t1;

/*
 * Customer module (component)
 * name
 * phone
 * mail
 * custid
 * pincode
 * 
 * 
 * many servers
 * server1
 * bookTicket
 * server 2
 * take payement
 * server3
 * generate bill
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.Serializable;
/*
 * interface Serilizable
 * {
 * 
 * }
 * if(cobj1 instanceOf Serilizable)
 * {
 * 
 * }
 * 
 * 
 */
public class Customer implements Serializable {
	private String cname;
	private long cphone;
	private String cemail;
	public Customer(String cname, long cphone, String cemail) {
		super();
		this.cname = cname;
		this.cphone = cphone;
		this.cemail = cemail;
	}
	public String getCname() {
		return cname;
	}
	public long getCphone() {
		return cphone;
	}
	public String getCemail() {
		return cemail;
	}
	

}