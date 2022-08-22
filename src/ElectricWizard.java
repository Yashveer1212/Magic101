public class ElectricWizard
{
    //instance variables
    private String name;
    private int health;
    private int dmgToFireWizard;
    private int dmgToDragon;
    private int dmgToIce FireWizard;

    //Constructor
    public ElectricWizard(String name, int health, int dmgToFireWizard,int dmgToDragon, int dmgToIceWizard)
    {
        this.name = name;
        this.health = health;
        this.dmgToFireWizard = dmgToFireWizard;
        this.dmgToDragon = dmgToDragon;
        this.dmgToIceWizard = dmgToIceWizard;
    }//end full args constructor

    //getters and setters

    public int getHealth() {
        return health;
    }

    public int getDmgToFireWizard() {
        return dmgToFireWizard;
    }

    public int getDmgToDragon() {
        return dmgToDragon;
    }

    public int getDmgToIceWizard() {
        return dmgToIceWizard;
    }

    public void setHealth(int health) {
        health = health;
    }

    public void setDmgToFireWizard(int dmgToFireWizard) {
        this.dmgToFireWizard = dmgToFireWizard;
    }

    public void setDmgToDragon(int dmgToDragon) {
        this.dmgToDragon = dmgToDragon;
    }

    public void setDmgToIceWizard(int dmgToIceWizard) {
        this.dmgToIceWizard = dmgToIceWizard;
    }

    //brain methods
    public void exchangeAttacks(Enemies enemy)
    {
        health -= enemy.getAttackDmg();
        //note to self, the enemy cannot die as for right now
        System.out.println("\n"+ enemy.getName() + " The " + enemy.getEnemyType() + " has hit you for "
                + enemy.getAttackDmg() + " damage");
        switch(enemy.getEnemyType())
        {
            case FireWizard:
                System.out.println("You hit " + enemy.getName() + " the FireWizard for " + dmgToFireWizard
                        + " damage");
                break;
            case Dragon:
                System.out.println("You hit " + enemy.getName() + " the Dragon for " + dmgToDragon
                        + " damage");
                break;
            case IceWizard:
                System.out.println("You hit " + enemy.getName() + " the IceWizard for " + dmgToIceWizard
                        + " damage");
                break;
        }
    }//end brain method to inflict damage onto the enemies and vice versa

    public void healingPotion()
    {
        if(health < 1)
        {
            System.out.println("you are technically dead, but use this heal potion to lessen your death");
        }
        health+=25;
        if(health >200)
        {
            health = 200;
        }
        System.out.println("25 health has been healed to " +  name);
    }//end brain method to heal the ElectricWizard


    //toString()
    public String toString()
    {
        String output ="\n" + name + " the ElectricWizard:"
                + "\nDamage against Dragons: " + dmgToDragon
                + "\nDamage against IceWizards: " + dmgToIceWizard
                + "\nDamage against FireWizardes: " + dmgToFireWizard;
        return output;
    }//end toString for the ElectricWizard class
}

