package Interface;

abstract class Phone {
	
	abstract public void makeCall() ;
	abstract public void sendSms();
	
	public void switchOff() {
		System.out.println("Phone- switch off");
	}

}
