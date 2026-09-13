package pckg1;

public class eCommerce {

    private void privateMethod(){
        System.out.print("Private method - Only within same class");
    }
    void defaultMethod(){
        System.out.print("Default method - Within same package ");
    }
    protected void protectedMethod(){
        System.out.print("Protected method - within same package, same subclasses ");
    }
    public void publicMethod(){
        System.out.print("Public method - Accessible everywhere! ");
    }
    public final void publicFinalMethod(){
        System.out.print("This is public final - $Cannot be overridden in a subclasses! ");
    }
    public static void publicStaticMethod(){
        System.out.print("This is public static - $[Parent] Cannot be overriden in a subclass");
    }

    public static void main(String[] args) {
        eCommerce E1 = new eCommerce();
        E1.publicMethod();
    }

}

