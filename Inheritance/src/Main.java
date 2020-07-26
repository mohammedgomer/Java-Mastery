
public class Main {

	public static void main(String[] args) {
		var Dog = new Dog();
//		
//		var point1 = new Point(1,2);
//		var point2 = new Point(1,2);
		
		UIControl[] controls = {new TextBox(), new CheckBox()};
		for(UIControl control: controls) {
			// if control is TextBox 
			// renderTextBox
			// else if it is a ChecjBox 
			// renderCheckBox
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
