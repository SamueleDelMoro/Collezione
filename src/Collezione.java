
public class Collezione{
	
	public static void main(String[] args) {
		
		OperaDarte op[]= new OperaDarte[3];
		
		
		Quadro q = new Quadro("CazzoConLe", "Samuele", 1.3, 1.7);
		Scultura s = new Scultura("Antonio", "Matteo", 2.5, 1.1, 0.50);
		Quadro q2 = new Quadro("Cazzo", "Samuele", 1.3, 1.7);
		
		op[0]= q;
		op[1]=s;
		op[2]=q2;
		
		
		
		
		for(int i=0; i<3; i++) {
			System.out.println("il nome dell opera d arte è : " + op[i].titolo + "l'ingombro è : "+ op[i].printingombro() );
		}
		
		
	}

}
