/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatalab2;
import java.util.regex.*;

/**
 *
 * @author TUSER
 */
public class Automatalab2 {
    
    
    
    public static boolean isCorrectStatement(String x)
    {
     
    boolean correct = true;
    String[] dataTypes = new String[] {"int","String", "char","float","long","boolean"}; 
    String dataType="false";
    boolean isCorrectDataType=false;
    
   
    String [] arr =  x.split("\\s+"); //int x = 7; => [int,x,=,7]
    
    //to look for data type
    for (int i = 0; i <= arr.length; i++) {
         if (dataTypes[i].equals(arr[0])) {
           isCorrectDataType = true;
           dataType = arr[0];
           break;
         } 
        
      }
    if(!isCorrectDataType)
    {
        System.out.println("Data is incorrect");
        correct = false;
    }
    
   //to look for variable name
   Pattern var = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");  
   Matcher varm = var.matcher(arr[1]);  
   boolean isCorrectVariableName = varm.matches();
   
   if(!isCorrectVariableName)
   {
   System.out.println("The variable name is incorrect: " + arr[1]);
   correct = false;
   }
   
   
   if(!arr[2].equals("=")){
  
       System.out.println("'=' is missing! ");
       correct = false;
        }
   
   
   //cases for each dt
  
   if(isCorrectDataType)
   {
    switch(dataType) {
  case "int":
    Pattern intr = Pattern.compile("[0-9]+");  
    Matcher intrm = intr.matcher(arr[3]);  
    boolean isCorrectInt = intrm.matches();
    if(!isCorrectInt){
        System.out.println("Given integer number is incorrect: "+arr[3]);
        correct = false;
    }
   
    break;
  case "String":
   Pattern str = Pattern.compile("");  
   Matcher strm = str.matcher(arr[3]);  
   boolean isCorrectString = strm.matches();
    if(!isCorrectString){
        System.out.println("Given string is incorrect: "+arr[3]);
        correct = false;
    }
    
    break;
   case "char":
       Pattern chr = Pattern.compile("|^|[a-zA-Z0-9,.;:-_'\\s]+$");  
   Matcher chrm = chr.matcher(arr[3]);  
   boolean isCorrectChar = chrm.matches();
    if(!isCorrectChar){
    
        System.out.println("Given char is incorrect: " +arr[3]);
        correct = false;
    }
    break;
       
   case "boolean":
          Pattern bl = Pattern.compile("true|false"); 
          Matcher blm = bl.matcher(arr[3]);  
          boolean isCorrectBool = blm.matches();
        if(!isCorrectBool){
   
        System.out.println("Given boolean value is incorrect: " +arr[3]);
         correct = false;
    }
       break;
     
   case "float":
          Pattern flt = Pattern.compile(""); 
          Matcher fltm = flt.matcher(arr[3]);  
          boolean isCorrectFloat = fltm.matches();
        if(!isCorrectFloat){
    
        System.out.println("Given float value is incorrect: " +arr[3]);
         correct = false;
    }
  default:
    // code block
      System.out.println("Given datatype  doesn't match: " + dataType);
          break;

}
   }
 
   
  if(!arr[arr.length-1].equals(";")){
       System.out.println("';' is missing! ");
   }
   
   
    return correct;

    }
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(isCorrectStatement("int 1x = 12 ;"));
    
    }
    
}
