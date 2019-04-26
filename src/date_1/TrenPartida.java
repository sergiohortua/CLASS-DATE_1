/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 *
 * @author TOSHIBA
 */
public class TrenPartida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalTime partida, llegada;

        partida = LocalTime.of(13, 45);
        llegada = LocalTime.of(19, 25);
        long tmpViaje = partida.until(llegada, MINUTES);
        System.out.println("===>>>>><<<<<===");
        System.out.println("Un tren parte de Boston a la 1:45 pm y llega New York a las 7:25 pm");
        System.out.println("Tiempo del viaje fue: " + tmpViaje + " minutos.");
        System.out.println("===>>>>><<<<<===");

        LocalTime retrazo = llegada.plusHours(1).plusMinutes(19);

        System.out.println("===>>>>><<<<<===\n!Como el tren tubo un retrazo de 1 hora y 19 minutos¡");
        System.out.println("El nuevo tiempo de llegada es: " + retrazo + " ");
        System.out.println("===>>>>><<<<<===");

    }

}
