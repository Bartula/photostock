package pl.com.bottega.photostock.sales.model;

/**
 * Created by bartosz.paszkowski on 12.04.2016.
 */
public abstract class AbstractProduct implements Product{
    protected String number;
    private String[] tags;
    protected double price;
    private boolean isAvailable;

    public AbstractProduct (String number, String[] tags, double price, boolean isAvailable) {
        this.number = number;
        this.tags = tags;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public void cancel() {

    }

    @Override
    public void reversePer(Client client) {

    }

    @Override
    public void unReservePer(Client client) {

    }
    public String getNumber() {
        return number;
    }
}
