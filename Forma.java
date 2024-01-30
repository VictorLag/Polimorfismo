public class Forma {

    public String Nombre;

   public Forma (String nombre){
       this.Nombre=nombre;
   }

   public double area (){
       return 0;
   }


    @Override
    public String toString() {
        return "Forma{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }
}
