public class Dragon
{
    // 1) instance vars
    String element;
    String name;

    // 2) constructor
    public Dragon (String name, String element)
    {
        this.name = name;
        this.element = element;
    }

    // 4) getters
    public String getName()
    {
        return name;
    }

    public String getElement()
    {
        return element;
    }

    // 5) setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setElement(String element)
    {
        this.element = element;
    }


    // 3) toString()
    @Override
    public String toString()
    {
        return "Dragon {" +
                "Name: " + name +
                ", Element: " + element + "}";
    } // end toString()

} // end Dragon class