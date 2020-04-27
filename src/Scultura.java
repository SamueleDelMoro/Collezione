
public class Scultura extends Quadro {
	
	public double profondita;

	public Scultura(String titolo, String artista, double a, double l, double p) {
		super(titolo, artista, a, l);
		profondita=p;
		
		// TODO Auto-generated constructor stub
	}
	
	public double printingombro() {
        return altezza*larghezza*profondita;
        }
	
	

}
