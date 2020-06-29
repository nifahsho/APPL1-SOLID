package Main;

import Model.Circle;
import Model.GraphicEditor;
import Model.Rectangle;
import Model.Square;

public class main {
	
	public static void main (String args[]) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		GraphicEditor graphiceditor = new GraphicEditor();
		graphiceditor.DrawShape(rectangle);
		graphiceditor.DrawShape(square);
		graphiceditor.DrawShape(circle);
	}
	
}
