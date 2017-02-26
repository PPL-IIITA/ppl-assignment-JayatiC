/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine;

/**
 *
 * @author JAYATI CHANDRA
 */
public class Boys {
    int ID;
    int attract;
    int GF_budget;
    int intelligence;
    int type;
    int min_attract;
    int commit;
    int committed_to;
    int cost_of_gifts;
    double couple_happiness;
    int compatibility;
    Gift gift_basket[] = new Gift[100];
    
    private Boys() {
        ID = ++Global.counter;
        attract = 1 + (int)(Math.random() * 20);
        GF_budget = 10 + (int)(Math.random() * 100);
        intelligence = 5 + (int)(Math.random() * 20);
        min_attract = 3 + (int)(Math.random() * 20);
        type = 1 + (int)(Math.random() * 3);
        commit = 0;
        
    }
     
    public static Boys create_boy(int n){
        Boys b = new Boys();
 //       System.out.println("in create boys with n as " + n);
        
       create_basket(b, Global.gifts,n+5 );
       return b;
    }
    private static void create_basket(Boys b, Gift gifts[], int n){ //n = number of boys
   //     System.out.println("in create basket with n" + n);
        int cost = 0, i, j = 0;
        if(b.type == 1){
            for(i = 0; i < 100 && cost <= b.GF_budget; i++){
                cost += gifts[i].price;
                
                b.gift_basket[i] = gifts[i];
     //           System.out.println("the element type " + gifts[i].type + "price   " + gifts[i].price + "at index " + i + "boy type" + b.type);
        
            }
            b.cost_of_gifts = cost ;
           
        }
        else if(b.type == 2){
            
            for(i = 99; i >= 0 && cost <= b.GF_budget; i--){
                cost += gifts[i].price;                             //adding gifts from the max end
                b.gift_basket[j] = gifts[i];
       //         System.out.println("the element type " + gifts[i].type + "price   " + gifts[i].price + "at index " + j + "boy type" + b.type);
                j++;
            }
             b.cost_of_gifts = cost ;
        }
        else if(b.type == 3){
            for(i = 0; i < 100 && cost <= b.GF_budget; i++){
                cost += gifts[i].price;
                b.gift_basket[i] = gifts[i];
         //       System.out.println("the element type " + gifts[i].type + "price   " + gifts[i].price + "at index " + i + "boy type" + b.type);
            }
             b.cost_of_gifts = cost ;
        }
                
    }
    public static int b_happyy(Boys b, Girls g){
        int cost = 0;
        if(b.type == 1){
            cost = b.cost_of_gifts - g.main_budget;
        }
        else if(b.type == 3){
            cost = g.intelligence;
        }
        else if(b.type == 2){
            cost = 0;
        }
        return cost;
    }
}

