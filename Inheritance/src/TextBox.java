
// Have this class inherit all features 
// we implemented in our UIControl class 
public class TextBox extends UIControl {

	private String text = "";
	
	public TextBox() {
		// Calls constructor of base class
		// Has to be first statement inside constructor
		super(true);
		System.out.println("TextBox");
	} 
	
	// Overriding toString to print text not address 
	// @Override is an annotation 
	// Annotation is a label we attach to a class member
	// With this we give extra information to the Java compiler
	// Telling the Java compiler that we overriding the toString()
	// Method in the Object class
	@Override
	public String toString() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void clear() {
		text = "";
	}

}
