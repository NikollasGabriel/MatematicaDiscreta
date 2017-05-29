package relacoes;


public class Relacao {
    
    private String conjuntoA;
    private String conjuntoB;
    private String conjuntoC;
    private String relacao;

    public Relacao() {
        
    }

    public Relacao(String conjuntoA, String conjuntoB, String relacao) {
        this.conjuntoA = conjuntoA;
        this.conjuntoB = conjuntoB;
        this.relacao = relacao;
    }

    public Relacao(String conjuntoA, String conjuntoB, String conjuntoC, String relacao) {
        this.conjuntoA = conjuntoA;
        this.conjuntoB = conjuntoB;
        this.conjuntoC = conjuntoC;
        this.relacao = relacao;
    }

    public String getConjuntoA() {
        return conjuntoA;
    }

    public void setConjuntoA(String conjuntoA) {
        this.conjuntoA = conjuntoA;
    }

    public String getConjuntoB() {
        return conjuntoB;
    }

    public void setConjuntoB(String conjuntoB) {
        this.conjuntoB = conjuntoB;
    }

    public String getConjuntoC() {
        return conjuntoC;
    }

    public void setConjuntoC(String conjuntoC) {
        this.conjuntoC = conjuntoC;
    }

    public String getRelacao() {
        return relacao;
    }

    public void setRelacao(String relacao) {
        this.relacao = relacao;
    }
}