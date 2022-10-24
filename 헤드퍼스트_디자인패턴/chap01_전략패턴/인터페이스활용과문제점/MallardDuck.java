package 인터페이스활용과문제점;

public class MallardDuck extends Duck implements Quackable, Flyable{
	@Override
	public void display() {
		System.out.println("오리종류: MallardDuck");
	}
	@Override
	public void quack() {
		System.out.println("오리 꽥꽥");
	}
	@Override
	public void fly() {
		System.out.println("오리 날다~");
	}
}
