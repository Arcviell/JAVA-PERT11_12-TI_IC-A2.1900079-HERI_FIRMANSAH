/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1MenanganiExceptionHandling;

/**
 *
 * @author Heri Firmansah
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    try{
          System.out.println(args[1]);
    }catch(ArrayIndexOutOfBoundsException exp){
        System.out.println("Exception caught!");
    }}}