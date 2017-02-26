package valentine;
import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JAYATI CHANDRA
 */
public class Girls{
    int ID;
    int attract;
    int main_budget;
    int intelligence;
    int choosing;
    int type;
    int min_level;
    int commit;
    int committed_to;
    int basket[] = new int[100];
    public Girls() {
        ID = ++Global.counter;
        attract = 1 + (int)(Math.random() * 20);
        main_budget =10 +  (int)(Math.random() * 100);
        intelligence =5 +  (int)(Math.random() * 20);
        choosing = 1 + (int)(Math.random() * 3);
        type = 1 + (int)(Math.random() * 3);
        min_level = 1 + (int)(Math.random() * 10);
        commit = 0;
    }
    
    public static double g_happyy(Boys b, Girls g){
        int  t, cog = 0, j= 0;
        int cost = g.main_budget;
        Double d,    b_happy, g_happy = 0.00, happy;

            if(g.type == 1){
                while(b.gift_basket[j] != null){
                    if(b.gift_basket[j].type == 2){
                        t = 2*b.gift_basket[j].value + b.gift_basket[j].price;
                               
                    }
                    else {
                         t = b.gift_basket[j].value + b.gift_basket[j].price;
                    }
                                
                    cog += t;
                    j++;
                }
                d = (double)cog/cost;
                g_happy = Math.log(d);
            }
            else if(g.type == 2){
                while(b.gift_basket[j] != null){
                                
                    t = b.gift_basket[j].value + b.gift_basket[j].price;
                                
                    j++;            
                    cog += t;
                }
                g_happy = (double)cog/cost;
            }
            else if(g.type == 3){
                while(b.gift_basket[j] != null){
                                
                    t = b.gift_basket[j].price;
                                
                    j++;            
                    cog += t;
                }
                g_happy = Math.pow(cost,cog );
            }
           return g_happy;
    }

}