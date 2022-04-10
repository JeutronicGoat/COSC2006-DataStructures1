
public class TestGeoObjects {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle();							//deault
		Rectangle rec2 = new Rectangle("blue", false, -3, -2);		//default width/height
		Rectangle rec3 = new Rectangle("green", true, 4, 3);

		Square sqr1 = new Square();
		Square sqr2 = new Square("red", false, 8);
		Square sqr3 = new Square("purple", true, 5);
		
		
		//check rectangle defaults
		if( !rec1.getColor().equals("black") ||
			!rec1.isFilled() ||
			rec1.getWidth()!=1 ||
			rec1.getHeight()!=2 ){
			System.out.println("Issue with rectangle 1");
		}
		
		//check rectangle specific creation values 
		if( !rec2.getColor().equals("blue") ||
			rec2.isFilled() ||
			rec2.getWidth()!=1 ||
			rec2.getHeight()!=2 ){
			System.out.println("Issue with rectangle 2");
		}
		if( !rec3.getColor().equals("green") ||
			!rec3.isFilled() ||
			rec3.getWidth()!=4 ||
			rec3.getHeight()!=3 ){
				System.out.println("Issue with rectangle 3");
		}
		
		
		//check rectangle positive width / height
		int oldWidth = rec2.getWidth();
		int oldHeight = rec2.getHeight();
		rec2.setWidth(-3);
		rec2.setHeight(-4);
		if(rec2.getWidth() != oldWidth || rec2.getHeight() != oldHeight)
			System.out.println("Issue setting negative rectangle width/height values");
		
		rec2.setWidth(2);
		rec2.setHeight(6);
		if(rec2.getWidth() != 2 || rec2.getHeight() != 6)
			System.out.println("Issue setting positive rectangle width/height values");
		
		
		
		//check rectangle area and perimeter
		if(rec1.getArea() != 2 || rec2.getArea() != 12 || rec3.getArea() != 12){
			System.out.println("Issue with area calculation!");
		}
		if(rec1.getPerimeter() != 6 || rec2.getPerimeter() != 16 || rec3.getPerimeter() != 14){
			System.out.println("Issue with area calculation!");
		}
		
		//check rectangle compareTo
		if(rec1.compareTo(rec2)>=0 || rec2.compareTo(rec3)!=0 || rec3.compareTo(rec1)<=0){
			System.out.println("Issue with rectangle compare");
		}
		
		
		//check rectangle equals / notEquals
		if(rec1.equals(rec2) || rec2.equals(rec3) || rec3.equals(rec1)){
			System.out.println("In-equality issues");
		}
		rec2.setWidth(3);
		rec2.setHeight(4);
		if(!rec2.equals(rec3)){
			System.out.println("Equality issues");
		}
	
		//check MyPoint equal / notEqual
		if(	!rec1.getLocation().equals(rec2.getLocation()) ||
			!rec1.getLocation().equals(rec2.getLocation())){
			System.out.println("MyPoint equality issue");
		}
		rec1.getLocation().setX(-10);
		rec1.getLocation().setY(-5);
		if(	rec1.getLocation().getX() != 0 ||
			rec1.getLocation().getY() != 0){
			System.out.println("Issue with setting negative MyPoint values!");
		};
		//check MyPoint positive x & y
		rec1.getLocation().setX(10);
		rec1.getLocation().setY(5);
		if(	rec1.getLocation().getX() != 10 ||
			rec1.getLocation().getY() != 5){
			System.out.println("Issue with setting negative MyPoint values!");
		};
		
		
		
		//check square defaults
		if( !sqr1.getColor().equals("black") ||
				!sqr1.isFilled() ||
				sqr1.getWidth()!=1 ||
				sqr1.getHeight()!=1 ||
				sqr1.getSize() != 1){
				System.out.println("Issue with square 1");
			}
		
		//check square sepcific values
		if( !sqr2.getColor().equals("red") ||
			sqr2.isFilled() ||
			sqr2.getWidth() != 8 ||
			sqr2.getHeight() != 8 ||
			sqr2.getSize() != 8){
				System.out.println("Issue with square 2");
			}
			if( !sqr3.getColor().equals("purple") ||
				!sqr3.isFilled() ||
				sqr3.getWidth() !=5 ||
				sqr3.getHeight() !=5 ||
				sqr3.getSize() != 5){
					System.out.println("Issue with square 3");
			}
		
		
		//chech width/height stay same
		sqr3.setWidth(4);	
		if( sqr3.getWidth() != 4 ||
			sqr3.getHeight() != 4 ||
			sqr3.getSize() != 4){
			System.out.println("Issue setting width staying same");
		}
		sqr3.setHeight(7);	
		if( sqr3.getWidth() != 7 ||
			sqr3.getHeight() != 7 ||
			sqr3.getSize() != 7){
			System.out.println("Issue setting height staying same");
		}
			
		//check set/get Size
		sqr3.setSize(10);	
		if( sqr3.getWidth() != 10 ||
			sqr3.getHeight() != 10 ||
			sqr3.getSize() != 10){
			System.out.println("Issue setting size keeping width/height same");
		}
		
		//print the rectangles and squares
		System.out.println("Rec1 - " + rec1);
		System.out.println("Rec2 - " + rec2);
		System.out.println("Rec3 - " + rec3);
	}

}
