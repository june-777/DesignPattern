package ��������;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new QuackMute();
	}
	
	@Override
	public void display() {
		System.out.println("��������: DecoyDuck");
	}

}
