public class Rectangulo extends Forma{

    private String nombre="Rectangulo";


    private double longitud;
    private double ancho;

    @Override
    public double area() {
        double arearect=longitud * ancho;
        return arearect;
    }

    public Rectangulo(String nombre, double longitud, double ancho) {

        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +

                " longitud=" + longitud +
                ", ancho=" + ancho +
                ", area=" + area() +
                '}';
    }
}
