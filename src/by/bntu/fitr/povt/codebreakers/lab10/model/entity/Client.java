package by.bntu.fitr.povt.codebreakers.lab10.model.entity;

import java.util.Random;

public class Client {

    public static int clientAmount;
    public String name;
    public int cash;
    public boolean regularCustomer;
    public int sale;

    static {
        clientAmount = 0;
    }

    {
        clientAmount++;
    }

    public Client() {
        name = "no name";
        cash = 3;
        regularCustomer = false;
        sale = 0;
    }

    public Client(String name, int cash, boolean regularCustomer, int sale) {
        this.name = name;
        this.cash = cash;
        this.regularCustomer = regularCustomer;
        this.sale = sale;
    }

    public Client(Client client) {
        name = client.name;
        cash = client.cash;
        regularCustomer = client.regularCustomer;
        sale = client.sale;
    }

    @Override
    public String toString() {
        if (regularCustomer == true) {
            sale = cash * 5 / 100;
        }
        return name + " (" + cash + " $):  discoun sale: " + (cash - sale);
    }

    public class characters {

    }
}
