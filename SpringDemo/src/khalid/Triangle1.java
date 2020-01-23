package khalid;


/**
 * @author KHALID
 *
 */
public class Triangle1 {
	
	private Polint pointA;
	private Polint pointB;
	private Polint pointC;
	
	public Polint getPointA() {
		return pointA;
	}

	public void setPointA(Polint pointA) {
		this.pointA = pointA;
	}

	public Polint getPointB() {
		return pointB;
	}

	public void setPointB(Polint pointB) {
		this.pointB = pointB;
	}

	public Polint getPointC() {
		return pointC;
	}

	public void setPointC(Polint pointC) {
		this.pointC = pointC;
	}

	public void dreaw() {
		System.out.println("Point A=(" +getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point A=(" +getPointB().getX()+","+getPointB().getY() + ")");
		System.out.println("Point A=(" +getPointA().getX()+","+getPointA().getY()+")");
		
	}

}
