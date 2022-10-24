package 상속활용과문제점;

public class RubberDuck extends Duck{
	@Override
	public void display() {
		System.out.println("오리종류: RubberDuck");
	}
	@Override
	public void fly() {
		System.out.println("날지 못해요 ㅠㅠ");
	}
}
