package �������̽�Ȱ���������;

public class RedheadDuck extends Duck implements Quackable, Flyable{
	@Override
	public void display() {
		System.out.println("��������: RedheadDuck");
	}
	@Override
	public void fly() {
		System.out.println("���� ����~");
	}
	@Override
	public void quack() {
		System.out.println("���� �в�");
	}
}
