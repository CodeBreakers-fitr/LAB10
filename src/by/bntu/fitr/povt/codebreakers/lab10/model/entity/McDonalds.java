package by.bntu.fitr.povt.codebreakers.lab10.model.entity;

public class McDonalds {

    public String day;
    public Client client1;
    public Client client2;
    public Client client3;
    public Client client4;
    public Client client5;
    public Client client6;

    public McDonalds() {
    }

    public McDonalds(String day) {
        this.day = day;

    }

    public McDonalds(String day, Client cl1, Client cl2, Client cl3,
            Client cl4, Client cl5, Client cl6) {
        client1 = cl1;
        client2 = cl2;
        client3 = cl3;
        client1 = cl4;
        client2 = cl5;
        client3 = cl6;
    }

    public McDonalds(McDonalds mcdonalds) {
        day = mcdonalds.day;
        client1 = mcdonalds.client1;
        client2 = mcdonalds.client2;
        client3 = mcdonalds.client3;
        client4 = mcdonalds.client4;
        client5 = mcdonalds.client5;
        client6 = mcdonalds.client6;
    }
    
    @Override
    public String toString() {
        return "Orders \n Day : " + day + ":\n"
                + client1 + "\n" + client2 + "\n" + client3
                + "\n" + client4 + "\n" + client5 + "\n" + client6 + "\n";
    }
    

}
