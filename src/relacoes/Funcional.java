package relacoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PadraoLeitura;

public class Funcional extends Relacao {

    public static boolean relacaoFuncional(Relacao relacao) {
        //Portanto, para R: A -> B funcional, cada elemento de A está relacionado com, no máximo, um elemento de B;

        boolean relacaoExistente = false;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("Pares da Relação (").append(relacao.getRelacao()).append(" ,R: ")
                .append(PadraoLeitura.nomeConjunto(relacao.getConjuntoA())).append(" -> ").
                append(PadraoLeitura.nomeConjunto(relacao.getConjuntoB())).append("):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

        if (relacao.getRelacao().equals("<")) {
 
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoA) < Integer.parseInt(elementoB)) {
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoA).append(",");
                            dominioValores.append(elementoB).append(",");
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals(">")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoA) > Integer.parseInt(elementoB)) {
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoA).append(",");
                            dominioValores.append(elementoB).append(",");
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("=")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoA) == Integer.parseInt(elementoB)) {
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoA).append(",");
                            dominioValores.append(elementoB).append(",");
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if ((Integer.parseInt(elementoA) * Integer.parseInt(elementoA)) == Integer.parseInt(elementoB)) {
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoA).append(",");
                            dominioValores.append(elementoB).append(",");
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoB)) {
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoA).append(",");
                            dominioValores.append(elementoB).append(",");
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;
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
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoB()) + " é uma relação Funcional");

        } else {

            JOptionPane.showMessageDialog(null, relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoB()) + " não é uma relação Funcional");
        }

        return relacaoExistente;
    }

    public static boolean relacaoFuncionalComposta(Relacao relacao) {
        //Portanto, para R: A -> B funcional, cada elemento de A está relacionado com, no máximo, um elemento de B;
        //Portanto, para R: B -> C funcional, cada elemento de B está relacionado com, no máximo, um elemento de C;

        boolean relacaoExistente = false;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("Pares da Relação (").append(relacao.getRelacao()).append(" ,R;S ")
                .append(PadraoLeitura.nomeConjunto(relacao.getConjuntoA())).append(" -> ").
                append(PadraoLeitura.nomeConjunto(relacao.getConjuntoC())).append("):={");

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

                        if ((Integer.parseInt(elementoA) < Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoB) < Integer.parseInt(elementoC))
                                && (Integer.parseInt(elementoA) < Integer.parseInt(elementoC))) {

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                relacaoExistente = true;

                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals(">")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoA) > Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoB) > Integer.parseInt(elementoC))
                                && (Integer.parseInt(elementoA) > Integer.parseInt(elementoC))) {

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                relacaoExistente = true;
                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("=")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoA) == Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoB) == Integer.parseInt(elementoC))
                                && (Integer.parseInt(elementoA) == Integer.parseInt(elementoC))) {

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                relacaoExistente = true;
                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {

                        if (((Integer.parseInt(elementoA) * Integer.parseInt(elementoA)) == Integer.parseInt(elementoB))
                                && ((Integer.parseInt(elementoB) * Integer.parseInt(elementoA)) == Integer.parseInt(elementoC))
                                && ((Integer.parseInt(elementoA) * Integer.parseInt(elementoA)) == Integer.parseInt(elementoC))) {
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                relacaoExistente = true;
                            }
                        }
                    }
                }
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoB))
                                && (Math.sqrt(Integer.parseInt(elementoB)) == Integer.parseInt(elementoC))
                                && (Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoC))) {

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                relacaoExistente = true;
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
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoC()) + " é uma composição de relação Funcional");

        } else {

            JOptionPane.showMessageDialog(null, relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoC()) + " não é uma composição de relação Funcional");
        }

        return relacaoExistente;
    }
}
