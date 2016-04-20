package pl.com.bottega.photostock.sales.model;

import pl.com.bottega.photostock.sales.model.Client;

/**
 * Created by bartosz.paszkowski on 20.04.2016.
 */
public interface ClientRepository {
    public Client load(String name);

    public void save(Client client);
}
