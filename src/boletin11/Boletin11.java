
package boletin11;


public class Boletin11 {

   
    public static void main(String[] args) {
        Seleccion obj=new Seleccion(325,24,"Luis","Fernando");
       Xogador obj1=new Xogador(56,"Extremo",325,24,"Luis","Fernando");
       Adestrador obj2=new Adestrador("A52",421,42,"Jaime","Suarez");
       Masaxista obj3=new Masaxista("Masaxista",4,301,38,"Victor","Picallo");
       obj1.concentrarse();
       obj.concentrarse();
       obj2.concentrarse();
       obj3.concentrarse();
       obj.viaxar();
       obj1.viaxar();
       obj3.viaxar();
       obj2.viaxar();
       //opcion 2 de los ejercicios.
       Seleccion xoj1=new Xogador(54,"Extremo",425,28,"Luis","Fernando");
       xoj1.concentrarse();
       xoj1.viaxar();
      //Si pode chamar desde unha subclase a un metodo da suoperclase porque o hereda.
      //A superclase non pode chamar aos metodos das subclases
    }
}
