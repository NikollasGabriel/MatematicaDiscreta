package model;

import javax.swing.JOptionPane;

public class Operacoes {

    public static void operacaoPertence(String conjunto, String elemento) {

        String conjuntoP = PadraoLeitura.decompoeConjunto(conjunto);
        String elementoP = PadraoLeitura.decompoeElemento(elemento);

        if (conjuntoP.contains(elementoP)) {
            JOptionPane.showMessageDialog(null, "O elemento " + elemento + " pertence ao conjunto " + conjunto);
        } else {
            JOptionPane.showMessageDialog(null, "O elemento " + elemento + " não pertence ao conjunto " + conjunto);
        }

    }

    public static void operacaoContidoIgual(String conjuntoUm, String conjuntoDois) {
        String conjuntoUmCI = PadraoLeitura.decompoeConjunto(conjuntoUm);
        String conjuntoDoisCI = PadraoLeitura.decompoeConjunto(conjuntoDois);

        char[] conjuntoUmCILetras = conjuntoUmCI.toCharArray();
        char[] conjuntoDoisCILetras = conjuntoDoisCI.toCharArray();

        int count1 = 0;
        int count2 = 0;

        for (char c : conjuntoDoisCILetras) {
            if (conjuntoUmCI.contains(Character.toString(c))) {
                count1++;
            }
        }
        if (conjuntoDoisCI.length() == count1) {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoDois + " está contido no conjunto " + conjuntoUm);
        } else {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoDois + " não está contido no conjunto " + conjuntoUm);
        }

        for (char c : conjuntoUmCILetras) {
            if (conjuntoDoisCI.contains(Character.toString(c))) {
                count2++;
            }
        }
        if (conjuntoUmCI.length() == count2) {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoUm + " está contido no conjunto " + conjuntoDois);
        } else {
            JOptionPane.showMessageDialog(null, "O conjunto " + conjuntoUm + " não está contido no conjunto " + conjuntoDois);
        }

    }

    public static void operacaoUniao(String conjuntoUm, String conjuntoDois) {

        String conjuntoUmU = PadraoLeitura.decompoeConjunto(conjuntoUm);
        String conjuntoDoisU = PadraoLeitura.decompoeConjunto(conjuntoDois);
        String conjuntoUniaoU = conjuntoUmU + conjuntoDoisU;
        String conjuntoUniaoFinal = PadraoLeitura.nomeConjunto(conjuntoUm) + "∪" + PadraoLeitura.nomeConjunto(conjuntoDois) + "={";

        char[] conjuntoUniaoLetras = conjuntoUniaoU.toCharArray();

        for (char c : conjuntoUniaoLetras) {
            if (!(conjuntoUniaoFinal.contains(Character.toString(c)))) {
                conjuntoUniaoFinal = conjuntoUniaoFinal + c + ",";
            }
        }
        conjuntoUniaoFinal = conjuntoUniaoFinal + "}";
        JOptionPane.showMessageDialog(null, "O conjunto união dos conjuntos " + conjuntoUm + " e " + conjuntoDois + " é " + conjuntoUniaoFinal);
    }

    public static void operacaoIntersecao(String conjuntoUm, String conjuntoDois) {

        String conjuntoUmI = PadraoLeitura.decompoeConjunto(conjuntoUm);
        String conjuntoDoisI = PadraoLeitura.decompoeConjunto(conjuntoDois);
        String conjuntoIntersecaoFinal = PadraoLeitura.nomeConjunto(conjuntoUm) + "∩" + PadraoLeitura.nomeConjunto(conjuntoDois) + "={";

        char[] conjuntoUmILetras = conjuntoUmI.toCharArray();
        char[] conjuntoDoisILetras = conjuntoDoisI.toCharArray();

        for (char c : conjuntoUmILetras) {
            for (char d : conjuntoDoisILetras) {
                if (c == d && !(conjuntoIntersecaoFinal.contains(Character.toString(c)))) {
                    conjuntoIntersecaoFinal = conjuntoIntersecaoFinal + c + ",";
                }
            }
        }
        conjuntoIntersecaoFinal = conjuntoIntersecaoFinal + "}";
        JOptionPane.showMessageDialog(null, "O conjunto interseção dos conjuntos " + conjuntoUm + " e " + conjuntoDois + " é " + conjuntoIntersecaoFinal);
    }

    public static void operacaoProdutoCartesiano(String conjuntoUm, String conjuntoDois) {
        
        String conjuntoUmPC = PadraoLeitura.decompoeConjunto(conjuntoUm);
        String conjuntoDoisPC = PadraoLeitura.decompoeConjunto(conjuntoDois);
        String conjuntoCartesianoFinal = PadraoLeitura.nomeConjunto(conjuntoUm) + "×" + PadraoLeitura.nomeConjunto(conjuntoDois) + "={";

        char[] conjuntoUmPCLetras = conjuntoUmPC.toCharArray();
        char[] conjuntoDoisPCLetras = conjuntoDoisPC.toCharArray();

        for (char c : conjuntoUmPCLetras) {
            for (char d : conjuntoDoisPCLetras) {
                if (!(conjuntoCartesianoFinal.contains("("+Character.toString(c)+","+Character.toString(d)+")"))) {
                    conjuntoCartesianoFinal = conjuntoCartesianoFinal + "(" + c + "," + d + ")" + ",";
                }
            }
        }
        conjuntoCartesianoFinal = conjuntoCartesianoFinal + "}";
        JOptionPane.showMessageDialog(null, "O produto cartesiano dos conjuntos " + conjuntoUm + " e " + conjuntoDois + " é " + conjuntoCartesianoFinal);
    }
    
}
