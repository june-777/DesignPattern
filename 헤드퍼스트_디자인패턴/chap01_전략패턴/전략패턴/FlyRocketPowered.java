package 전략패턴;

public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("로킷으로 나는 중");
	}
}
