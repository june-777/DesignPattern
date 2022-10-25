package 전략패턴;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("날 수 없어요 ㅠㅠ");
	}
}
