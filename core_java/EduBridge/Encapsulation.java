package EduBridge;

public class Encapsulation {

	public static void main(String[] args) {
		
		OnlineBanking o = new OnlineBanking();
		o.setAcc_balance(50000);
        System.out.println(o.getAcc_balance());
	}
}
class OnlineBanking{
	private String acc_holder_name = "RAKHI";
	private long acc_number = 124367623;
	private String ifsc = "SBIN003467";
	private int acc_balance = 10000;
	
	
	
    public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public long getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}
	public String getAcc_holder_name() {
		return acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	
	
}
