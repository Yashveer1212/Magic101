public class MagicDriver
{
    public static void main(String[] args)
    {
        Wizard w1 = new Wizard(10, 5, "frogster");
        FireWizard Scorpion = new FireWizard(6, 50, "Scorpion", 9, true, "Vulk");
        IceWizard SubZero = new IceWizard(6, 50, "SubZero", 10, true, "Snowflake");
        IceWizard NotSubZero = new IceWizard(0.5, 100, "NotSubZero", 100, false, "Neptune");
        ElectricWizard Thor = new ElectricWizard(10, 50, "Thor", 10, 5, "Sam");
        Dragon Zekrom = new Dragon("Zekrom", "Lighting");
        Dragon Reshiram = new Dragon("Reshiram", "Fire");

        Wizard [] wizardArr = {Scorpion, SubZero, NotSubZero, Thor};
        Dragon [] dragonArr = {Zekrom, Reshiram};

        // this prints out the differnt wizards
        System.out.println("Wizards:");
        for (Wizard w: wizardArr)
        {
            System.out.println(w);
        }

        // this prints out two differnt dragons
        System.out.println("\nDragons:");
        for (Dragon d: dragonArr)
        {
            System.out.println(d);
        }

    } // end main
} // end MagicDriver class