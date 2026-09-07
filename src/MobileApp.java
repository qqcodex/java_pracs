public class MobileApp
{
    String appName;
    String Developer;
    double appCost;
    float monthlyProfit;
    int yearlyUsers = 11;
    static int monthlyUsers; //belong to the class

    public MobileApp () {}

    public MobileApp(MobileApp Preply,String CountryAvailable,int monthlyDownloads)
    {
        this.appName = Preply.appName;
        this.Developer = Preply.Developer;
        this.appCost = Preply.appCost;
        this.monthlyProfit = Preply.monthlyProfit;
        System.out.print(CountryAvailable);
    }

    public MobileApp(String appName,String Developer,double appCost,float monthlyProfit)
    {
        this.appName = appName;
        this.Developer = Developer;
        this.appCost = appCost;
        this.monthlyProfit = monthlyProfit;
    }

    public static void main(String[] args)
    {
        MobileApp X = new MobileApp("Preply","Meta",2.00,25000f);
        MobileApp Duolingo = new MobileApp(X,"USA",20000); //2nd constructor
        System.out.println(Duolingo.appName);

        System.out.println(Duolingo.yearlyUsers+" "+MobileApp.monthlyUsers);

        var y = 24;
    }
}
