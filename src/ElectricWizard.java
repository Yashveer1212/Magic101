public class ElectricWizard
{
    //instance variables
    private String name;

    private int power;

    private String elecGiantName;
    private int dmgToFireWizard;
    private int ZappiesNum;
    private int CloudsNum;

    //Constructor
    public ElectricWizard(String name, String elecGiantName,int ZappiesNum , int CloudsNum)
    {
        this.name = name;
        this.power = power;
        this.elecGiantName = elecGiantName;
        this.dmgToFireWizard = dmgToFireWizard;
        this.ZappiesNum  = ZappiesNum ;
        this.CloudsNum = CloudsNum;
    }//end full args constructor

    //getters and setters


    public int getDmgToFireWizard() {
        return dmgToFireWizard;
    }

    public int getZappiesNum () {
        return ZappiesNum ;
    }

    public int getCloudsNum() {
        return CloudsNum;
    }

    public void setelecGiantName(int elecGiantName) {
        elecGiantName = elecGiantName;
    }

    public void setDmgToFireWizard(int dmgToFireWizard) {
        this.dmgToFireWizard = dmgToFireWizard;
    }

    public void setZappiesNum (int ZappiesNum ) {
        this.ZappiesNum  = ZappiesNum ;
    }

    public void setCloudsNum(int CloudsNum) {
        this.CloudsNum = CloudsNum;
    }

    //brain methods
    public void exchangeAttacks(Enemies enemy)
    {
        power -= enemy.getPower();
        //note to self, the enemy cannot die as for right now
        System.out.println("\n"+ enemy.getName() + " The " + enemy.getEnemyType() + " has hit you for "
                + enemy.getPower() + " damage");
        switch(enemy.getEnemyType())
        {
            case FireWizard:
                System.out.println("You hit " + enemy.getName() + " the FireWizard for " + dmgToFireWizard
                        + " damage");
                break;
            case Dragon:
                System.out.println("You hit " + enemy.getName() + " the Dragon for " + ZappiesNum 
                        + " damage");
                break;
            case IceWizard:
                System.out.println("You hit " + enemy.getName() + " the IceWizard for " + CloudsNum
                        + " damage");
                break;
        }
    }//end brain method to inflict damage onto the enemies and vice versa

    public void healingPotion()
    {
        if(power < 1)
        {
            System.out.println("you are technically dead, but use this heal potion to lessen your death");
        }
        power+=25;
        if(power >200)
        {
            power = 200;
        }
        System.out.println("25 Health has been healed to " +  name);
    }//end brain method to heal the ElectricWizard


    //toString()
    public String toString()
    {
        String output ="\n" + name + " the ElectricWizard:"
                + "\nDamage against Dragons: " + ZappiesNum 
                + "\nDamage against IceWizards: " + CloudsNum
                + "\nDamage against FireWizardes: " + dmgToFireWizard;
        return output;
    }//end toString for the ElectricWizard class
}

