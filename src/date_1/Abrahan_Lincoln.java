/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_1;

import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.Calendar;
//import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author TOSHIBA
 */
public class Abrahan_Lincoln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalDate nacio, murio;
        long iteracion;

        nacio = LocalDate.of(1809, Month.FEBRUARY, 12);
        murio = LocalDate.of(1855, Month.APRIL, 15);
        long years = nacio.until(murio, YEARS);
        long days = nacio.until(murio, DAYS);
        System.out.println("=====Dias del año en el que nacio: " + nacio.lengthOfYear());
        System.out.println("Abraham Lincoln\nNacio: " + nacio);
        System.out.println("Murio: " + murio);
        System.out.println("Tenia " + years + " anos, cuando murio.");
        System.out.println("Vivio " + days + " dias");

    }

}
