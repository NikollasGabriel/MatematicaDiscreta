package model;

public class Elemento {
    
    private String nomeElemento;
    private String valorElemento;

    public Elemento() {
    }

    public Elemento(String nomeElemento, String valorElemento) {
        this.nomeElemento = nomeElemento;
        this.valorElemento = valorElemento;
    }

    public String getNomeElemento() {
        return nomeElemento;
    }

    public void setNomeElemento(String nomeElemento) {
        this.nomeElemento = nomeElemento;
    }

    public String getValorElemento() {
        return valorElemento;
    }

    public void setValorElemento(String valorElemento) {
        this.valorElemento = valorElemento;
    }
            
}
