package pl.com.bottega.photostock.sales.infrastructure.repositories;

import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.ClientRepository;
import pl.com.bottega.photostock.sales.model.ClientStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bartosz.paszkowski on 20.04.2016.
 */
public class FakeClientRepository implements ClientRepository {
    private static Map<String, Client> fakeDatabase = new HashMap<>();

    static {
        Client c1 = new Client("Janusz", "ksiezyc", ClientStatus.STANDARD,10);
        Client c2 = new Client("Zegrzysław", "tajny", ClientStatus.STANDARD,20);

        fakeDatabase.put(c1.getOwnerName(), c1);
        fakeDatabase.put(c2.getOwnerName(), c2);
    }

    @Override
    public Client load(String name) {
        Client client = fakeDatabase.get(name);
        if (client == null)
            throw  new RuntimeException("Client " + "does not exist"); // TODO wprowadzic własny wyjątek DataDoesNotExist
        return client;
    }

    @Override
    public void save(Client client) {
        fakeDatabase.put(client.getOwnerName(), client);
    }


}

