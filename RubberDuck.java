package SimUDuck;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.flyBehaviour = new FlyNoWay();
		this.quackBehaviour = new QuackWithSqueak();
	}
	
	@Override
	public void display() {
		System.out.println("RubberDuck");

	}

}
