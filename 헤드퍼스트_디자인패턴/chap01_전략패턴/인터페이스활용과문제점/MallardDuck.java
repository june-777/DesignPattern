package �������̽�Ȱ���������;

public class MallardDuck extends Duck implements Quackable, Flyable{
	@Override
	public void display() {
		System.out.println("��������: MallardDuck");
	}
	@Override
	public void quack() {
		System.out.println("���� �в�");
	}
	@Override
	public void fly() {
		System.out.println("���� ����~");
	}
}
