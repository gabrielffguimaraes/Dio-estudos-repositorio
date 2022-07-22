package frete.api.service;

import frete.api.helpers.Helper;
import frete.api.model.Endereco;
import com.google.gson.GsonBuilder;
import frete.api.model.Servicos;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ViacepService {
    private final String BASE_URL = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx";

    public Object getCep(String cepOrigem, String cepDestino) {
        try {
            Servicos servicos;
            String xml;
            RestTemplate restTemplate = new RestTemplate();
            xml = restTemplate.getForObject(BASE_URL+"?nCdEmpresa=&sDsSenha=&nCdServico=04510&sCepOrigem=21832006&sCepDestino=23950-100&nVlPeso=1&nCdFormato=1&nVlComprimento=15&nVlAltura=15&nVlLargura=15&nVlDiametro=0&sCdMaoPropria=N&nVlValorDeclarado=0&sCdAvisoRecebimento=N&StrRetorno=xml", String.class);
            return Helper.xmlToJson(xml,Servicos.class);
        }
        catch (HttpClientErrorException e) {
            System.out.println(e.getRawStatusCode());
            return "";
        } catch (JAXBException e) {
            System.out.println(e.getCause());
            return "";
        }

    }

}
