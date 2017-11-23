
package boletin11;


public class Adestrador extends Seleccion {
    private String idFederacion;

    public Adestrador(String idFederación, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.idFederacion = idFederación;
    }

    public String getIdFederación() {
        return idFederacion;
    }

    public void setIdFederación(String idFederación) {
        this.idFederacion = idFederación;
    }

    @Override
    public void viaxar() {
         System.out.println("Viaxan os xogadores"); 
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }
   
    public void dirixirPartido(){
        
    }
    public void dirixirAdestramento(){
        
    } 
    public String toString(){
      return super.toString()+"Codigo de la federación"+idFederacion;
       
    }
}
