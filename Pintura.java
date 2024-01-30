public class Pintura {

    private double cobertura;


    public double cubrirpintura (Forma forma){
        return forma.area()/cobertura;
    }


    public Pintura (double cobertura){
        this.cobertura=cobertura;

    }

}
