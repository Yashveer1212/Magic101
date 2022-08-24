public class Wizard
{
    // 1) instance vars
    double speed;
    int power;
    String name; // not in brainstorm

    // 2) constructor
    public Wizard (double speed, int power, String name)
    {
        this.speed = speed;
        this.power = power;
        this.name = name;
    }

    // 4) getters
    public double getSpeed()
    {
        return speed;
    }

    public int getPower()
    {
        return power;
    }

    public String getName()
    {
        return name;
    }

    public String getElement ()
    {
        return "";
    }

    // 5) setters
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // 3) toString()
    @Override
    public String toString()
    {
        return "Wizard {" +
                "Speed:" + speed +
                ", Power:" + power +
                ", Name:'" + name + '\'' +
                '}';
    } // end toString()

} // end Wizard class