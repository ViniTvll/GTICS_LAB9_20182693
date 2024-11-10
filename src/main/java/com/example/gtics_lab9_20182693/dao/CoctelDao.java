package com.example.gtics_lab9_20182693.dao;

import com.example.gtics_lab9_20182693.entity.Coctel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoctelDao {

    private static final String URL_COCKTAILS = "https://www.thecocktaildb.com/api/json/v1/1/filter.php?c=Cocktail";

    public List<Coctel> listar() {

        List<Coctel> lista = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();

        String endPoint = "http://localhost:8080/product";

        ResponseEntity<Coctel[]> responseEntity = restTemplate.getForEntity(URL_COCKTAILS, Coctel[].class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            Coctel[] body = responseEntity.getBody();
            lista = Arrays.asList(body);
        }

        return lista;
    }
}
