public class Hund
{
    // Attribute
    private String name;

    // Konstruktoren
    public Hund(String name_)
    {
        name = name_;
    }

    //Methoden
    public void bellen()
    {
        System.out.println("Wau wau");
    }

    public String getName()
    {
        return name;
    }

}