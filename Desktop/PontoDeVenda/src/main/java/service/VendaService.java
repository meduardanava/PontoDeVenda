package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.pontodevenda.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import model.Venda;

/**
 * @author Gustavo H. Nava
 */
public class VendaService {
    
    private static String URLWEBSERVICE = "http://localhost:8080/api/venda";
    private static int SUCESSO = 200;
    
    public static List<Venda> carregaVendas() throws IOException{
        
        List<Venda> vendas = null;
        String urlChamada = URLWEBSERVICE;

        URL url = new URL(urlChamada);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");

        if (conexao.getResponseCode() != SUCESSO) {
            throw new RuntimeException("Erro ao conectar: " + conexao.getResponseMessage());
        }

        BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

        String json = Util.converteJsonString(resposta);

        Gson gson = new Gson();
        Type listaVendas = new TypeToken<List<Venda>>() {}.getType();
        vendas = gson.fromJson(resposta.toString(), listaVendas);

        return vendas;
    }
    
}
