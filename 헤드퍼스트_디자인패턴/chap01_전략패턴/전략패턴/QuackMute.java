package 전략패턴;

public class QuackMute implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("소리 못내요 ㅠㅠ");
	}
}
