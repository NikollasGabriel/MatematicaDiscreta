package relacoes;

import java.util.ArrayList;
import model.PadraoLeitura;

public class jdhjghjdfng extends Relacao {

    public static void relacaoTotal(Relacao relacao) {
        //Portanto, para R: A -> B total, domínio de definição é A

        boolean relacaoExistente = true;
        //String C = "C={8,5,9,75,2,1}";
        //String Q = "Q={1,2,3}";
        //String relacao = "<";

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:{");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:{");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

        if (relacao.getRelacao().equals("<")) {

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Integer.parseInt(elementoA) < Integer.parseInt(elementoB)) {//É o elemento de A menor que de B?
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                            dominioDefinicao.append(elementoA).append(",");
                            //Adicionar o elemento A ao dominio de definição
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {//Se o dominio de definição contivê-lo
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                        }
                    }
                }
                //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals(">")) {


            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Integer.parseInt(elementoA) > Integer.parseInt(elementoB)) {//É o elemento de A menor que de B?
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                            dominioDefinicao.append(elementoA).append(",");
                            //Adicionar o elemento A ao dominio de definição
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {//Se o dominio de definição contivê-lo
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                        }
                    }
                }
                //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("=")) {



            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Integer.parseInt(elementoA) == Integer.parseInt(elementoB)) {//É o elemento de A menor que de B?
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                            dominioDefinicao.append(elementoA).append(",");
                            //Adicionar o elemento A ao dominio de definição
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {//Se o dominio de definição contivê-lo
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                        }
                    }
                }
                //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("quadrado")) {



            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Math.pow(Integer.parseInt(elementoA), 2) == Integer.parseInt(elementoB)) {//É o elemento de A menor que de B?
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                            dominioDefinicao.append(elementoA).append(",");
                            //Adicionar o elemento A ao dominio de definição
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {//Se o dominio de definição contivê-lo
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                        }
                    }
                }
                //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {


            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoB)) {//É o elemento de A menor que de B?
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                            dominioDefinicao.append(elementoA).append(",");
                            //Adicionar o elemento A ao dominio de definição
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                        } else {//Se o dominio de definição contivê-lo
                            //Adicionar o par <A,B> ao pares que atendem a relação
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                dominioValores.append(elementoB).append(",");
                                //Adicionar o elemento B ao dominio de valores
                            }
                        }
                    }
                }
                //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {
                    relacaoExistente = false;
                }
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }
        }
    }

}
