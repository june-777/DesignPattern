package 인터페이스활용과문제점;

public class RedheadDuck extends Duck implements Quackable, Flyable{
	@Override
	public void display() {
		System.out.println("오리종류: RedheadDuck");
	}
	@Override
	public void fly() {
		System.out.println("오리 날다~");
	}
	@Override
	public void quack() {
		System.out.println("오리 꽥꽥");
	}
}
