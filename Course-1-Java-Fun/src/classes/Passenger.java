package classes;

/**
 * Created by kartik on 8/23/16.
 */

public class Passenger {

    private int checkbags;
    private int freebags;
    private double bagprice;

    public Passenger()
    {}

    public Passenger(int freebags)
    {
        this(freebags > 1 ? 25.0d : 50.0d);
        this.freebags = freebags;
    }


    public Passenger(int freebags, int checkbags)
    {
        this(freebags);             // always the first line of the code
        this.checkbags = checkbags;
    }

    private Passenger(double bagprice)
    {
        this.bagprice = bagprice;
    }

    public int getCheckbags()
    {
        return checkbags;
    }

    public int getFreebags()
    {
        return freebags;
    }


    public void setCheckbags(int checkbags)
    {
        this.checkbags = checkbags;
    }

    public void setFreebags(int freebags)
    {
        this.freebags = freebags;
    }

    public static void main(String[] args)
    {
        Passenger John = new Passenger();
        John.setCheckbags(2);

        Passenger Rob = new Passenger(2);
        Rob.setCheckbags(3);

        Passenger fred = new Passenger(2);
        Passenger Jan = new Passenger(2,3);
    }
}
