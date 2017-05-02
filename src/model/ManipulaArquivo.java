package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ManipulaArquivo {

    public static void lerArquivo (String caminhoArquivo) throws FileNotFoundException{
        InputStream caminhoBuffer = new BufferedInputStream(new FileInputStream(caminhoArquivo));
        Scanner leitor = new Scanner (caminhoBuffer);
        while(leitor.hasNext()){
            System.out.println(leitor.nextLine());
        }
        
    
    }
    
}
