package pl.com.bottega.photostock.sales.model;

import pl.com.bottega.photostock.sales.model.products.Picture;

import java.util.Date;
import java.util.List;

/**
 * Created by bartosz.paszkowski on 12.03.2016.
 */
public class Purchase {

    private Date createDate;
    private Client owner;
    private List<Product> items;

    public Purchase(Client owner, List<Product> items) {
        this.owner = owner;
        this.items = items;
        this.createDate = new Date();
    }
}
