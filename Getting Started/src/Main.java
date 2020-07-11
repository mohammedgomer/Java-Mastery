import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
Date now = new Date();
System.out.println(now);

Point point1 = new Point(1,1);
Point point2 = point1;
point1.x = 2;
System.out.println(point2);

String message = "Hello World" + "!!";

System.out.println(message.replace("!", "*"));
int[] numbers = {1,2,3,4,5};
System.out.println(Arrays.toString(numbers));
}
}
