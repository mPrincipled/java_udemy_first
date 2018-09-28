package email_app;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Email email1 = new Email("John", "Smith");
		email1.setMailboxCapacity(200);
		email1.changePassword("111");
		email1.setAlternateEmail("hello@aa.aa");;
		email1.getAlternateEmail();
		
		System.out.println(email1.getInfo());
		
	}

}
