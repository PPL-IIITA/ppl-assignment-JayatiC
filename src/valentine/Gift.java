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
public class Gift {
    int price;
    int value;
    int type;

    public Gift() {
        price = 1 +  (int)(Math.random() * 20);
        value = 1 +  (int)(Math.random() * 20);
        type = 1 + (int)(Math.random() * 3);
    }
    
    private static void gifts(int n){
       int type, i;
       for(i = 0;  i< n; i++){
 /*        type = 1 + (int)(Math.random() * 3);
         if(type == 1){
             System.out.println("generating essential");
             Gift g = new Gift();
             Global.gifts[i] = g;
         }
         else if(type == 2 ){
             System.out.println("generating luxury");
             Luxury g = new Luxury();
             Global.gifts[i] = g;
         }
         else if(type == 3){
             System.out.println("generating Utility");
             Utility g = new Utility();
             Global.gifts[i] = g;
         }
*/
           Gift g = new Gift();
           Global.gifts[i] = g;
         }
    }
    
    private static void Sort(Gift a[], int n){
        int i, j;
        Gift temp;
        for(i = 0; i < n; i++){
            int count = 0;
            for(j = 0; j < n-1; j++){
                if(a[j].price > a[j+1].price){
                    count++;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if(count == 0){
                break;
            }
        }
        
 //       System.out.println("sortin of gifts done!:");
//        for(i = 0; i<n; i++){
  //          System.out.println("" + a[i].price);
    //    }
    }
    
    public static void generate_gifts(int n){
        gifts(n);
        Sort(Global.gifts, n);
    }
    
}
/*class Luxury extends Gift{
    int luxury;
    int difficulty_to_obtain;

    public Luxury() {
        price = (int)(Math.random() * 40);
        value = (int)(Math.random() * 40);
        luxury = (int)(Math.random() * 10);
        difficulty_to_obtain = (int)(Math.random() * 10);
        
    }
}

class Utility extends Gift{
    int utility_value;
    int utility_class;

    public Utility() {
        price = (int)(Math.random() * 30);
        value = (int)(Math.random() * 30);
        utility_value = (int)(Math.random() * 10);
        utility_class = (int)(Math.random() * 10);
        
    }
*/
