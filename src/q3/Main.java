package q3;

public class Main {
    public static void main(String args[]){
        Vendedor v1 = new Vendedor(25,"Rogério");
        Vendedor v2 = new Vendedor(30,"Márcia");

        Loja l1 = new Loja("Samsung","Eletrónicos",1969);


        l1.admitirVendedor(v1);
        v1.vender();
        l1.demitirVendedor(v1);

        l1.admitirVendedor(v2);
        v2.vender();
        l1.demitirVendedor(v2);




    }
}
