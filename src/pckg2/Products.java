package pckg2;

import pckg1.eCommerce;

public class Products {
    public void displayCompany()
    {
        System.out.print("Different package");
    }
    public static void main(String[] args) {
        eCommerce P1 = new eCommerce();
        P1.publicMethod();
    }
}
