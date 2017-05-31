package relacoes;

import java.util.ArrayList;
import model.PadraoLeitura;

public class Sobrejetora extends Relacao {

    public static void relacaoSobrejetora(Relacao relacao) {
        //Portanto, para R: A -> B sobrejetora conjunto imagem é B

        boolean relacaoExistente = true;

        //String C = "C={8,5,9,75,2,1}";
        //String Q = "Q={99,98,100}";
        //String relacao = "<";
        if (relacao.getRelacao().equals("<")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Integer.parseInt(elementoB) < Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
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
                    //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                    if (!(dominioValores.indexOf(elementoB) >= 0)) {
                        relacaoExistente = false;
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
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals(">")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Integer.parseInt(elementoB) > Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
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
                    //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                    if (!(dominioValores.indexOf(elementoB) >= 0)) {
                        relacaoExistente = false;
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
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("=")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Integer.parseInt(elementoB) == Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
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
                    //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                    if (!(dominioValores.indexOf(elementoB) >= 0)) {
                        relacaoExistente = false;
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
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Math.pow(Integer.parseInt(elementoB), 2) == Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
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
                    //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                    if (!(dominioValores.indexOf(elementoB) >= 0)) {
                        relacaoExistente = false;
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
                System.out.println("A função < : A -> B é Total");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    if (Math.sqrt(Integer.parseInt(elementoB)) == Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
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
                    //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                    if (!(dominioValores.indexOf(elementoB) >= 0)) {
                        relacaoExistente = false;
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
                System.out.println("A função < : A -> B é Sobrejetora");

            } else {
                System.out.println("< : A -> B não é uma relação Total");
            }
        }
    }

    public static void relacaoSobrejetoraComposta(Relacao relacao) {
        //Portanto, para R: A -> B sobrejetora conjunto imagem é B

        boolean relacaoExistente = true;

        //String C = "C={8,5,9,75,2,1}";
        //String Q = "Q={99,98,100}";
        //String relacao = "<";
        if (relacao.getRelacao().equals("<")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
            ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    for (String elementoC : conjuntoC) {//Para cada elemento de C
                        if ((Integer.parseInt(elementoB) < Integer.parseInt(elementoA))
                                && (Integer.parseInt(elementoC) < Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoC) < Integer.parseInt(elementoA))) {//É o elemento de A menor que de B?
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                                dominioDefinicao.append(elementoA).append(",");
                                //Adicionar o elemento A ao dominio de definição
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,").append(elementoC).append(">,");
                            } else {//Se o dominio de definição contivê-lo
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoB).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                            }
                        }
                        //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                        if (!(dominioValores.indexOf(elementoB) >= 0)) {
                            relacaoExistente = false;
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
                System.out.println("A função < : A -> B -> C é Total");

            } else {
                System.out.println("< : A -> B -> C não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals(">")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
            ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    for (String elementoC : conjuntoC) {//Para cada elemento de C
                        if (Integer.parseInt(elementoB) > Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                                dominioDefinicao.append(elementoA).append(",");
                                //Adicionar o elemento A ao dominio de definição
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            } else {//Se o dominio de definição contivê-lo
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento B ao dominio de valores
                                    }
                                }

                            }
                        }
                        //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                        if (!(dominioValores.indexOf(elementoB) >= 0)) {
                            relacaoExistente = false;
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
                System.out.println("A função < : A -> B -> C é Total");

            } else {
                System.out.println("< : A -> B -> não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("=")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
            ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    for (String elementoC : conjuntoC) {//Para cada elemento de B
                        if (Integer.parseInt(elementoB) == Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                                dominioDefinicao.append(elementoA).append(",");
                                //Adicionar o elemento A ao dominio de definição
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            } else {//Se o dominio de definição contivê-lo
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                            }
                        }
                        //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                        if (!(dominioValores.indexOf(elementoB) >= 0)) {
                            relacaoExistente = false;
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
                System.out.println("A função < : A -> B -> C é Total");

            } else {
                System.out.println("< : A -> B ->C não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("quadrado")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
            ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    for (String elementoC : conjuntoC) {//Para cada elemento de B
                        if (Math.pow(Integer.parseInt(elementoB), 2) == Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                                dominioDefinicao.append(elementoA).append(",");
                                //Adicionar o elemento A ao dominio de definição
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            } else {//Se o dominio de definição contivê-lo
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                            }
                        }
                        //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                        if (!(dominioValores.indexOf(elementoB) >= 0)) {
                            relacaoExistente = false;
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
                System.out.println("A função < : A -> B -> C é Total");

            } else {
                System.out.println("< : A -> B - > C não é uma relação Total");
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {

            StringBuilder paresRelacao = new StringBuilder();
            paresRelacao.append("Pares da Relação ").append(relacao.getRelacao()).append(":{");

            StringBuilder dominioDefinicao = new StringBuilder();
            dominioDefinicao.append("Domínio de Definição:{");

            StringBuilder dominioValores = new StringBuilder();
            dominioValores.append("Domínio de Valores:{");

            ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
            ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
            ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

            for (String elementoA : conjuntoA) {//Para cada elemento de A
                for (String elementoB : conjuntoB) {//Para cada elemento de B
                    for (String elementoC : conjuntoC) {//Para cada elemento de B
                        if (Math.sqrt(Integer.parseInt(elementoB)) == Integer.parseInt(elementoA)) {//É o elemento de A menor que de B?
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0)) {//Se o dominio de definição não contivê-lo
                                dominioDefinicao.append(elementoA).append(",");
                                //Adicionar o elemento A ao dominio de definição
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            } else {//Se o dominio de definição contivê-lo
                                //Adicionar o trio <A,B,C> ao pares que atendem a relação
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                                if (!(dominioValores.indexOf(elementoB) >= 0)) {//Se o dominio de valores não contivê-lo
                                    dominioValores.append(elementoB).append(",");
                                    //Adicionar o elemento B ao dominio de valores
                                    if (!(dominioValores.indexOf(elementoC) >= 0)) {//Se o dominio de valores não contivê-lo
                                        dominioValores.append(elementoC).append(",");
                                        //Adicionar o elemento C ao dominio de valores
                                    }
                                }
                            }
                        }
                    
                    //Se o dominio de definição não contiver todos os elementos de, logo a relação não é válida
                    if (!(dominioValores.indexOf(elementoB) >= 0)) {
                        relacaoExistente = false;
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
            System.out.println("A função < : A -> B -> C é Sobrejetora");

        } else {
            System.out.println("< : A -> B -> C não é uma relação Total");
        }
    }
}

}
