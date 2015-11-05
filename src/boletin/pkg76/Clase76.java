

package boletin.pkg76;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Clase76 {
    
    public static float darNumero(){
        float num;
       String res=JOptionPane.showInputDialog("Dame o numero");
       num=Float.parseFloat(res);
      return num;
    }
    
    public static void compararNumero(float num){
        if(num<= 100)
             JOptionPane.showMessageDialog(null, "Artigo de consumo baixo");
        else if(num>100 && num<= 500)
            JOptionPane.showMessageDialog(null, "Artigo de consumo medio");
        else if(num> 500 && num <=1000 )
            JOptionPane.showMessageDialog(null, "Artigo de consumo alto");
        else
            JOptionPane.showMessageDialog(null, "Artigo de primeria necesidade");
      
    }
    
    
}
