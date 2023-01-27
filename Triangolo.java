

/**
 * @author emmedielle
 *un oggetto della classe Triangolo è un triangolo nel piano cartesiano
 *un triangolo ha tre lati che sono tre segmenti nel piano
 */

public class Triangolo {
	
	//variabili di istanza
	public Segmento Lato1;
	public Segmento Lato2;
	public Segmento Lato3;
	
	//metodi di istanza
	public Segmento getLato1() {
		return Lato1;
	}
	public void setLato1(Segmento lato1) {
		Lato1 = lato1;
	}
	public Segmento getLato2() {
		return Lato2;
	}
	public void setLato2(Segmento lato2) {
		Lato2 = lato2;
	}
	public Segmento getLato3() {
		return Lato3;
	}
	public void setLato3(Segmento lato3) {
		Lato3 = lato3;
	}
	
	public String toString() {
		return "Triangolo [Lato1=" + Lato1 + ", Lato2=" + Lato2 + ", Lato3=" + Lato3 + "]";
	}
	
	public boolean isTriangle() {
		if (Lato1.getLunghezza()<Lato2.getLunghezza()+Lato3.getLunghezza() &&
		Lato2.getLunghezza()<Lato1.getLunghezza()+Lato3.getLunghezza() &&
		Lato3.getLunghezza()<Lato1.getLunghezza()+Lato2.getLunghezza())
			return true;
		else
			return false;
	}
	
	public double getPerimetro() {
		return Lato1.getLunghezza()+Lato2.getLunghezza()+Lato3.getLunghezza();
	}
	
	public double getArea() {
		double p2 = getPerimetro()/2;
		return Math.sqrt(p2*(p2-Lato1.getLunghezza())*(p2-Lato2.getLunghezza())*(p2-Lato3.getLunghezza()));
	}
	
	

}
