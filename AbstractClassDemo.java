abstract class Loan{
    int amount;
    void apply()
    {
        System.out.println("Apply for Loan....");
    }
    abstract void roi();
    

}
class AutoLoan extends Loan{
    AutoLoan()
    {
        System.out.println("This is Auto Loan COnstructor");
    }
    boolean drivingLicenseValid()
    {
        return true;
    }
    void roi()
    {
System.out.println(" AutoLoan ROI is 5%");
    }

}
class HomeLoan extends Loan{
    boolean validProperty(){
        return true;
    }
    void roi()
    {
        System.out.println("Home Loan ROI is 8%");
    }

}


public class AbstractClassDemo {
    public static void main(String[] args) {
        AutoLoan autoloan=new AutoLoan();
        HomeLoan homeloan= new HomeLoan();
        

    }
}
