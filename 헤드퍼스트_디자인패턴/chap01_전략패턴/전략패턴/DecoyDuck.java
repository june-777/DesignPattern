package 전략패턴;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new QuackMute();
	}
	
	@Override
	public void display() {
		System.out.println("오리종류: DecoyDuck");
	}

}
