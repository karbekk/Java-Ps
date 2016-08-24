package classes;

/**
 * Created by kartik on 8/22/16.
 */
public class Flight {
    private int seats;
    private int passengers;

    public Flight() {
        seats = 1;
        passengers = 0;

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

    public static void main(String args[]) {
        Flight emirates = new Flight();
        emirates.addPassenger();
        emirates.addPassenger();
        Flight etihad = new Flight();
        System.out.print(emirates.passengers);


        Flight airAsia = new Flight();
        Flight airCanada = new Flight();

        Flight qatar = null;

        if (airAsia.hasRoom(airCanada))
        {
            qatar = airAsia.combineFlight(airCanada);
        }

        if (qatar!=null)
        {
            System.out.println("Combined");
        }

        // getters and setters

        Flight cathy = new Flight();
        cathy.setSeats(100);
        System.out.println(cathy.getSeats());

    }
}

