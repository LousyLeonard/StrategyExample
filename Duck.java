package SimUDuck;

// abstract class Duck means that no instantiation of Duck
// can ever be called. i.e. Duck duck = new Duck() 
// As it doesn't make sense to have a Duck object.
public abstract class Duck {

	// These will store objects but the attribute is declared as an interface! cool huh.
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	// Duck constructor - Im allowed! so that base classes can call .super 
	// and share a joint implementation but I can never be called else wise
	// because this is an abstract class.
	public Duck() {
		
	}
	
	// Abstract method means all classes inheriting from Duck
	// must have an implementation of display.
	public abstract void display();
	
	public void performFly() {
		// Perform fly() on the object held within flyBehaviour
		// This object must implement flyBehaviour and therefore must implement
		// an implementation of fly().
		flyBehaviour.fly();
	}
		
	public void performQuack() {
		// Same again but quack
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehaviour (FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour (QuackBehaviour qb) {
		quackBehaviour = qb;
	}
	
}
