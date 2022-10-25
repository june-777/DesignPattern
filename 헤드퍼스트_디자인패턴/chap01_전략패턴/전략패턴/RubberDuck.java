package 전략패턴;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new QuackMute();
	}
	
	@Override
	public void display() {
		System.out.println("오리종류: RubberDuck");
	}
	
}
