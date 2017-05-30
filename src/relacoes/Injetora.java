package relacoes;

import java.util.ArrayList;
import model.PadraoLeitura;

public class Injetora extends Relacao{

    public static void relacaoInjetora(Relacao relacao) {
        //Portanto, para R: A -> B injetora, cada elemento de B está relacionado com, no máximo, um elemento de A

        boolean relacaoExistente = false;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("(< , R: A -> B):={");

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

    public static void relacaoInjetoraComposta(Relacao relacao) {

    }
}
