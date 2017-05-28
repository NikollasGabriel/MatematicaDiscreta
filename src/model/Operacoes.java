package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operacoes {

    public static void operacaoPertence(String conjunto, String elemento) {

        ArrayList<String> conjuntoP = PadraoLeitura.decompoeElementos(conjunto);
        String elementoP = PadraoLeitura.decompoeElemento(elemento);

        if (conjuntoP.contains(elementoP)) {
            JOptionPane.showMessageDialog(null, "O elemento " + PadraoLeitura.nomeElemento(elemento)
                    + " pertence ao conjunto " + PadraoLeitura.nomeConjunto(conjunto));
        } else {
            JOptionPane.showMessageDialog(null, "O elemento " + PadraoLeitura.nomeElemento(elemento)
                    + " não pertence ao conjunto " + PadraoLeitura.nomeConjunto(conjunto));
        }

    }

    public static void operacaoContidoIgual(String conjuntoUm, String conjuntoDois) {

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(conjuntoUm);
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(conjuntoDois);

        if (conjuntoB.containsAll(conjuntoA)) {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoUm + " está contido no conjunto " + conjuntoDois);
        } else {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoUm + " não está contido no conjunto " + conjuntoDois);
        }

        if (conjuntoA.containsAll(conjuntoB)) {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoDois + " está contido no conjunto " + conjuntoUm);
        } else {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoDois + " não está contido no conjunto " + conjuntoUm);
        }
    }

    public static void operacaoContidoPropriamente(String conjuntoUm, String conjuntoDois) {

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(conjuntoUm);
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(conjuntoDois);

        if (conjuntoB.containsAll(conjuntoA) && conjuntoB.size() > conjuntoA.size()) {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoUm + " está contido propriamente no conjunto " + conjuntoDois);
        } else {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoUm + " não está contido propriamente no conjunto " + conjuntoDois);
        }

        if (conjuntoA.containsAll(conjuntoB) && conjuntoA.size() > conjuntoB.size()) {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoDois + " está contido propriamente no conjunto " + conjuntoUm);
        } else {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoDois + " não está contido propriamente no conjunto " + conjuntoUm);
        }
    }

    public static void operacaoUniao(String conjuntoUm, String conjuntoDois) {

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(conjuntoUm);
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(conjuntoDois);
        ArrayList<String> conjuntoUniaoParcial = new ArrayList<>();

        String conjuntoUniao = "";

        conjuntoUniaoParcial.addAll(conjuntoA);
        conjuntoUniaoParcial.addAll(conjuntoB);

        StringBuilder sb = new StringBuilder();

        sb.append(PadraoLeitura.nomeConjunto(conjuntoUm));
        sb.append("∪");
        sb.append(PadraoLeitura.nomeConjunto(conjuntoDois));
        sb.append("={");

        for (String elemento : conjuntoUniaoParcial) {
            if (!(sb.indexOf(elemento) >= 0)) {
                sb.append(elemento);
                sb.append(",");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");

        conjuntoUniao = sb.toString();

        JOptionPane.showMessageDialog(null, "O conjunto união dos conjuntos " + conjuntoUm + " e " + conjuntoDois + " é " + conjuntoUniao);
    }

    public static void operacaoIntersecao(String conjuntoUm, String conjuntoDois) {

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(conjuntoUm);
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(conjuntoDois);

        String conjuntoIntersecao = "";

        StringBuilder sb = new StringBuilder();
        sb.append(PadraoLeitura.nomeConjunto(conjuntoUm));
        sb.append("∩");
        sb.append(PadraoLeitura.nomeConjunto(conjuntoDois));
        sb.append("={");

        for (String elementoA : conjuntoA) {
            for (String elementoB : conjuntoB) {
                if (elementoA.equals(elementoB) && !(sb.indexOf(elementoA) >= 0)) {
                    sb.append(elementoA);
                    sb.append(",");
                }
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");

        conjuntoIntersecao = sb.toString();

        JOptionPane.showMessageDialog(null, "O conjunto interseção dos conjuntos " + conjuntoUm + " e " + conjuntoDois + " é " + conjuntoIntersecao);
    }

    public static void operacaoProdutoCartesiano(String conjuntoUm, String conjuntoDois) {

        ArrayList<String> conjuntoUmPC = PadraoLeitura.decompoeElementos(conjuntoUm);
        ArrayList<String> conjuntoDoisPC = PadraoLeitura.decompoeElementos(conjuntoDois);

        String conjuntoCartesiano = "";

        StringBuilder sb = new StringBuilder();
        sb.append(PadraoLeitura.nomeConjunto(conjuntoUm));
        sb.append("×");
        sb.append(PadraoLeitura.nomeConjunto(conjuntoDois));
        sb.append("={");

        for (String elementoA : conjuntoUmPC) {
            for (String elementoB : conjuntoDoisPC) {
                sb.append("(");
                sb.append(elementoA);
                sb.append(",");
                sb.append(elementoB);
                sb.append(")");
                sb.append(",");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");

        conjuntoCartesiano = sb.toString();

        JOptionPane.showMessageDialog(null, "O produto cartesiano dos conjuntos " + conjuntoUm + " e " + conjuntoDois + " é " + conjuntoCartesiano);
    }

}
