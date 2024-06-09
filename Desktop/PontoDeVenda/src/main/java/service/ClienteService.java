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
import model.Cliente;

/**
 * @author Gustavo H. Nava
 */
public class ClienteService {
    
    private static String URLWEBSERVICE = "http://localhost:8080/api/cliente";
    private static int SUCESSO = 200;
    
    public static List<Cliente> carregaClientes() throws IOException{
        
        List<Cliente> clientes = null;
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
        Type listaClientes = new TypeToken<List<Cliente>>() {}.getType();
        clientes = gson.fromJson(resposta.toString(), listaClientes);

        return clientes;
    }
    
    public static void salvaCliente(Cliente cliente) throws IOException {
        
        String urlChamada = URLWEBSERVICE;
        
        URL url = new URL(urlChamada);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("POST");
        conexao.setDoOutput(true);
        
        if (conexao.getResponseCode() != SUCESSO) {
            throw new RuntimeException("Erro ao conectar: " + conexao.getResponseMessage());
        }
        
        Gson gson = new Gson();
        String clienteSalvo = gson.toJson(cliente);
        
        //
        // AINDA NÃO ESTÁ TERMINADO
        //
        //
        byte[] input = jsonIn
    }
    
}