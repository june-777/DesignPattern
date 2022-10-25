package ��������;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWing();
		quackBehavior = new QuackSqueak();
	}
	
	@Override
	public void display() {
		System.out.println("��������: MallardDuck");
	}
	
}
