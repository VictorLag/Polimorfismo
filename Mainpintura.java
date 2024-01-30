public class Mainpintura {
    public static void main(String[] args) {

         Pintura pintura=new Pintura(250);

         Forma esf=new Esfera("Esfera",15);
         System.out.println(esf);
         System.out.println("Metros² de pintura usados = "+ pintura.cubrirpintura(esf)+" m²");

         Forma rect=new Rectangulo("Rectangulo",20,35);
         System.out.println(rect);
         System.out.println("Metros² de pintura usados = "+ pintura.cubrirpintura(rect)+" m²");

         Forma cilind=new Cilindr2("Cilindro",10,30);
         System.out.println(cilind);
         System.out.println("Metros² de pintura usados = "+ pintura.cubrirpintura(cilind)+" m²");

    }
}