public class Herrchen
{
    // Attribute 
    private String name;
    private Hund hund1;
    private Hund hund2;

    //Konstruktor
    public Herrchen(String name_)
    {
        name = name_;
    }

    //Methoden
    public void alleHundeBellen()
    {
        System.out.print(hund1.getName() + " bellt: ");
        hund1.bellen();
        System.out.print(hund2.getName() + " bellt: ");
        hund2.bellen();
    }

    public void setHund1(Hund hund)
    {
        hund1 = hund;
    }

    public void setHund2(Hund hund)
    {
        hund2 = hund;
    }
}