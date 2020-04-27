public class Quadro extends OperaDarte {
    double altezza;
    double larghezza;

    public Quadro(String titolo, String artista, double a, double l) {
    	
        super(titolo, artista);
        altezza=a;
        larghezza=l;
        
    }

    public double printingombro() {
        return altezza*larghezza;
        
    }

}
