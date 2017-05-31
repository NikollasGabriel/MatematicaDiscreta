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
                .append(relacao.getConjuntoB()).append(" -> ").append(relacao.getConjuntoA()).append("):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

        if (relacao.getRelacao().equals("<")) {

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoB) < Integer.parseInt(elementoA)) {
                        //Se atende a condição, a relação existe até o momento
                        relacaoExistente = true;

                        if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                            //Montagem das strings
                            dominioDefinicao.append(elementoB).append(",");
                            dominioValores.append(elementoA).append(",");
                            paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                        }
                    } else {
                        //Se não obedecer a relação, então a relação em si é falsa 
                        relacaoExistente = false;
                        break OUTERMOST;
                    }
                }
            }

        } else if (relacao.getRelacao().equals(">")) {

            OUTERMOST:
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
                    } else {
                        //Se não obedecer a relação, então a relação em si é falsa 
                        relacaoExistente = false;
                        break OUTERMOST;
                    }
                }
            }

        } else if (relacao.getRelacao().equals("=")) {

            OUTERMOST:
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
                    } else {
                        //Se não obedecer a relação, então a relação em si é falsa 
                        relacaoExistente = false;
                        break OUTERMOST;
                    }
                }
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            OUTERMOST:
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
                    } else {
                        //Se não obedecer a relação, então a relação em si é falsa 
                        relacaoExistente = false;
                        break OUTERMOST;
                    }
                }
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            OUTERMOST:
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
                    } else {
                        //Se não obedecer a relação, então a relação em si é falsa 
                        relacaoExistente = false;
                        break OUTERMOST;
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

    public static void relacaoInjetoraComposta(Relacao relacao) {
//Portanto, para R: A -> B injetora, cada elemento de B está relacionado com, no máximo, um elemento de A
//Portanto, para R: B -> C injetora, cada elemento de C está relacionado com, no máximo, um elemento de B

        boolean relacaoExistente = false;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("(< , R: A -> B -> C):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
        ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

        if (relacao.getRelacao().equals("<")) {

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoB) < Integer.parseInt(elementoA))
                                && (Integer.parseInt(elementoC) < Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoC) < Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                            }
                        } else {
                            //Se não obedecer a relação, então a relação em si é falsa 
                            relacaoExistente = false;
                            break OUTERMOST;
                        }
                    }
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função é Injetora");

            } else {
                System.out.println("(< , R: B -> A) não é uma relação Injetora");
            }

        } else if (relacao.getRelacao().equals(">")) {

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoB) > Integer.parseInt(elementoA))
                                && (Integer.parseInt(elementoC) > Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoC) > Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                            }
                        } else {
                            //Se não obedecer a relação, então a relação em si é falsa 
                            relacaoExistente = false;
                            break OUTERMOST;
                        }
                    }
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função é Injetora");

            } else {
                System.out.println("(> , R: B -> A) não é uma relação Injetora");
            }

        } else if (relacao.getRelacao().equals("=")) {

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoB) == Integer.parseInt(elementoA))
                                && (Integer.parseInt(elementoC) == Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoC) == Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoA) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                            }
                        } else {
                            //Se não obedecer a relação, então a relação em si é falsa 
                            relacaoExistente = false;
                            break OUTERMOST;
                        }
                    }
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função é Injetora");

            } else {
                System.out.println("(= , R: B -> A) não é uma relação Injetora");
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Math.pow(Integer.parseInt(elementoB), 2) == Integer.parseInt(elementoA))
                                && (Math.pow(Integer.parseInt(elementoC), 2) == Integer.parseInt(elementoB))
                                && (Math.pow(Integer.parseInt(elementoC), 2) == Integer.parseInt(elementoA))) {
                            //Se atende a condição, a relação existe até o momento
                            relacaoExistente = true;

                            if (!(dominioDefinicao.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                            }
                        } else {
                            //Se não obedecer a relação, então a relação em si é falsa 
                            relacaoExistente = false;
                            break OUTERMOST;
                        }
                    }
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função é Injetora");

            } else {
                System.out.println("(y²=x , R: B -> A) não é uma relação Injetora");
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            OUTERMOST:
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
                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoA).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoA).append(">,");
                            }
                        } else {
                            //Se não obedecer a relação, então a relação em si é falsa 
                            relacaoExistente = false;
                            break OUTERMOST;
                        }
                    }
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função é Injetora");

            } else {
                System.out.println("(√x=y , R: B -> A) não é uma relação Injetora");
            }

        }
    }
}
