package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PadraoLeitura {

//<editor-fold defaultstate="collapsed" desc="Código Antigo">
    /*    public static void identificaPadrao(ArrayList<String> arquivo) {
    Iterator<String> arquivoInterado = arquivo.iterator();
    String padraoConjuntoElemento = "(^[a-z].*)";
    Pattern padraoCompilado = Pattern.compile(padraoConjuntoElemento);
    
    while (arquivoInterado.hasNext()) {
    Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
    if (combinador.find()) {
    System.out.println(combinador.group(0));
    }
    
    }
    }*/
//</editor-fold>
    public static ArrayList<String> identificaConjunto(ArrayList<String> arquivo) {
        //<editor-fold defaultstate="collapsed" desc="Código Antigo">
        /*Iterator<String> arquivoInterado = arquivo.iterator();
        String padraoConjuntoElemento = "(^[A-Z].*)";
        Pattern padraoCompilado = Pattern.compile(padraoConjuntoElemento);
        ArrayList<String> grupoConjuntos = new ArrayList<String>();
        while (arquivoInterado.hasNext()) {
            Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
            if (combinador.find()) {
            //System.out.println(combinador.group(0));
                grupoConjuntos.add(combinador.group(0));
            }
        }
        return grupoConjuntos;
         */
        //</editor-fold>
    }

    public static ArrayList<String> identificaElemento(ArrayList<String> arquivo) {

        Iterator<String> arquivoInterado = arquivo.iterator();
        String padraoConjuntoElemento = /*(^[a-z].*)*/ "([0-999].*)";
        Pattern padraoCompilado = Pattern.compile(padraoConjuntoElemento);
        ArrayList<String> grupoElementos = new ArrayList<String>();

        while (arquivoInterado.hasNext()) {
            Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
            if (combinador.find()) {
                //System.out.println(combinador.group(0));
                grupoElementos.add(combinador.group(0));
                System.out.println("Passou");
                //grupoElementos.add(combinador.group(1));
            }

        }

        return grupoElementos;
    }

}
