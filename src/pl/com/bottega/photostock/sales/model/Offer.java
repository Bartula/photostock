package pl.com.bottega.photostock.sales.model;


import java.util.List;

/**
 * Created by bartosz.paszkowski on 12.03.2016.
 */
public class Offer {
    private final Client owner;
    private List<Product> items;
    double totalCost;


    public Offer(Client owner, List<Product> items) {
        this.owner = owner;
        this.items = items;
        this.totalCost = calculateTotalCost();
    }

    private double calculateTotalCost(){
        return 0;
    }

    public boolean sameAss (Offer offer, double secondReserv){

        return false;
    }
    public int getItemsCount(){

        return items.size(); //TODO
    }

    public double getTotalCost(){

        return totalCost; //TODO
    }

    public List<Product> getItems() {
        return items;
    }
}
