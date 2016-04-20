package pl.com.bottega.photostock.sales.model;

/**
 * Created by bartosz.paszkowski on 20.04.2016.
 */
public interface ReservationRepository {
    public Reservation load(Client client);

    public void save(Reservation reservation);
}
