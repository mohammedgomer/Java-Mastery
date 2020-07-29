// Due to it being an abstract class, 
// We cannot instantiate this class anymore
// We can only extend it, we can create new classes that derive from the UIControl
public abstract class UIControl {

	private boolean isEnabled = true;

//	public UIControl(boolean isEnabled) {
//		this.isEnabled = isEnabled;
//		System.out.println("UIControl");
//	}
	
	// Polymorphism 
	// Declare a generic method for rendering objects
	
	// Only method declaration, not implementation
	public abstract void render();

	public void enable() {
		isEnabled = true;
	}

	public void disable() {
		isEnabled = false;
	}

	public boolean isEnabled() {
		return isEnabled;
	}
}
