package com.aluracursos.challenge.Principal;

import com.aluracursos.challenge.Consultas.ConsultaApi;
import com.aluracursos.challenge.Consultas.ValorMonedas;

import java.io.IOException;

public class Principal{
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaApi consulta = new ConsultaApi();
        ValorMonedas monedas = consulta.obtenerTasasDeCambio();
        System.out.println(monedas.conversion_rates());
    }
}

