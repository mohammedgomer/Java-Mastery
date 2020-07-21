
public class TextBox {
	public String text = ""; // Field

	public void setText(String text) {
		this.text = text;
	}

	// Don't need to use the this. keyword here, as we don't have a text parameter
	public void clear() {
		text = "";
	}

}