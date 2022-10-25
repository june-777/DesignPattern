package 전략패턴;

public class ClientDuck {
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck redHeadDuck = new RedHeadDuck();
		Duck rubberDuck = new RubberDuck();
		Duck decoyDuck = new DecoyDuck();
		
		System.out.println("----Mallard Duck----");
		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("----RedHead Duck----");
		redHeadDuck.display();
		redHeadDuck.swim();
		redHeadDuck.performFly();
		redHeadDuck.performQuack();
		
		System.out.println("----Rubber Duck----");
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		System.out.println("----Decoy Duck----");
		decoyDuck.performFly();
		decoyDuck.setFlyBehavior(new FlyWithWing());
		decoyDuck.performFly();
		decoyDuck.performQuack();
		decoyDuck.setQuackBehavior(new QuackSqueak());
		decoyDuck.performQuack();
		decoyDuck.setFlyBehavior(new FlyRocketPowered());
		decoyDuck.performFly();
		decoyDuck.setFlyBehavior(new FlyNoWay());
		decoyDuck.performFly();
	}
}
