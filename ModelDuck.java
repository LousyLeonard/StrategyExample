package SimUDuck;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		this.flyBehaviour = new FlyNoWay();
		this.quackBehaviour = new QuackNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("ModelDuck");

	}
}
