/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatalab1;
import java.util.regex.*;

/**
 *
 * @author TUSER
 */
public class Automatalab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // even even
        Pattern p1 = Pattern.compile("(aa|bb|(ab|ba)(aa|bb)*(ab|ba))*");
           // odd odd
        Pattern p2 = Pattern.compile("(aa|bb|(ab|ba)(aa|bb)*(ab|ba))*(ab|ba)(aa|bb)*");
             // even odd
        Pattern p3 = Pattern.compile("b*(ab*ab*)*");
             //  odd even
       Pattern p4 = Pattern.compile("(aa|ab|ba|bb)*(a|b)");
        
        
        
        String input ="c";
        
        
       if( p1.matcher(input).matches()){
              System.out.println("matches with EVEN EVEN");
       }
       else if (p2.matcher(input).matches()) {
             System.out.println("matches with ODD ODD");
       }
        else if (p3.matcher(input).matches()) {
             System.out.println("matches with EVEN ODD");
       }
          else if (p4.matcher(input).matches()) {
             System.out.println("matches with ODD EVEN");
       }
          else{
                 System.out.println("invalid");
                  }
         
    }
    
}
