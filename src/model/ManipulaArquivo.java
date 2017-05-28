package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipulaArquivo {

    public static ArrayList<String> abrirArquivo(String caminhoArquivo) throws FileNotFoundException {
        
        InputStream caminhoBuffer = new BufferedInputStream(new FileInputStream(caminhoArquivo));
        Scanner leitor = new Scanner(caminhoBuffer);
        ArrayList<String> arquivo = new ArrayList<String>();
        while (leitor.hasNext()) {
            arquivo.add(leitor.nextLine());
        }

        return arquivo;
    }

}
