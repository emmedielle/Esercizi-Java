
/**
 * @author emmedielle
 *Un oggetto della classe Segmento è un segmento nel piano cartesiano
 *un segmento ha due estremi che sono due punti
 */

public class Segmento {
	
	//variabili di istanza
	private Punto P1;
	private Punto P2;
	
	//metodi di istanza
	public Punto getP1() {
		return P1;
	}
	public void setP1(Punto p1) {
		P1 = p1;
	}
	public Punto getP2() {
		return P2;
	}
	public void setP2(Punto p2) {
		P2 = p2;
	}
	
	public String toString() {
		return "Segmento [P1=" + P1 + ", P2=" + P2 + "]";
	}
	
	public double getLunghezza() {
		return Math.sqrt((P1.getX()-P2.getX())*(P1.getX()-P2.getX())+(P1.getY()-P2.getY())*(P1.getY()-P2.getY()));
	}
	
	public Punto getPM() {
		double PMx=(P1.getX()+P2.getX())/2;
		double PMy=(P1.getY()+P2.getY())/2;
		Punto PM = new Punto();
		PM.setX(PMx);
		PM.setY(PMy);
		return PM;
	}

}
