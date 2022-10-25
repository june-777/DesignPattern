package 전략패턴;

public class RedHeadDuck extends Duck{

	public RedHeadDuck() {
		quackBehavior = new QuackSqueak();
		flyBehavior = new FlyWithWing();
	}
	
	@Override
	public void display() {
		System.out.println("오리종류: RedHeadDuck");
	}
	
}
