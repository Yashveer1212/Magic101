enum EnemyType //Learned Enum from Alex Lee on Youtube
{
    FireWizard,
    IceWizard,
    Dragon,
}

public abstract class Enemies
{
    //Instance Variables
    private String name;
    private boolean FireSlash ;

    private boolean IceSpear ;

    private boolean Zappies ;
    private int Power;
    private EnemyType enemyType;

    //Constructor
    public Enemies(String name, boolean FireSlash ,int Power)
    {
        this.name = name;
        this.FireSlash  = FireSlash ;
        this.Power = Power;
        this.enemyType = enemyType;
    }

    //getters and setters
    public boolean getFireSlash ()
    {
        return FireSlash ;
    }

    public int getPower() {
        return Power;
    }

    public String getName() {
        return name;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setFireSlash (boolean FireSlash ) {
        this.FireSlash  = FireSlash ;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }

    @Override
    public String toString() {
        return "Do they have claws" + FireSlash ;
    }
}//end Enemies class

