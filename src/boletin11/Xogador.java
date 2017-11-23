
package boletin11;


public class Xogador extends Seleccion{
    private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal, String demarcación, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcación;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcación() {
        return demarcacion;
    }

    public void setDemarcación(String demarcación) {
        this.demarcacion = demarcación;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os xogadores");
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); 
    }

    
            
            
    public void xogarPartido(){
        
    }
    public void entrenar(){
        
    }
    
    public String toString() {
          return " Dorsal "+dorsal+"y su demarcación"+demarcacion+super.toString();
}
}
