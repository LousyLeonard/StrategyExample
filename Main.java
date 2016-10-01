package SimUDuck;

public class Main {

	public static void main(String[] args) {

		MallardDuck malDuck1 = new MallardDuck();
		malDuck1.display();
		malDuck1.performFly();
		malDuck1.performQuack();
		System.out.println();
		
		/** boring examples!
		RedheadDuck redDuck1 = new RedheadDuck();
		redDuck1.display();
		redDuck1.performFly();
		redDuck1.performQuack();
		System.out.println();

		DecoyDuck decoyDuck1 = new DecoyDuck();
		decoyDuck1.display();
		decoyDuck1.performFly();
		decoyDuck1.performQuack();
		System.out.println();
		
		ModelDuck modelDuck1 = new ModelDuck();
		modelDuck1.display();
		modelDuck1.performFly();
		modelDuck1.performQuack();
		System.out.println();
		*/
		
		RubberDuck rubberDuck1 = new RubberDuck();
		rubberDuck1.display();
		rubberDuck1.performFly();
		rubberDuck1.performQuack();
		System.out.println();
		
		RocketPoweredDuck rocketDuck1 = new RocketPoweredDuck();
		rocketDuck1.display();
		rocketDuck1.performFly();
		rocketDuck1.performQuack();
		System.out.println();
		
		// Now lets shove a rocket on our Mallard duck for science
		// This affect malduck1 only and not future MallardDucks
		malDuck1.setFlyBehaviour(new FlyWithRocket());
		malDuck1.display();
		malDuck1.performFly();
		malDuck1.performQuack();
		System.out.println();
	}

}
