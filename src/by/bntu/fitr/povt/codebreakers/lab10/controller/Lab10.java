package by.bntu.fitr.povt.codebreakers.lab10.controller;

import by.bntu.fitr.povt.codebreakers.lab10.model.entity.Client;
import by.bntu.fitr.povt.codebreakers.lab10.model.entity.McDonalds;
import by.bntu.fitr.povt.codebreakers.lab10.model.logic.CashBox;
import by.bntu.fitr.povt.codebreakers.lab10.view.Printer;


public class Lab10 {

    public static void main(String[] args) {
        McDonalds mcdonalds = new McDonalds("24.02.2019");
        mcdonalds.client1 = new Client("Polirov", 30, true, 0);
        mcdonalds.client2 = new Client("Zekha", 40 , false, 0);
        mcdonalds.client3 = new Client("Linkoln", 100, true, 0);
        mcdonalds.client4 = new Client("Romanov", 80, false, 0);
        mcdonalds.client5 = new Client("Levin", 90,false, 0);
        mcdonalds.client6 = new Client("Olegrova", 70, true, 0);
        double ordersCash = CashBox.calculateCash(mcdonalds);
        double salary = CashBox.calculateSalary(ordersCash);
        Printer.print(mcdonalds + "");
        Printer.print("\n Profit = " + ordersCash + " $" + 
                "\n Employees salary " + salary + " $");
    }
    
}
