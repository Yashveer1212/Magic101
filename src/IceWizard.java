enum Elements
{
    FIRE,
    WATER,
    AIR,
    EARTH,
    FAKE,
}

public class IceWizard extends Enemies
{
    //instance variables
    private Elements IceWizardElement;
    private static int numIceWizards;

    //Constructors
    public IceWizard(String name, boolean hasClaws,int attackDmg,EnemyType enemyType, Elements IceWizardElement)
    {
        super(name,hasClaws, attackDmg,enemyType);
        this.IceWizardElement = IceWizardElement;
        numIceWizards++;
    }//end of full args constructor

    //Getters and Setters
    public Elements getIceWizardElement()
    {
        return IceWizardElement;
    }

    public void setIceWizardElement(Elements IceWizardElement)
    {
        this.IceWizardElement = IceWizardElement;
    }

    //brain method
    public void validate()
    {
        switch(IceWizardElement)
        {
            case FIRE:
                System.out.println(super.getName() + " IceWizard is a valid IceWizard of the Fire Element");
                break;
            case WATER:
                System.out.println(super.getName() + " IceWizard is a valid IceWizard of the Water Element");
                break;
            case EARTH:
                System.out.println(super.getName() + " IceWizard is a valid IceWizard of the Earth Element");
                break;
            case AIR:
                System.out.println(super.getName() + " IceWizard is a valid IceWizard of the Air ELEMENT");
                break;
            default:
                System.out.println(super.getName() + " is not a valid IceWizard element");
                break;
        }
    }//end method to check if the IceWizard is a valid IceWizard

    public void displayNumIceWizards()
    {
        System.out.println("There are " + numIceWizards + " IceWizards");
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nThis is a " + IceWizardElement + " IceWizard.\n";
        return output;
    }//end method toString
}

