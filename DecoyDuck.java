package SimUDuck;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new QuackNoWay();
	}

	@Override
	public void display() {
		System.out.println("DecoyDuck");
	}

}
