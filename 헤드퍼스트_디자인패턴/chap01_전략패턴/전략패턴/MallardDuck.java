package 전략패턴;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWing();
		quackBehavior = new QuackSqueak();
	}
	
	@Override
	public void display() {
		System.out.println("오리종류: MallardDuck");
	}
	
}
