package �������̽�Ȱ���������;

public class Main {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		RedheadDuck redheadDuck = new RedheadDuck();
		
		System.out.println("----MallardDuck----");
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		mallardDuck.fly();
		
		System.out.println("----RedHeadDuck----");
		redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.display();
		redheadDuck.fly();
		
		RubberDuck rubberDuck = new RubberDuck();
		System.out.println("----RubberDuck----");
		rubberDuck.display();
		rubberDuck.quack();
//		rubberDuck.fly(); //�������� ���� ���ϹǷ� Flyable ���� X
	}
}
