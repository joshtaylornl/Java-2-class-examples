package ca.nl.cna.java2.lambda;

import java.util.Scanner;
public class DemoLambda
{
    public static void main(String[] args)
    {
        int pounds;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter capacity for washing machine" +
                " in pounds of laundry >> ");
        pounds = input.nextInt();
        Worker washingMachine = () ->
        {
            System.out.println("I get clothes clean");
            System.out.println("   and can handle " + pounds +
                    " pounds of laundry at a time.");
        };
        washingMachine.work();
    }
}