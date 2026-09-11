package pckg1;

public class eCommerce {

    private void privateMethod(){
        System.out.print("This is private! ");
    }
    void defaultMethod(){
        System.out.print("This is by default! ");
    }
    protected void protectedMethod(){
        System.out.print("This is protected! ");
    }
    public void publicMethod(){
        System.out.print("This is public from eCommerce! ");
    }
    public final void publicFinalMethod(){
        System.out.print("This is public final! ");
    }
    public static void publicStaticMethod(){
        System.out.print("This is public static from eCommerce! ");
    }

    public static void main(String[] args) {
        eCommerce E1 = new eCommerce();
        E1.publicMethod();
    }

}

