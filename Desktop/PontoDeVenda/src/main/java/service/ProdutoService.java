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
import model.Produto;

/**
 * @author Gustavo H. Nava
 */
public class ProdutoService {
    
    private static String URLWEBSERVICE = "http://localhost:8080/api/produto";
    private static int SUCESSO = 200;
    
    public static List<Produto> carregaProdutos() throws IOException{
        
        List<Produto> produtos = null;
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
        Type listaProdutos = new TypeToken<List<Produto>>() {}.getType();
        produtos = gson.fromJson(resposta.toString(), listaProdutos);

        return produtos;
    }
    
}
