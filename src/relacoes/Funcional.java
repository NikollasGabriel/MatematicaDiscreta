package relacoes;

import java.util.ArrayList;
import model.PadraoLeitura;

public class Funcional extends Relacao {

    public static void relacaoFuncional(Relacao relacao) {
        //Portanto, para R: A -> B funcional, cada elemento de A está relacionado com, no máximo, um elemento de B;

        boolean relacaoExistente;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("(< , R: A -> B):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
        ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

        if (relacao.getRelacao().equals("<")) {
            relacaoExistente = false;

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if (Integer.parseInt(elementoA) < Integer.parseInt(elementoB)) {
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoB).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                                //Se atende a condição, a relação existe até o momento
                                relacaoExistente = true;
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
                System.out.println("A função é Funcional");

            } else {
                System.out.println("(< , R: A -> B) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao().equals(">")) {
            relacaoExistente = false;

            OUTERMOST:
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
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(> , R: A -> B) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao().equals("=")) {
            relacaoExistente = false;

            OUTERMOST:
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
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(= , R: A -> B) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao().equals("quadrado")) {
            relacaoExistente = false;

            OUTERMOST:
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
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(x²=y , R: A -> B) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao().equals("raizQuadrada")) {
            relacaoExistente = false;

            OUTERMOST:
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
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(√x=y, R: A -> B) não é uma relação Funcional");
            }
        }
    }

    public static void relacaoFuncionalComposta(Relacao relacao) {
        //Portanto, para R: A -> B funcional, cada elemento de A está relacionado com, no máximo, um elemento de B;
        //Portanto, para R: B -> C funcional, cada elemento de B está relacionado com, no máximo, um elemento de C;
        boolean relacaoExistente;

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("(< , R: A -> B):={");

        StringBuilder paresRelacao2 = new StringBuilder();
        paresRelacao2.append("(< , R: B -> C):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(relacao.getConjuntoA());
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(relacao.getConjuntoB());
        ArrayList<String> conjuntoC = PadraoLeitura.decompoeElementos(relacao.getConjuntoC());

        if (relacao.getRelacao().equals("<")) {
            relacaoExistente = false;

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {

                        if ((Integer.parseInt(elementoA) < Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoB) < Integer.parseInt(elementoC))
                                && (Integer.parseInt(elementoA) < Integer.parseInt(elementoC))) {

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoB).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoC).append(">,");

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                                //Se atende a condição, a relação existe até o momento
                                relacaoExistente = true;

                            } else {
                                //Se não obedecer a relação, então a relação em si é falsa 
                                relacaoExistente = false;
                                break OUTERMOST;
                            }
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
                System.out.println("A função é Funcional");

            } else {
                System.out.println("(< , R: A -> B -> C) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao()
                .equals(">")) {
            relacaoExistente = false;

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoA) > Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoB) > Integer.parseInt(elementoC))
                                && (Integer.parseInt(elementoA) > Integer.parseInt(elementoC))) {

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {

                                //Montagem das strings
                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoB).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoC).append(">,");

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                                //Se atende a condição, a relação existe até o momento
                                relacaoExistente = true;
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
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(> , R: A -> B -> C) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao()
                .equals("=")) {
            relacaoExistente = false;

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                        if ((Integer.parseInt(elementoA) == Integer.parseInt(elementoB))
                                && (Integer.parseInt(elementoB) == Integer.parseInt(elementoC))
                                && (Integer.parseInt(elementoA) == Integer.parseInt(elementoC))) {

                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoB).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoC).append(">,");

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                                //Se atende a condição, a relação existe até o momento
                                relacaoExistente = true;
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
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(= , R: A -> B ->) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao()
                .equals("quadrado")) {
            relacaoExistente = false;

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {

                        if (((Integer.parseInt(elementoA) * Integer.parseInt(elementoA)) == Integer.parseInt(elementoB))
                                && ((Integer.parseInt(elementoB) * Integer.parseInt(elementoA)) == Integer.parseInt(elementoC))
                                && ((Integer.parseInt(elementoA) * Integer.parseInt(elementoA)) == Integer.parseInt(elementoC))) {
                            if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0) && !(dominioValores.indexOf(elementoC) >= 0)) {
                                //Montagem das strings
                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoB).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoC).append(">,");

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                                //Se atende a condição, a relação existe até o momento
                                relacaoExistente = true;
                            } else {
                                //Se não obedecer a relação, então a relação em si é falsa 
                                relacaoExistente = false;
                                break OUTERMOST;
                            }
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
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(x²=y , R: A -> B -> C) não é uma relação Funcional");
            }

        } else if (relacao.getRelacao()
                .equals("raizQuadrada")) {
            relacaoExistente = false;

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    for (String elementoC : conjuntoC) {
                    if ((Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoB)) 
                            &&(Math.sqrt(Integer.parseInt(elementoB)) == Integer.parseInt(elementoC))
                            &&(Math.sqrt(Integer.parseInt(elementoA)) == Integer.parseInt(elementoC))){
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {
                            //Montagem das strings
                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoB).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");

                                dominioDefinicao.append(elementoB).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoB).append(",").append(elementoC).append(">,");

                                dominioDefinicao.append(elementoA).append(",");
                                dominioValores.append(elementoC).append(",");
                                paresRelacao.append("<").append(elementoA).append(",").append(elementoC).append(">,");
                                //Se atende a condição, a relação existe até o momento
                                relacaoExistente = true;
                        }
                    } else {
                        //Se não obedecer a relação, então a relação em si é falsa 
                        relacaoExistente = false;
                        break OUTERMOST;
                    }
                }}
            }

            if (relacaoExistente) {
                dominioDefinicao.deleteCharAt(dominioDefinicao.length() - 1).append("}");
                dominioValores.deleteCharAt(dominioValores.length() - 1).append("}");
                paresRelacao.deleteCharAt(paresRelacao.length() - 1).append("}");

                System.out.println(dominioDefinicao.toString());
                System.out.println(dominioValores.toString());
                System.out.println(paresRelacao.toString());
                System.out.println("A função é Funcional");
            } else {
                System.out.println("(√x=y, R: A -> B -> C) não é uma relação Funcional");
            }
        }
    }
}
