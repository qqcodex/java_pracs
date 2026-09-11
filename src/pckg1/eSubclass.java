package pckg1;

public class eSubclass extends eCommerce {

    @Override
    protected void protectedMethod(){
        System.out.print("This is protected! ");
    }
   /* @Override
    public final void publicFinalMethod(){
        System.out.print("This is public final! ");
    } */
    // @Override
    public static void publicStaticMethod(){
        System.out.print("This is public static! ");
    }

    public static void main(String[] args) {
        eSubclass es1 = new eSubclass();
        es1.publicMethod();
    }
}
