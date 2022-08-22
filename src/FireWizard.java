public class FireWizard extends Enemies
{
    //Instance Variables
    private int Fireball;
    private String PhoneixName;
    private static int numFireWizards;
    //Constructor
    public FireWizard(String name,boolean FireSlash ,String PhoneixName,int Fireball)
    {
        super(name,FireSlash, Fireball);
        this.Fireball = Fireball;
        numFireWizards++;
    }

    //Getters and Setters
    public int getFireball() {
        return Fireball;
    }

    public void setFireball(int Fireball) {
        this.Fireball = Fireball;
    }

    //Brain Methods
    public void validate()
    {
        if(Fireball < 0 )
        {
            System.out.println(super.getName()+ " does not have any Fireballs, he is not a FireWizard.");
        }
        else
        {
            System.out.println(super.getName() + " has Fireballs, that means he is a real FireWizard");
        }
    }

    public void displayNumFireWizards()
    {
        System.out.println("There are " + numFireWizards + " FireWizards");
    }
    //ToString
    public String toString()
    {
        String output = super.toString();
        output += "\nThis FireWizard has " + Fireball + " Fireballs\n";
        return output;
    }//end toString for FireWizards
}//end FireWizard Class

