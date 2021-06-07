/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String order=in.nextLine();

        System.out.print("What state do you live in? ");
        String state=in.nextLine();

        double tax=0;
        double total=Double.parseDouble(order);

        if(state.equals("Wisconsin")){
            tax=total*.05;
            System.out.print("What county do you live in? ");
            String county=in.nextLine();

            if(county.equals("Eau Claire")){
                tax+=total*.005;
            }
            if(county.equals("Dunn")){
                tax+=total*.004;
            }
        }

        if(state.equals("Illinois")){
            tax=total*.08;
        }

        tax=Math.round(tax*100.0)/100.0;
        total=Math.round(total*100.0)/100.0;

        System.out.print("The tax is "+String.format("%.2f",tax)+".\nThe total is "+String.format("%.2f",total+tax)+".");
    }
}
