
public class Main {

	public static void main(String[] args) {

//		
//		var point1 = new Point(1,2);
//		var point2 = new Point(1,2);

		// At compile time we have declared this array of UIControls 
		// Inserting different objects into array - A TextBox, A CheckBox
		UIControl[] controls = { new TextBox(), new CheckBox() };
		// When we iterate over this array we are dealing with different types
		// Of objects
		for (UIControl control : controls) {
		// Polymorphism in action
		// Each object has it's own render method 
		// The control object we are working with is taking many different forms
			control.render();
		}
		// Won't return true because its not the coordinates that are stored (1,2)
		// These are both reference types and the values stored are the address of point
		// Object in memory

//		System.out.println(point1.equals(point2));
//		System.out.println(point1.hashCode());
//		System.out.println(point2.hashCode());

		// TODO Auto-generated method stub
//		var control = new TextBox();
//		control.disable();
//		System.out.println(control.isEnabled());

		// When we call the TextBox method
		// Because it extends the UIControl class
		// The UIControl constructor will also be called
//		var textBox = new TextBox();
//		textBox.setText("Hello World");
//		System.out.println(textBox);
//
//		var control = new UIControl(true);
//		var textBox = new TextBox();
//		// show(control);
//		// Upcasting
//		show(textBox);

	}

//	public static void show(UIControl control) {
//		// Downcasting
//		if (control instanceof TextBox) {
//			var textBox = (TextBox) control;
//			textBox.setText("Hello World");
//		}
//
//		System.out.println(control);
//	}

}
