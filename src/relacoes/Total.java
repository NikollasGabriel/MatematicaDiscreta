package relacoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PadraoLeitura;

public class Total extends Relacao {

    public static boolean relacaoTotal(Relacao relacao) {
        //Portanto, para R: A -> B total, domínio de definição é A

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
                        relacaoExistente = true;
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                            dominioDefinicao.append(elementoA).append(",");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");

                            }
                        }
                    }
                }
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }
        } else if (relacao.getRelacao().equals(">")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoA) > Integer.parseInt(elementoB)) {
                        relacaoExistente = true;
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                            dominioDefinicao.append(elementoA).append(",");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                        }
                    }
                }
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

        } else if (relacao.getRelacao().equals("=")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoA) == Integer.parseInt(elementoB)) {
                        relacaoExistente = true;
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                            dominioDefinicao.append(elementoA).append(",");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                        }
                    }
                }
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Math.pow(Integer.parseInt(elementoA), 2) == Integer.parseInt(elementoB)) {
                        relacaoExistente = true;
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                            dominioDefinicao.append(elementoA).append(",");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                        }
                    }
                }
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoB)) {
                        relacaoExistente = true;
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                            dominioDefinicao.append(elementoA).append(",");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {
                                dominioValores.append(elementoB).append(",");
                            }
                        }
                    }
                }
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
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
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoB()) + " é uma relação Total");

        } else {

            JOptionPane.showMessageDialog(null, relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoB()) + " não é uma relação Total");
        }

        return relacaoExistente;
    }

    public static boolean relacaoTotalComposta(Relacao relacao) {
//Portanto, para R: A -> B -> C total, domínio de definição é A

        boolean relacaoExistente = false;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("Pares da Relação (").append(relacao.getRelacao()).append(" ,R: ")
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

                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                                dominioDefinicao.append(elementoA).append(",");
                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                            } else {
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }

                            }
                        }
                    }
                    if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                        relacaoExistente = false;
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

                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                                dominioDefinicao.append(elementoA).append(",");
                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                            } else {
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }

                            }
                        }
                    }
                    if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                        relacaoExistente = false;
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

                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                                dominioDefinicao.append(elementoA).append(",");
                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                            } else {
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }

                            }
                        }
                    }
                    if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                        relacaoExistente = false;
                    }
                }
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {

                        if (Math.pow(Integer.parseInt(elementoA), 2) == Integer.parseInt(elementoB)
                                && Math.pow(Integer.parseInt(elementoB), 2) == Integer.parseInt(elementoC)
                                && Math.pow(Integer.parseInt(elementoA), 2) == Integer.parseInt(elementoC)) {

                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                                dominioDefinicao.append(elementoA).append(",");
                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                            } else {
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }

                            }
                        }
                    }
                    if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                        relacaoExistente = false;
                    }
                }
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {

                        if (Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoB)
                                && Math.sqrt(Integer.parseInt(elementoB)) == Integer.parseInt(elementoC)
                                && Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoC)) {

                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                                dominioDefinicao.append(elementoA).append(",");
                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                            } else {
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");

                                if (!(dominioValores.indexOf(elementoC) >= 0)) {
                                    dominioValores.append(elementoC).append(",");
                                }

                            }
                        }
                    }
                    if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                        relacaoExistente = false;
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
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoC()) + " é uma composição de relação Total");

        } else {

            JOptionPane.showMessageDialog(null, relacao.getRelacao() + " :"
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoA()) + " -> "
                    + PadraoLeitura.nomeConjunto(relacao.getConjuntoC()) + " não é uma composição de relação Total");
        }

        return relacaoExistente;
    }
}
