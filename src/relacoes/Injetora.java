package relacoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PadraoLeitura;

public class Injetora extends Relacao {

    public static boolean relacaoInjetora(Relacao relacao) {
        //Portanto, para R: A -> B injetora, cada elemento de B está relacionado com, no máximo, um elemento de A

        boolean relacaoExistente = false;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("Pares da Relação (").append(relacao.getRelacao()).append(" ,R: ")
                .append(PadraoLeitura.nomeConjunto(relacao.getConjuntoB())).append(" -> ").
                append(PadraoLeitura.nomeConjunto(relacao.getConjuntoA())).append("):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

        if (relacao.getRelacao().equals("<")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoB) < Integer.parseInt(elementoA)) {
                        //Se atende a condição, a relação existe até o momento
                        relacaoExistente = true;
                        System.out.println(elementoB + " " + elementoA);
                        if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoB).append(",");
                            dominioValores.append(elementoA).append(",");
                            paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals(">")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoB) > Integer.parseInt(elementoA)) {
                        //Se atende a condição, a relação existe até o momento
                        relacaoExistente = true;

                        if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoB).append(",");
                            dominioValores.append(elementoA).append(",");
                            paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("=")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoB) == Integer.parseInt(elementoA)) {
                        //Se atende a condição, a relação existe até o momento
                        relacaoExistente = true;

                        if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoB).append(",");
                            dominioValores.append(elementoA).append(",");
                            paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Math.pow(Integer.parseInt(elementoB), 2) == Integer.parseInt(elementoA)) {
                        //Se atende a condição, a relação existe até o momento
                        relacaoExistente = true;

                        if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoB).append(",");
                            dominioValores.append(elementoA).append(",");
                            paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Math.sqrt(Integer.parseInt(elementoB)) == Integer.parseInt(elementoA)) {
                        //Se atende a condição, a relação existe até o momento
                        relacaoExistente = true;

                        if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoB).append(",");
                            dominioValores.append(elementoA).append(",");
                            paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                        }
                    }
                }
            }

        }

        if (relacaoExistente) {
            dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
            dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
            paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

            JOptionPane.showMessageDialog(null, dominioDefinicao.toString() + "\n"
                    + dominioValores.toString() + "\n"
                    + paresRelacao.toString() + "\n"
                    + relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoB()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " é uma relação Injetora");


        } else {

            JOptionPane.showMessageDialog(null, relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoB()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " não é uma relação Injetora");

        }

        return relacaoExistente;
    }

    public static boolean relacaoInjetoraComposta(Relacao relacao) {
//Portanto, para R: A -> B injetora, cada elemento de B está relacionado com, no máximo, um elemento de A
//Portanto, para R: B -> C injetora, cada elemento de C está relacionado com, no máximo, um elemento de B

        boolean relacaoExistente = false;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("Pares da Relação (").append(relacao.getRelacao()).append(" ,R;S ")
                .append(PadraoLeitura.nomeConjunto(relacao.getConjuntoC())).append(" -> ").
                append(PadraoLeitura.nomeConjunto(relacao.getConjuntoA())).append("):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
        ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

        if (relacao.getRelacao().equals("<")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoB) < Integer.parseInt(elementoA))
                                && (Integer.parseInt(elementoC) < Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoC) < Integer.parseInt(elementoA))) {
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoC).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoC).append(",").append(elementoA).append(">,");

                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals(">")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoB) > Integer.parseInt(elementoA))
                                && (Integer.parseInt(elementoC) > Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoC) > Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoC).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoC).append(",").append(elementoA).append(">,");
                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("=")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoB) == Integer.parseInt(elementoA))
                                && (Integer.parseInt(elementoC) == Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoC) == Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoC).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoC).append(",").append(elementoA).append(">,");
                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Math.pow(Integer.parseInt(elementoB), 2) == Integer.parseInt(elementoA))
                                && (Math.pow(Integer.parseInt(elementoC), 2) == Integer.parseInt(elementoB))
                                && (Math.pow(Integer.parseInt(elementoC), 2) == Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoC).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoC).append(",").append(elementoA).append(">,");
                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Math.sqrt(Integer.parseInt(elementoB)) == Integer.parseInt(elementoA))
                                && (Math.sqrt(Integer.parseInt(elementoC)) == Integer.parseInt(elementoB))
                                && (Math.sqrt(Integer.parseInt(elementoC)) == Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if ((!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0))
                                    && (!(dominioDefinicao.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoB) >= 0))
                                    && (!(dominioDefinicao.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoA) >= 0))) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoC).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoC).append(",").append(elementoA).append(">,");
                            }
                        }
                    }
                }
            }
        }

        if (relacaoExistente) {
            dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
            dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
            paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

            JOptionPane.showMessageDialog(null, dominioDefinicao.toString() + "\n"
                    + dominioValores.toString() + "\n"
                    + paresRelacao.toString() + "\n"
                    + relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoC()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " é uma composição de relação Injetora");

        } else {

            JOptionPane.showMessageDialog(null, relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoC()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " não é uma composição de relação Injetora");
        }

        return relacaoExistente;
    }
}
