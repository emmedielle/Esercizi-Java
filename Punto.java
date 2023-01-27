
/**
 * @author emmedielle
 *Gli oggetti della classe Punto sono punti del piano cartesiano
 *un punto ha un'ascissa X e un'ordinata Y
 */
public class Punto {
	
	//variabili di istanza
	private double X;
	private double Y;
	
	//metodi di istanza
	public double getX() {
		return X;
	}
	
	public void setX(double x) {
		X = x;
	}
	
	public double getY() {
		return Y;
	}
	
	public void setY(double y) {
		Y = y;
	}


	public String toString() {
		return "Punto [X=" + X + ", Y=" + Y + "]";
	}
	
}
