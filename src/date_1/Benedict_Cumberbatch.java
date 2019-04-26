/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_1;

import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DECADES;

/**
 *
 * @author TOSHIBA
 */
public class Benedict_Cumberbatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate nacio,now,cumple;        
        
        nacio=LocalDate.of(1976, Month.JULY, 19);
        now=LocalDate.now();
        if(nacio.isLeapYear()==true){
            System.out.println("Era biciesto el año en que nacio Benedict: SI");
        }else{
            System.out.println("Era biciesto el año en que nacio Benedict: NO");
        }
        System.out.println("En el año que nacio Benedict habian: "+nacio.lengthOfYear()+" dias.");
        long decades=nacio.until(now, DECADES);
        System.out.println("Benedict ha vivido: "+decades +" Decadas.");
         cumple=nacio.plusYears(21);
        System.out.println(cumple.getDayOfWeek());
        
        
        
        
    }
    
}
