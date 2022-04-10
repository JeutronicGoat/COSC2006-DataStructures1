import java.io.Serializable;

public class MyPoint implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int x = 0;
	private int y = 0;
	
	public MyPoint(int x, int y) {
		if(x >= 0) this.x = x;
		if(y >= 0) this.y = y;
	}
	
	public boolean equals(Object o) {
		if(o instanceof MyPoint) {
			o = ((MyPoint) o);
			if(((MyPoint) o).x == x && ((MyPoint) o).y == y) {
				return true;
			}
		}
		return false;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}
