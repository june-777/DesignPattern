package ��������;

public class RedHeadDuck extends Duck{

	public RedHeadDuck() {
		quackBehavior = new QuackSqueak();
		flyBehavior = new FlyWithWing();
	}
	
	@Override
	public void display() {
		System.out.println("��������: RedHeadDuck");
	}
	
}
