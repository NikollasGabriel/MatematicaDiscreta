package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PadraoLeitura {

    public static ArrayList<String> identificaConjunto(ArrayList<String> arquivo) {
        
        Iterator<String> arquivoInterado = arquivo.iterator();
        String padraoConjuntoElemento = "(^[A-Z].*)";
        Pattern padraoCompilado = Pattern.compile(padraoConjuntoElemento);
        ArrayList<String> grupoConjuntos = new ArrayList<String>();
        
        while (arquivoInterado.hasNext()) {
            Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
            if (combinador.find()) {
                grupoConjuntos.add(combinador.group(0));
            }
        }
        
        return grupoConjuntos;

    }

    public static ArrayList<String> identificaElemento(ArrayList<String> arquivo) {

        Iterator<String> arquivoInterado = arquivo.iterator();
        String padraoElemento = "(^[a-z].*)";
        Pattern padraoCompilado = Pattern.compile(padraoElemento);
        ArrayList<String> grupoElementos = new ArrayList<String>();

        while (arquivoInterado.hasNext()) {
            Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
            if (combinador.find()) {
                grupoElementos.add(combinador.group());
            }
        }

        return grupoElementos;
    }
    
    public static String decompoeConjunto (String conjunto){
        //String padraoElementoConjunto = /*"(?<!=)[0-999]\\w";*/ /*"[0-999]+";*/ "\\d+";
        String elementosConjuntoDecompostos = "";
        Pattern padraoCompilado = Pattern.compile("(?<!=)[0-999]");//,([^,]*[0-999][^,]*),
        Matcher combinador = padraoCompilado.matcher(conjunto);
        while (combinador.find()) {
            elementosConjuntoDecompostos = elementosConjuntoDecompostos + combinador.group();
        }
        return elementosConjuntoDecompostos;
    }
    
    public static String decompoeElemento (String elemento){
        String padraoElemento = "[0-999]";
        String elementoDecomposto = "";
        Pattern padraoCompilado = Pattern.compile(padraoElemento);
        Matcher combinador = padraoCompilado.matcher(elemento);
        while (combinador.find()) {
            elementoDecomposto = elementoDecomposto + combinador.group();
        }
        return elementoDecomposto;
    }
    
    public static String nomeConjunto (String conjunto){
        String padraoNomeConjunto = "(^[A-Z])";
        String nomeConjunto = "";
        Pattern padraoCompilado = Pattern.compile(padraoNomeConjunto);
        Matcher combinador = padraoCompilado.matcher(conjunto);
        while (combinador.find()) {
            nomeConjunto = combinador.group();
        }
        return nomeConjunto;
    }
    
    public static String nomeElemento (String elemento){
        String padraoNomeElemento = "(^[a-z])";
        String nomeElemento = "";
        Pattern padraoCompilado = Pattern.compile(padraoNomeElemento);
        Matcher combinador = padraoCompilado.matcher(elemento);
        while (combinador.find()) {
            nomeElemento = combinador.group();
        }
        return nomeElemento;
    }
}



