package Model;

import Interface.IShape;

public class GraphicEditor {
	 
	public void DrawShape(IShape shape) {
		   System.out.println(shape.Draw());
	}
}
