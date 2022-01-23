package week1.day1;

public class Mobile {
	public static void main(String[] args)
	{
		Mobile ob=new Mobile();
		ob.saveContact();
		System.out.println(ob.makeCall());
		ob.sendMsg();
	}
	private void saveContact()
	{
		String name="Rashmi";
		long mobileNumber=9007721864L;
		System.out.println(name);
		System.out.println(mobileNumber);
		
		
	}
	public long makeCall()
	{
		long mobileNumber=9007721864L;
		return mobileNumber;
	}
	void sendMsg()
	{
		String message="hello world";
		System.out.println(message);
	}
}
