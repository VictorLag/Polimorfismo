public class Esfera extends Forma {


    private double radio;


    @Override
    public double area() {
        double areasuperf=radio*radio*4*Math.PI;
        return areasuperf;
    }

    public Esfera (String nombre, double radio){

        super(nombre);
        this.radio=radio;

    }

    @Override
    public String toString() {
        return "Esfera{" +
                " radio=" + radio +
                " area superficie= "+ area()+
                '}';
    }
}
