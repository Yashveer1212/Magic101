public class FireWizard extends Wizard
{
    // 1) instance vars
    int fireballs;
    boolean fireslash;
    String phoenixName;

    // 2) constructor
    public FireWizard (double speed, int power, String name, int fireballs, boolean fireslash, String phoenixName)
    {
        super(speed, power, name);
        this.fireballs = fireballs;
        this.fireslash = fireslash;
        this.phoenixName = phoenixName;
    }

    // 4) getters
    public String getName()
    {
        return super.getName();
    }

    public int getFireballs()
    {
        return fireballs;
    }

    public boolean getFireslash()
    {
        return fireslash;
    }

    public String getPhoenixName()
    {
        return phoenixName;
    }

    public String getElement()
    {
        return "Fire";
    }

    // 5) setters

    public void setFireballs(int fireballs)
    {
        this.fireballs = fireballs;
    }

    public void setFireslash(boolean fireslash)
    {
        this.fireslash = fireslash;
    }

    public void setPhoenixName(String phoenixName)
    {
        this.phoenixName = phoenixName;
    }


    // 3) toString()
    @Override
    public String toString()
    {
        return "Fire Wizard {" +
                "Name: " + name +
                ", Number of fireballs: " + fireballs +
                ", Has fireslash: " + fireslash +
                ", Phoenix name: " + phoenixName +  "}";
    } // end toString()

} // end FireWizard class