package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PadraoLeitura {

    private static final String padraoConjuntoArquivo = "(^[A-Z].*)";
    private static final String padraoElementoArquivo = "(^[a-z].*)";
    private static final String padraoElemento = "[0-9]+";
    private static final String padraoNomeConjunto = "(^[A-Z])";
    private static final String padraoNomeElemento = "(^[a-z])";

    public static ArrayList<String> identificaConjuntos(ArrayList<String> arquivo) {

        Iterator<String> arquivoInterado = arquivo.iterator();
        Pattern padraoCompilado = Pattern.compile(padraoConjuntoArquivo);
        ArrayList<String> grupoConjuntos = new ArrayList<String>();

        while (arquivoInterado.hasNext()) {
            Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
            if (combinador.find()) {
                grupoConjuntos.add(combinador.group());
            }
        }

        return grupoConjuntos;

    }

    public static ArrayList<String> identificaElementos(ArrayList<String> arquivo) {

        Iterator<String> arquivoInterado = arquivo.iterator();
        Pattern padraoCompilado = Pattern.compile(padraoElementoArquivo);
        ArrayList<String> grupoElementos = new ArrayList<String>();

        while (arquivoInterado.hasNext()) {
            Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
            if (combinador.find()) {
                grupoElementos.add(combinador.group());
            }
        }

        return grupoElementos;
    }

    public static String decompoeElemento(String linha) {

        String elementoDecomposto = "";
        Pattern padraoCompilado = Pattern.compile(padraoElemento);
        Matcher combinador = padraoCompilado.matcher(linha);
        while (combinador.find()) {
            elementoDecomposto = elementoDecomposto + combinador.group();
        }
        return elementoDecomposto;
    }

    public static ArrayList<String> decompoeElementos(String linha) {

        ArrayList<String> elementoDecomposto = new ArrayList<>();
        Pattern padraoCompilado = Pattern.compile(padraoElemento);
        Matcher combinador = padraoCompilado.matcher(linha);
        while (combinador.find()) {
            elementoDecomposto.add(combinador.group());
        }
        return elementoDecomposto;
    }

    public static String nomeConjunto(String conjunto) {

        String nomeConjunto = "";
        Pattern padraoCompilado = Pattern.compile(padraoNomeConjunto);
        Matcher combinador = padraoCompilado.matcher(conjunto);
        while (combinador.find()) {
            nomeConjunto = combinador.group();
        }
        return nomeConjunto;
    }

    public static String nomeElemento(String elemento) {

        String nomeElemento = "";
        Pattern padraoCompilado = Pattern.compile(padraoNomeElemento);
        Matcher combinador = padraoCompilado.matcher(elemento);
        while (combinador.find()) {
            nomeElemento = combinador.group();
        }
        return nomeElemento;
    }
}
