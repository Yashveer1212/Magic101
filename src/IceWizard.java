enum Elements //Learned Enum from Alex Lee on Youtube
{
    FIRE,
    WATER,
    AIR,
    ICE ,
    FAKE,
}

public class IceWizard extends Enemies
{
    //instance variables
    private Elements SubZerosElement ;
    private static int numIceWizards;

    //Constructors
    public IceWizard(String name, boolean IceSpear ,int Power,EnemyType enemyType, Elements SubZerosElement )
    {
        super(name,IceSpear,Power);
        this.SubZerosElement  = SubZerosElement ;
        numIceWizards++;
    }//end of full args constructor

    //Getters and Setters
    public Elements getSubZerosElement ()
    {
        return SubZerosElement ;
    }

    public void setSubZerosElement (Elements SubZerosElement )
    {
        this.SubZerosElement  = SubZerosElement ;
    }

    //brain method
    public void validate()
    {
        switch(SubZerosElement)
        {
            case FIRE:
                System.out.println(super.getName() + " IceWizard is a valid Wizard of the Fire Element");
                break;
            case WATER:
                System.out.println(super.getName() + " IceWizard is a valid Wizard of the Water Element");
                break;
            case ICE :
                System.out.println(super.getName() + " IceWizard is a valid Wizard of the Ice  Element");
                break;
            case AIR:
                System.out.println(super.getName() + " IceWizard is a valid Wizard of the Air ELEMENT");
                break;
            default:
                System.out.println(super.getName() + " is not a valid IceWizard element");
                break;
        }
    }//end method to check if the SubZero is a valid IceWizard

    public void displayNumIceWizards()
    {
        System.out.println("There are " + numIceWizards + " IceWizards");
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nThis is a " + SubZerosElement  + " IceWizard.\n";
        return output;
    }//end method toString
}

