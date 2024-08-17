package Abstract_class;

public abstract class Car extends Vehicle {
	int hp;
	Car()
	{
		
	}
	Car(String name, int hp){
		super(name);
		this.hp=hp;
	}
	public abstract void openGate();
	public void playMusic() {
		System.out.println("Play Music in Car");
	}
	

}
