import java.util.Scanner;

public class TestTriangolo {
	
	public static void main(String[] args) {
		
		//predisposizione oggetto input da tastiera
		Scanner keyb = new Scanner(System.in);
		
		//input coordinate punto A
		System.out.println("Inserisci ascissa punto A");
		double Ax = keyb.nextDouble();
		System.out.println("Inserisci ordinata punto A");
		double Ay = keyb.nextDouble();
		
		//crea punto A
		Punto A = new Punto();
		A.setX(Ax);
		A.setY(Ay);
		System.out.print("A: ");
		System.out.println(A.toString());
		
		//input coordinate punto B
		System.out.println("Inserisci ascissa punto B");
		double Bx = keyb.nextDouble();
		System.out.println("Inserisci ordinata punto B");
		double By = keyb.nextDouble();
		
		//crea punto P2
		Punto B = new Punto();
		B.setX(Bx);
		B.setY(By);
		System.out.print("B: ");
		System.out.println(B.toString());
		
		//input coordinate punto C
		System.out.println("Inserisci ascissa punto C");
		double Cx = keyb.nextDouble();
		System.out.println("Inserisci ordinata punto C");
		double Cy = keyb.nextDouble();
				
		//crea punto C
		Punto C = new Punto();
		C.setX(Cx);
		C.setY(Cy);
		System.out.print("C: ");
		System.out.println(C.toString());
		
		//crea segmento AB
		Segmento AB = new Segmento();
		AB.setP1(A);
		AB.setP2(B);
		System.out.print("AB: ");
		System.out.println(AB.toString());
		
		System.out.println("Lunghezza di AB = "+AB.getLunghezza());
		System.out.println("Punto medio di AB: "+AB.getPM().toString());
		
		
		//crea segmento BC
		Segmento BC = new Segmento();
		BC.setP1(B);
		BC.setP2(C);
		System.out.print("BC: ");
		System.out.println(BC.toString());
				
		System.out.println("Lunghezza di BC = "+BC.getLunghezza());
		System.out.println("Punto medio di BC: "+BC.getPM().toString());
		
		
		//crea segmento AC
		Segmento AC = new Segmento();
		AC.setP1(A);
		AC.setP2(C);
		System.out.print("AC: ");
		System.out.println(AC.toString());
						
		System.out.println("Lunghezza di AC = "+AC.getLunghezza());
		System.out.println("Punto medio di AC: "+AC.getPM().toString());
		
		//crea triangolo ABC
		Triangolo ABC = new Triangolo();
		ABC.setLato1(AB);
		ABC.setLato2(BC);
		ABC.setLato3(AC);
		if (!ABC.isTriangle())
			System.out.println("ABC è un triangolo degenere!");
		else {
			System.out.print("ABC: ");
			System.out.println(ABC.toString());
			
			System.out.println("Perimetro = "+ABC.getPerimetro());
			System.out.println("Area = "+ABC.getArea());
		}	
	}

}
