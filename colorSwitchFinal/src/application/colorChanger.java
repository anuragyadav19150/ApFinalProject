package application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
public class colorChanger {
	private int x_coord,y_coord;
	Circle changer;
	
	public colorChanger(int x,int y)
	{
		this.x_coord=x;
		this.y_coord=y;
		this.changer=new Circle(10,Color.BLACK);
		this.changer.relocate(x, y);
	}

	public int getX_coord() {
		return x_coord;	
	}

	public void setX_coord(int x_coord) {
		this.x_coord = x_coord;
		this.changer.relocate(this.x_coord, this.y_coord);
	}

	public int getY_coord() {
		return y_coord;
	}

	public void setY_coord(int y_coord) {
		this.y_coord = y_coord;
		this.changer.relocate(this.x_coord, this.y_coord);
	}
}