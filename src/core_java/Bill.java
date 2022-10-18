package core_java;

public class Bill {
    public static void main(String args[])
    {
        double units=30;
        double bill=0;
        if(units<=50)
        {
        bill=units*0.5;
        } else if (units<=150)
        {
            bill=50*0.5+(units-50)*0.75;
        } else if (units<=250)
        {
            bill=50*0.5+(units-150)*1.2;
        }
        else
        {
            bill=50*0.5+(units-250)*1.5;
        }
double totalbills=0;
        totalbills=bill+(bill*20)/100;
        System.out.println(totalbills);
    }
}
