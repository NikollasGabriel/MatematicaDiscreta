package model;

import java.util.ArrayList;

public class Conjunto {

    private String nomeConjunto;
    private ArrayList<String> elementosConjunto = new ArrayList<>();

    public Conjunto() {
    }

    public Conjunto(String nomeConjunto) {
        this.nomeConjunto = nomeConjunto;
    }

    public Conjunto(String nomeConjunto, ArrayList<String> elementosConjunto) {
        this.nomeConjunto = nomeConjunto;
        this.elementosConjunto = elementosConjunto;
    }
    
    public String getNomeConjunto() {
        return nomeConjunto;
    }

    public void setNomeConjunto(String nomeConjunto) {
        this.nomeConjunto = nomeConjunto;
    }

    public String getElementoConjunto(int indice) {
        return elementosConjunto.get(indice);
    }

    public void setElementoConjunto(String elemento) {
        this.elementosConjunto.add(elemento);
    }

    public ArrayList<String> getConjunto() {
        return elementosConjunto;
    }

    public void setConjunto(ArrayList<String> elementos) {
        elementosConjunto = elementos;
    }
}
