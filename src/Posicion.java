
public class Posicion {
	private int x = 0;
	private int y = 0;
	private int y2 = 0;
	private int x2=0;
	
	
	public Posicion(int x, int y,int x2, int y2) {
		super();
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}
	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
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
		return "Posicion [x=" + x + ", y=" + y + "]";
	}

}
