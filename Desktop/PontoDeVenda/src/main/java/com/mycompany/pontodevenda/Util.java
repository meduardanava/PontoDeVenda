package com.mycompany.pontodevenda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Gustavo H. Nava
 */
public class Util {
    
    public static String converteJsonString(BufferedReader bufferReader) throws IOException {
        String resposta = "";
        String jsonString = "";
        
        while((resposta = bufferReader.readLine()) != null){
            jsonString += resposta;
        }
        
        return jsonString;
    }
    
}
