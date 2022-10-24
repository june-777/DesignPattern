package 인터페이스활용과문제점;

public class RubberDuck extends Duck implements Quackable{
	@Override
	public void display() {
		System.out.println("오리종류: RubberDuck");
	}
	@Override
	public void quack() {
		System.out.println("오리 삑삑");
	}
	
}
