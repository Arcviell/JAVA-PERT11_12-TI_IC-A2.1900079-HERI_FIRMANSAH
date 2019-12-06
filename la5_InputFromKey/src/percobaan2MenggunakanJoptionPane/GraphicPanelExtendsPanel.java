/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2MenggunakanJoptionPane;

/**
 *
 * @author Heri Firmansah
 */
 import javax.swing.JOptionPane;
public class GraphicPanelExtendsPanel {
    
  public static void main (String[] args) {
      String name = "";
      name = JOptionPane.showInputDialog ("Pease enter your name");
              String msg = "hello " +name+"!";
              JOptionPane.showMessageDialog (null, msg);
  
 
 } 
    
}
