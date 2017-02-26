
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine;
import java.util.Scanner;
/**
 *
 * @author JAYATI CHANDRA
 */
public class Valentine {
    /**
     * @param args the command line arguments
     */
    
   
   
    public static void match(Girls g, int n){                 //n = number of boys
        int cost = g.main_budget;
        int a = g.choosing;
        int min = g.min_level;
       
        
        int i, c = 0, k = -1, costt, cog = 0, j = 0, t;
 
         for(i = 0; i < n; i++){
           if(Global.boy[i].GF_budget > cost && Global.boy[i].commit == 0 && g.commit == 0){
                if(a == 1 && Global.boy[i].attract >= min && Global.boy[i].min_attract >= g.attract){
                    Global.boy[i].commit = 1;
                    Global.boy[i].committed_to = g.ID;
                    g.commit = 1;
                    Global.boy[i].couple_happiness = happy(Global.boy[i], g);
                     Global.boy[i].compatibility = compatibility( Global.boy[i],g);
  //                  System.out.println("the couple hapieness " + Global.boy[i].couple_happiness);
                    return;
 
                }
                else if(a == 2 && Global.boy[i].GF_budget >= min && Global.boy[i].min_attract >= g.attract ){
                    Global.boy[i].commit = 1;
                    Global.boy[i].committed_to = g.ID;
                    g.commit = 1;
                    Global.boy[i].couple_happiness = happy(Global.boy[i], g);
                    Global.boy[i].compatibility = compatibility( Global.boy[i],g);
   //                     System.out.println("the couple hapieness " + Global.boy[i].couple_happiness);
                    return;
                }
                else if(a == 3 && Global.boy[i].intelligence >= min && Global.boy[i].min_attract >= g.attract){
                    Global.boy[i].commit = 1;
                    Global.boy[i].committed_to = g.ID;
                    g.commit = 1;
                   Global.boy[i].couple_happiness = happy(Global.boy[i], g);
                   Global.boy[i].compatibility = compatibility( Global.boy[i],g);
  //                      System.out.println("the couple hapieness " + Global.boy[i].couple_happiness);
                    return;
                }
                    
               
           }
           
        }
        
        
        
    }
    public static int compatibility(Boys b, Girls g){
        int a,c, d,e;
        a = b.GF_budget - g.main_budget;
        c = Math.abs(b.attract - g.attract);
        d = Math.abs(b.intelligence - g.intelligence);
        e = a + c + d;
        return e;
    }    
    public static void couples_formed(int n){
  //          System.out.println("in couples_formed n as " + n);
            int i, c = 0;
            for(i = 0; i < n; i++){
                match(Global.girl[i], n+5);
           
            }
            System.out.println("ALL COMMITTMENTS!");
            for(i = 0; i < n+5; i++){
                
                if(Global.boy[i].commit == 1){
                    c++;
                    
                    System.out.println("the boy   " + Global.boy[i].ID + "   committed to girl  " + Global.boy[i].committed_to );
                }
            }
            if(c == 0){
                System.out.println("No committment!");
            }
            
        }
           
                           
    private static double happy(Boys b, Girls g){
        double g_happy = Girls.g_happyy(b,g);
        double happyy = 0.00;
        double b_happy = (double)Boys.b_happyy(b, g);
        if(b.type == 1 || b.type == 3)
            happyy = g_happy + b_happy;
        else if(b.type == 2){
            happyy = 2 * g_happy;
        }
        
        return happyy;
        
    }          
        
  public static void compatibile_couples(int k, int n){
        Boys temp[] = new Boys[100];
        int i, j;
        Boys temp1;
        for(i = 0; i < n+5; i++){
            temp[i] = Global.boy[i];
        }
        for(i = 0; i < n+5; i++){
            int count = 0;
            for(j = 0; j < n+4; j++){
                if(temp[j].compatibility < temp[j+1].compatibility){
                    count++;
                    temp1 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp1;
                }
            }
            if(count == 0){
                break;
            }
        }
        System.out.println("COUPLE COMPATIBILITY!!!");
        for(i = 0; i < n+5; i++){
   
            System.out.println("  ID  " + temp[i].ID + "   committed to   " + temp[i].committed_to + "  compatibility   " + temp[i].compatibility);
        }
     
    
   }    
  
  public static void gift_exchanges(int n){
      System.out.println("GIFT EXCHANGES ");
      int i, j = 0;
      for(i = 0; i < n+5; i++){
          if(Global.boy[i].commit == 1){
              j = 0;
              System.out.println("The gifts given by    " + Global.boy[i].ID + "   are of value     " + Global.boy[i].cost_of_gifts + "    gifted to   " + Global.boy[i].committed_to );
              System.out.println("Gift details ( where type 1 = essential, tepe 2 = luxury, type 3 = utility)  \n ");
              while(Global.boy[i].gift_basket[j] != null){
                  System.out.println("Gift type is   " + Global.boy[i].gift_basket[j].type +"   and price is    " + Global.boy[i].gift_basket[j].price );
                  j++;
               }
          }
          
      }
  }
 
   public static void happy_couples(int k, int n){
        Boys temp[] = new Boys[100];
        int i, j;
        Boys temp1;
        for(i = 0; i < n+5; i++){
            temp[i] = Global.boy[i];            //copying info into a temporary array
        }
//        for(i = 0; i < n+5; i++){
  //          System.out.println("" + temp[i].ID + "  happiness   "  + temp[i].couple_happiness);
    //    }
         for(i = 0; i < n+5; i++){
            int count = 0;
            for(j = 0; j < n+4; j++){
                if(temp[j].couple_happiness  < temp[j+1].couple_happiness){
                    count++;
                    temp1 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp1;
                }
            }
            if(count == 0){
                break;
            }
        }
       System.out.println("COUPLE HAPPINESS!!!");
        for(i = 0; i < n+5; i++){
   
            System.out.println("    ID  " + temp[i].ID + "  committed to    " + temp[i].committed_to + "    happiness   " + temp[i].couple_happiness);
        }
     
    
   }    
   
  
   
    
    public static void main(String[] args) {
        int i;
       System.out.println("creating a fle ");
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enetr the no. of girls");
       int n = scanner.nextInt();
       
       Gift.generate_gifts(100);
       
       System.out.println("generating boys");
       generate.generate_boys(n);
       System.out.println("generating girls");
       generate.generate_girls(n);
       
       couples_formed(n);
       happy_couples(4, n);
       compatibile_couples(4, n);
       gift_exchanges(n);

    }
    
}
