/*
*This class represents a Toy
*
* @author Xavier Denson
*
 */

public class Toy implements Comparable<Toy>{
    private String name;
    private double price;


    public Toy(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int compareTo(Toy other)
    {
        return Integer.compare(this.name.compareTo(other.name), 0);
    }

    @Override
    public String toString()
    {
        return  name + " Price: " + price;
    }
}
