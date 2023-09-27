package practice;

//public class Account implements Comparable<Account>{
//	int number;
//	int zandaka;
//	String strNumber;
//	String strZandaka;
//	
//	public int compareTo(Account obj){
//		if(this.number < obj.number) {
//			return -1;
//		}
//		if(this.number > obj.number) {
//			return 1;
//		}
//		return 0;
//	}
//	
//	public String toString() {
//		strNumber =  String.valueOf(this.number);
//		strZandaka = String.valueOf(this.zandaka);
//		return "number="+strNumber+"zandaka"+strZandaka;
//	}
//}
public class Account {
	private  String accountNo;
	private int Zandaka;
	private AccountType accountType;
	public static final int FUTSU = 1;
	public static final int TOUZA = 2;
	public static final int TEIKI = 3;
	public Account(String aNo, AccountType aType) {
		
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getZandaka() {
		return Zandaka;
	}
	public void setZandaka(int zandaka) {
		Zandaka = zandaka;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	
}

