package classes;

/**
 * Created by kartik on 8/22/16.
 */
public class Flight {
    int seats;
    int passengers;

    Flight() {
        seats = 100;
        passengers = 0;

    }

    void addPassenger() {
        if (passengers < seats) {
            passengers += 1;
        }
    }

    public static void main(String args[]) {
        Flight emirates = new Flight();
        emirates.addPassenger();
        System.out.print(emirates.passengers);
    }
}

