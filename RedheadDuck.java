package SimUDuck;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new QuackWithMouth();
	}
	
	@Override
	public void display() {
		System.out.println("RedheadDuck");		

	}

}
