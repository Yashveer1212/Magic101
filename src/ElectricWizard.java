public class ElectricWizard extends Wizard
{
    // 1) instance vars
    int zappies;
    int clouds;
    String giantName;

    // 2) constructor
    public ElectricWizard (double speed, int power, String name, int zappies, int clouds, String giantName)
    {
        super(speed, power, name);
        this.zappies = zappies;
        this.clouds = clouds;
        this.giantName = giantName;
    }

    // 4) getters
    public String getName()
    {
        return super.getName();
    }

    public int getZappies()
    {
        return zappies;
    }

    public int getClouds()
    {
        return clouds;
    }

    public String getGiantName()
    {
        return giantName;
    }

    public String getElement()
    {
        return "Electric";
    }

    // 5) setters
    public void setZappies(int zappies)
    {
        this.zappies = zappies;
    }

    public void setClouds(int clouds)
    {
        this.clouds = clouds;
    }

    public void setGiantName(String giantName)
    {
        this.giantName = giantName;
    }

    // 3) toString()
    @Override
    public String toString()
    {
        return "Electric Wizard {" +
                "Name: " + name +
                ", Number of zappies: " + zappies +
                ", Number of clouds: " + clouds +
                ", Electric giant name: " + giantName +  "}";
    } // end toString()

} // end ElectricWizard class