package ProgrammingExercises;

public class DemoSubscriptions
{
    public static void main(String args[])
    {
        PhysicalNewspaperSubscription subscription1 = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription subscription2 = new OnlineNewspaperSubscription();
        PhysicalNewspaperSubscription subscription3 = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription subscription4 = new OnlineNewspaperSubscription();
        subscription1.setName("Fishburne");
        subscription1.setAddress("11 lorong 4");
        display(subscription1);
        subscription3.setName("Hamill");
        subscription3.setAddress("lorong");  // No digits
        display(subscription3);
        subscription2.setName("Eastwood");
        subscription2.setAddress("@ 7 lorong 7");
        display(subscription2);
        subscription4.setName("Freeman");
        subscription4.setAddress("149 Sims Drive"); // No @ - sign
        display(subscription4);
    }
    private static void display(NewspaperSubscription n)
    {
        System.out.println("Name: " + n.getName() + "   Address: " +
                n.getAddress() + "   Rate: " + n.getRate() + "\n");
    }
}

