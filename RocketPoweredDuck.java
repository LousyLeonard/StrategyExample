package SimUDuck;

public class RocketPoweredDuck extends Duck {

	public RocketPoweredDuck() {
		this.flyBehaviour = new FlyWithRocket();
		this.quackBehaviour = new QuackWithMouth();
	}
	
	@Override
	public void display() {
		System.out.println("ModelDuck");

	}

}
