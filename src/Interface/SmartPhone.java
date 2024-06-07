package Interface;

public class SmartPhone extends Phone implements Camera,MusicPlayer {


@Override
public void play() {
	System.out.println("Smart Phone- Play");
	
}

@Override
public void stop() {
	
	System.out.println("Smart Phone- Stop");
}

@Override
public void click() {
	
	System.out.println("Smart Phone- Click");
}

@Override
public void video() {
	System.out.println("Smart Phone- Video");
}

@Override
public void makeCall() {
	System.out.println("Smart Phone-Make Call");
}
public void switchOff() {
	System.out.println("SmartPhone-Switch off");
}

@Override
public void sendSms() {
	System.out.println("Smart Phone- Send SMS");
}
	public static void main(String[] args) {
		SmartPhone sp= new SmartPhone();
		sp.makeCall();
		sp.switchOff();
		Camera c= new SmartPhone();
		Phone p= new SmartPhone();
		p.switchOff();
		
		

	}
}
