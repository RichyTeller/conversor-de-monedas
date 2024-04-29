package com.aluracursos.challenge.Principal;

import com.aluracursos.challenge.Consultas.ConsultaApi;
import com.aluracursos.challenge.Consultas.ValorMonedas;

import java.io.IOException;
import java.util.*;

public class Principal{
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaApi consulta = new ConsultaApi();
        ValorMonedas monedas = consulta.obtenerTasasDeCambio();
        int opcion = 0;
        String menu = """
                ****************************************************
                Sea bienvenido/a al conversor de Monedas.
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                
                ****************************************************
                Elija una opción válida:
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7){
            // Obtener todas las tasas de conversión disponibles
            Map<String, Double> valorMonedas = monedas.conversion_rates();
            System.out.println(menu);
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("*** Debe proporcionar un valor numérico ***");
                teclado.next(); // Limpia el buffer del Scanner para evitar un bucle infinito
            }
            try {
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir:");
                        double montoColsultar = teclado.nextDouble();
                        double tasaArs = valorMonedas.get("ARS");
                        double cambio = montoColsultar * tasaArs;
                        cambio = Math.round(cambio * 100.0) / 100.0; // Redondear a dos decimales
                        System.out.println("El valor " + montoColsultar + " [USD] " + "corresponde al valor final de =>>> " + cambio + " [ARS]");
                        System.out.println("Digite 1 si desea realizar otra conversión, de lo contrario digite 7 para salir.");
                        opcion = teclado.nextInt();
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir:");
                        double montoColsultar2 = teclado.nextDouble();
                        double tasaPesoArg = valorMonedas.get("ARS");
                        double cambio2 = montoColsultar2 / tasaPesoArg;
                        cambio2 = Math.round(cambio2 * 100.0) / 100.0; // Redondear a dos decimales
                        System.out.println("El valor " + montoColsultar2 + " [ARS] " + "corresponde al valor final de =>>> " + cambio2 + " [USD]");
                        System.out.println("Digite 1 si desea realizar otra conversión, de lo contrario digite 7 para salir.");
                        opcion = teclado.nextInt();
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir:");
                        double montoColsultar3 = teclado.nextDouble();
                        double tasaRealBrasi = valorMonedas.get("BRL");
                        double cambio3 = montoColsultar3 * tasaRealBrasi;
                        cambio3 = Math.round(cambio3 * 100.0) / 100.0; // Redondear a dos decimales
                        System.out.println("El valor " + montoColsultar3 + " [USD] " + "corresponde al valor final de =>>> " + cambio3 + " [BRL]");
                        System.out.println("Digite 1 si desea realizar otra conversión, de lo contrario digite 7 para salir.");
                        opcion = teclado.nextInt();
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir:");
                        double montoColsultar4 = teclado.nextDouble();
                        double tasaBrl = valorMonedas.get("BRL");
                        double cambio4 = montoColsultar4 / tasaBrl;
                        cambio4 = Math.round(cambio4 * 10000.0) / 10000.0; // Redondear a dos decimales
                        System.out.println("El valor " + montoColsultar4 + " [BRL] " + "corresponde al valor final de =>>> " + cambio4 + " [USD]");
                        System.out.println("Digite 1 si desea realizar otra conversión, de lo contrario digite 7 para salir.");
                        opcion = teclado.nextInt();
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir:");
                        double montoColsultar5 = teclado.nextDouble();
                        double tasaCop = valorMonedas.get("COP");
                        double cambio5 = montoColsultar5 * tasaCop;
                        cambio5 = Math.round(cambio5 * 100.0) / 100.0; // Redondear a dos decimales
                        System.out.println("El valor " + montoColsultar5 + " [USD] " + "corresponde al valor final de =>>> " + cambio5 + " [COP]");
                        System.out.println("Digite 1 si desea realizar otra conversión, de lo contrario digite 7 para salir.");
                        opcion = teclado.nextInt();
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir:");
                        double montoColsultar6 = teclado.nextDouble();
                        double tasaPesoColombian = valorMonedas.get("COP");
                        double cambio6 = montoColsultar6 / tasaPesoColombian;
                        cambio6 = Math.round(cambio6 * 100.0) / 100.0; // Redondear a dos decimales
                        System.out.println("El valor " + montoColsultar6 + " [BRL] " + "corresponde al valor final de =>>> " + cambio6 + " [USD]");
                        System.out.println("Digite 1 si desea realizar otra conversión, de lo contrario digite 7 para salir.");
                        opcion = teclado.nextInt();
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("*** " +
                        "Debe proporcionar un valor numérico *** " +
                        "\nPor favor seleccione una opcioón de nuevo.");
                teclado.next(); // Limpia el buffer del Scanner para evitar un bucle infinito
                continue;
            }
            if (opcion == 7){
                System.out.println("Finalizando el programa... ¡¡Gracias!!");
                break;
            }
        }
    }
}