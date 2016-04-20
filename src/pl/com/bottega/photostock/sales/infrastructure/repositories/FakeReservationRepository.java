package pl.com.bottega.photostock.sales.infrastructure.repositories;

import pl.com.bottega.photostock.sales.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bartosz.paszkowski on 20.04.2016.
 */
public class FakeReservationRepository implements ReservationRepository{

    private static Map<Client, Reservation> fakeDatabase = new HashMap<>();

    static {
        Client c1 = new Client("Janusz", "ksiezyc", ClientStatus.STANDARD,10);
        Client c2 = new Client("Zegrzysław", "tajny", ClientStatus.STANDARD,20);

        Reservation r1 = new Reservation(c1);
        Reservation r2 = new Reservation(c2);

        fakeDatabase.put(c1, r1); ///?????????????????????
        fakeDatabase.put(c2, r2);//????????????????
    }
    @Override
    public Reservation load(Client client) {
        Reservation reservation = fakeDatabase.get(client);
        if (reservation == null)
            throw  new RuntimeException("Client " + "does not exist"); // TODO wprowadzic własny wyjątek DataDoesNotExist
        return reservation;
    }

    @Override
    public void save(Reservation reservation) {

    }
}
