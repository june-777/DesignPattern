package 전략패턴;


public abstract class Duck {
	
	//상태
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	//행동(역할)
	public void swim() {
		System.out.println("수영 중");
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
