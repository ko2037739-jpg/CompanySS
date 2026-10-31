

package Companys;

import java.util.List;

public class PayrollManager {
    
   public static void 
           addBounsPoints(List<? super Integer>List){
               List.add(500);
               List.add(1000);
           }
           public static double
                   CalculateTotal(List<? extends Number>number){
                       double total = 0.0;
                       for(Number n: number){
                           total += n.doubleValue();
                          
                       }
                       return total;
                   }