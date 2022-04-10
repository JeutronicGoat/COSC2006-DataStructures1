
public class Square extends Rectangle{

	private static final long serialVersionUID = 1L;


	public Square() {
		setSize(1);
	}
	
	public Square(String color, boolean isFilled, int size) {
		super(color, isFilled, size, size);
	}
	
	public int getSize() { 
		return super.getWidth();
	}
	
	public void setSize(int size) {
		super.setHeight(size);
		super.setWidth(size);
	}
	
	@Override
	public String toString() {
		return "Square: size x size " ;
	}
	
}
