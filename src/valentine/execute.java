/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author JAYATI CHANDRA
 */
public class execute {
     public static void main(String[] args) throws FileNotFoundException {
        int i;
        PrintStream out1;
        out1 = new PrintStream("output.txt");
  //      System.setOut(out1);                              only works in netbeans
       System.out.println("creating a fle ");
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enetr the no. of girls");
       int n = scanner.nextInt();
       
       Gift.generate_gifts(100);
       
       System.out.println("generating boys");
       generate.generate_boys(n);
       System.out.println("generating girls");
       generate.generate_girls(n);
       
      Valentine.question_1(n);
      Valentine.question_2(n,n);
       

    }
    
}
