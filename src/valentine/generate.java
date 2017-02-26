/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JAYATI CHANDRA
 */
public class generate {
      
    public static void generate_boys(int n){
        int i;
 /*   int type, cost, i;
    PrintWriter writer = null;
        try {
            writer = new PrintWriter("C:\\Users\\JAYATI CHANDRA\\Desktop\\test.txt", "UTF-8");
            
        
        for(i = 0; i < n; i++){
           Boys b = new Boys();
           Global.boy[i] = b;
           writer.println(Global.boy[i]);
        }
    
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(generate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(generate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            writer.close();
        }

 
   *///   System.out.println("in generate boys with n as" + n);
        for(i = 0; i < n+5; i++){
           Boys b = Boys.create_boy(n);
           Global.boy[i] = b;
  //         writer.println(Global.boy[i]);
        }
        
        
    }  
    
     public static void generate_girls(int n){
        int type, cost, i;
        for(i = 0; i < n; i++){
           Girls g = new Girls();
           Global.girl[i] = g;
 //        System.out.println("type is \t " + Global.girl[i].type + "budget is \t" + Global.girl[i].main_budget+ "id is " + Global.girl[i].ID + "\t choosing criteria" + Global.girl[i].choosing);
        }
    }
    
}
