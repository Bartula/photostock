package pl.com.bottega.photostock.sales.model.products;

import pl.com.bottega.photostock.sales.model.AbstractProduct;
import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.Product;

/**
 * Created by bartosz.paszkowski on 03.04.2016.
 */
public class Clip extends AbstractProduct{

    private String name;
    private String time;
    private String[] tags;
    private double price;
    private boolean isAvailable;

    public Clip (String number, String name, String time, String[] tags, double price, boolean isAvailable){
        super(number,tags,price,isAvailable);
        this.name = name;
        this.time = time;
        this.tags = tags;
        this.price = price;
        this.isAvailable = isAvailable;
    }

}
