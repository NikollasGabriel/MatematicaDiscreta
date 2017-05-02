package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PadraoLeitura {
    
    public static void identificaPadrao(ArrayList arquivo){
        Iterator<String> arquivoInterado = arquivo.iterator();
        String padraoConjuntoElemento = "(^[A-Z])(^[a-z])";
        Pattern padraoCompilado = Pattern.compile(padraoConjuntoElemento);
        
        //Matcher combinador = padraoCompilado.matcher(line);
        while (arquivoInterado.hasNext()) {
            //System.out.println(leitor.nextLine());
            Matcher combinador = padraoCompilado.matcher(arquivoInterado.next());
            System.out.println(combinador);
        }
    }
    
}
