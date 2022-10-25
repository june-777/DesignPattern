package 전략패턴;

public class FlyWithWing implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("날개로 나는 중");
	}
	
}
