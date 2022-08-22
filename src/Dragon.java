public class Dragon extends Enemies
{
    //instance variables
    private int numWings;
    private int wingLength;
    private static int numDragons;

    //constructor
    public Dragon(String name, boolean FireSlash ,int Power,EnemyType enemyType, int numWings, int wingLength)
    {
        super(name,FireSlash , Power);
        this.numWings = numWings;
        this.wingLength = wingLength;
        numDragons++;

    }//end full args constructor

    //getters and setters

    public int getNumWings()
    {
        return numWings;
    }

    public int getWingLength()
    {
        return wingLength;
    }

    public void setNumWings(int numWings)
    {
        this.numWings = numWings;
    }

    public void setWingLength(int wingLength)
    {
        this.wingLength = wingLength;
    }

    //brain methods
    public boolean validate()
    {
        boolean FireSlash  = super.getFireSlash ();
        boolean isDragon = true;

        if(numWings < 2)
        {
            isDragon = false;
        }
        else if(wingLength < 1)
        {
            isDragon = false;
        }
        else if(FireSlash  == false)
        {
            isDragon = false;
        }

        return isDragon;
    }//end brain method to check if Dragon object is a valid Dragon/ the validation

    public void displayNumDragons()
    {
        System.out.println("There are " + numDragons + " Dragons");
    }
    //toString
    public String toString()
    {
        String output = super.toString();
        output += "\nThis Dragon has " + numWings + " wings" + "\nthat are " + wingLength + " feet long";

        return output;
    }
}//end Dragon class

