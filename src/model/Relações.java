package model;

import java.util.ArrayList;

public class Relações {

    public static void relacaoFuncional(/*String conjuntoUm, String conjuntoDois, String relacao*/) {
        //Portanto, para R: A -> B funcional, cada elemento de A está relacionado com, no máximo, um elemento de B;

        boolean relacaoExistente;

        String conjuntoUm = "Q={2,1,3}";
        String conjuntoDois = "A={4,5,7,9,8}";
        String relacao = "<";

        StringBuilder paresRelacao = new StringBuilder();
        paresRelacao.append("(< , R: A -> B):={");

        StringBuilder dominioDefinicao = new StringBuilder();
        dominioDefinicao.append("Domínio de Definição:={");

        StringBuilder dominioValores = new StringBuilder();
        dominioValores.append("Domínio de Valores:={");

        ArrayList<String> conjuntoA = PadraoLeitura.decompoeElementos(conjuntoUm);
        ArrayList<String> conjuntoB = PadraoLeitura.decompoeElementos(conjuntoDois);

        if (relacao.equals("<")) {
            relacaoExistente = false;

            OUTERMOST:
            for (String elementoA : conjuntoA) {
                for (String elementoB : conjuntoB) {
                    if (Integer.parseInt(elementoA) < Integer.parseInt(elementoB)) {
                        if (!(dominioDefinicao.indexOf(elementoA) >= 0) && !(dominioValores.indexOf(elementoB) >= 0)) {

                            dominioDefinicao.append(elementoA).append(",");
                            dominioValores.append(elementoB).append(",");
                            paresRelacao.append("<").append(elementoA).append(",").append(elementoB).append(">,");
                            relacaoExistente = true;
                        }
                    } else {
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
                System.out.println("(< , R: A -> B) não é uma relação Funcional");
            }

        } else if (relacao.equals(">")) {
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

        } else if (relacao.equals("=")) {
        } else if (relacao.equals("quadrado")) {
        } else if (relacao.equals("raiz")) {
        }
    }
    /*
    public static void relacaoInjetora() {
        //Portanto, para R: A -> B injetora, cada elemento de B está relacionado com, no máximo, um elemento de A 
                if(relacao.equals(">")){
        }else if(relacao.equals("<")){
        }else if(relacao.equals("=")){
        }else if(relacao.equals("quadrado")){
        }else if(relacao.equals("raiz")){
        }
    }

    public static void relacaoTotal() {
        //Portanto, para R: A -> B total, domínio de definição é A
                if(relacao.equals(">")){
        }else if(relacao.equals("<")){
        }else if(relacao.equals("=")){
        }else if(relacao.equals("quadrado")){
        }else if(relacao.equals("raiz")){
        }
    }

    public static void relacaoSobrejetora() {
        //Portanto, para R: A -> B sobrejetora conjunto imagem é B
                if(relacao.equals(">")){
        }else if(relacao.equals("<")){
        }else if(relacao.equals("=")){
        }else if(relacao.equals("quadrado")){
        }else if(relacao.equals("raiz")){
        }
    }

    public static void relacaoMonomorfismo() {
        //Portanto, para R: A -> B monorrelação, domínio de definição é A, cada elemento de B está relacionado com,
        //no máximo, um elemento de A 
                if(relacao.equals(">")){
        }else if(relacao.equals("<")){
        }else if(relacao.equals("=")){
        }else if(relacao.equals("quadrado")){
        }else if(relacao.equals("raiz")){
        }
    }

    public static void relacaoEpimorfismo() {
         //Portanto, para R: A -> B epirrelação, conjunto imagem é B, cada elemento de A está relacionado com,
         //no máximo, um elemento de B 
                 if(relacao.equals(">")){
        }else if(relacao.equals("<")){
        }else if(relacao.equals("=")){
        }else if(relacao.equals("quadrado")){
        }else if(relacao.equals("raiz")){
        }
    }

    public static void relacaoIsomorfismo() {
        //Portanto, uma isorrelação é total, injetora, funcional e sobrejetora 
                if(relacao.equals(">")){
        }else if(relacao.equals("<")){
        }else if(relacao.equals("=")){
        }else if(relacao.equals("quadrado")){
        }else if(relacao.equals("raiz")){
        }
    }
     */
}
