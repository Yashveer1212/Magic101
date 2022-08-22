public class FireWizard extends Enemies
{
    //Instance Variables
    private int numClaws;
    private static int numFireWizards;
    //Constructor
    public FireWizard(String name, boolean hasClaws,int attackDmg,EnemyType enemyType,int numClaws)
    {
        super(name,hasClaws,attackDmg,enemyType);
        this.numClaws = numClaws;
        numFireWizards++;
    }

    //Getters and Setters
    public int getNumClaws() {
        return numClaws;
    }

    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }

    //Brain Methods
    public void validate()
    {
        if(numClaws < 0 )
        {
            System.out.println(super.getName()+ " the FireWizard can't have negative claws");
        }
        else
        {
            System.out.println(super.getName() + " is a real FireWizard");
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
        output += "\nThis FireWizard has " + numClaws + " claws\n";
        return output;
    }//end toString for FireWizards
}//end FireWizard Class

