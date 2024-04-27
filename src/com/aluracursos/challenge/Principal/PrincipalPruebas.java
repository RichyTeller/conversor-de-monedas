package com.aluracursos.challenge.Principal;

import com.aluracursos.challenge.Consultas.ValorMonedas;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrincipalPruebas {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/3574dd9f7e58abe7e3a6590c/latest/USD"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        ValorMonedas monedas = gson.fromJson(json, ValorMonedas.class);

//        System.out.println("Los valores de las monedas son: " + monedas.conversion_rates());

        List<Map<String, Double>> monedasUsadas = new ArrayList<>();
        monedasUsadas.add(monedas.conversion_rates());
        System.out.println(monedasUsadas);
    }
}
