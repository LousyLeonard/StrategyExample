package SimUDuck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new QuackWithMouth();
	}
	
	@Override
	public void display() {
		System.out.println("MallardDuck");		
	}

}
