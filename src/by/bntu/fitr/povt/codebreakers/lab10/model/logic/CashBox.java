package by.bntu.fitr.povt.codebreakers.lab10.model.logic;

import by.bntu.fitr.povt.codebreakers.lab10.model.entity.McDonalds;


public class CashBox {
    
    public static double calculateCash(McDonalds mcdonalds) {
        int profit = mcdonalds.client1.cash + mcdonalds.client2.cash
                + mcdonalds.client3.cash + mcdonalds.client4.cash
                + mcdonalds.client5.cash + mcdonalds.client6.cash;
        return profit;
    }

    public static double calculateSalary(double profit) {
          final int NUMBER_OF_EMPOYEES = 5;
        return profit / NUMBER_OF_EMPOYEES;
    }
}
