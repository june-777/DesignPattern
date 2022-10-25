package ��������;


public abstract class Duck {
	
	//����
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	//�ൿ(����)
	public void swim() {
		System.out.println("���� ��");
	}
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
