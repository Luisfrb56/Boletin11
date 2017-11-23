
package boletin11;

public class Masaxista extends Seleccion{
    private String titulacion;
    private int anosExperiencia;
    public Masaxista(String titulacion,int anosExperiencia, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.titulacion = titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public void viaxar() {
         System.out.println("Viaxan os xogadores"); 
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }
 
    public void darMasaxes(){
        
    }
     public String toString(){
      return " Titulo do masaxista "+titulacion+super.toString();
       
    }
}
