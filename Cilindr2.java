public class Cilindr2 extends Forma{

    private String nombre="Cilindro";


    private double radio;
    private double altura;


    @Override
    public double area() {
        double areasuperf= radio*radio*4*Math.PI;
        return areasuperf;
    }

    public Cilindr2 (String nombre, double radio, double altura ){

        super("Cilindro");
        this.radio=radio;
        this.altura=altura;


    }

    @Override
    public String toString() {
        return "Cilindro{" +
                " radio=" + radio +
                ", altura=" + altura +
                ", areasuperf=" + area() +
                '}';
    }
}
