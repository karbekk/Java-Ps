package classes;

/**
 * Created by kartik on 8/22/16.
 */
public class Flight {
    private int seats = 150;
    private int passengers,flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable;


    // Initialization block
    {
        isSeatAvailable = new boolean[seats];

        for (int i=0;i<seats;i++)
        {
            isSeatAvailable[i] = true;
        }
    }


    public Flight() {
    }

    public Flight(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass)
    {
        this.flightClass = flightClass;
    }

    public int getSeats()
    {
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public void addPassenger() {
        if (passengers < seats) {
            passengers += 1;
        }
        else
        {
            tooMany();
        }
    }

    private void tooMany()
    {
        System.out.println("Seats are filled");
    }

    public boolean hasRoom(Flight etihad)
    {
        int total = this.passengers + etihad.passengers;
        return total <= seats;
    }

    public Flight combineFlight(Flight etihad)
    {
        Flight jet = new Flight();
        jet.seats = seats;
        jet.passengers = this.passengers + etihad.passengers;

        return jet;
    }
}

