import java.util.*;

/*
*This class represents a Toy Store inventory
*
*@author Xavier Denson
*
 */

public class ToyStore
{
    private final Map<Toy,Integer> store;
    String[] toyString;
    String[] myToys;

    public ToyStore()
    {
        this.store = new TreeMap<Toy, Integer>();
    }

    /*
    * splits toy string into an array
    * creates toy objects and adds them to the store
     */
    public void loadToys(String toys)
    {
        toyString = toys.split(" ");
        for (String t: toyString)
        {
            myToys = t.split("-");
            Toy toy = new Toy(myToys[0], Double.parseDouble(myToys[1]));

            //if toy is in store
            if (findToy(toy.getName()) != null)
            {
                int count = store.get(toy);
                store.put(toy, count +1);
            } else
                {
                    store.put(toy , 1);
                }

        }

    }
    /**
     * Checks if toy is in the store
     *
     * @param toyName the toy name passed in from loadToys()
     * @return if the toy is in the store the toy is returned if its not null is returned
     */
    public Toy findToy(String toyName)
    {
        Set<Toy> toySet = store.keySet();
            for (Toy toys : toySet)
            {
                while (toys.getName().contains(toyName))
                {
                    return toys;
                }
            }

        return null;
    }

    /**
     * Checks which toy has the highest inventory count
     *
     * @return returns the most frequently bought toy
     */
    public String getMostFrequentToy()
    {
        int max = 0;
        Toy freqToy = new Toy("",0);

        for (Map.Entry<Toy, Integer> toy : store.entrySet())
        {
            if (max < toy.getValue())
            {
                freqToy = toy.getKey();
                max = toy.getValue();
            }
        }
        return "The most frequently bought: " + freqToy.getName();
    }

    @Override
    public String toString()
    {
        return store.toString();
    }
}
