package pl.com.bottega.photostock.sales.model;

/**
 * Created by bartosz.paszkowski on 12.03.2016.
 */
public class Client {

    private String name;
    private String address;
    private ClientStatus status;
    //private double debt; // powinna być liczba ujemna
    private double amount;
    //private double creditLimit;



    public Client(String name, String address, ClientStatus status, double amount) {   //konstruktor
        this.name = name;
        this.address = address;
        this.status = status; //???????????
        //this.debt = debt; //powinna być liczbaujemna
        this.amount = amount;
        //this.creditLimit = creditLimit;

    }
/*
    public Client(String[] name, String[] address, double creditlimit) {   //konstruktor
        this.name = name;
        this.address = address;
        this.isVip = false;
        this.saldo = 0;
        this.creditlimit = creditlimit;
    }
 */
    public Client(String name, String address, double amount) {
        this(name, address, ClientStatus.STANDARD,amount);
    }

    public boolean canAfford(double purchasePotential) {
        return amount >= purchasePotential;
    }

    public void charge(double quantity, String cause)throws IllegalStateException{
        if (canAfford(quantity)){
            amount -= quantity;
        }
        else{
            throw new IllegalStateException("You do not have sufficient funds in your account ");
        }
    }
    public void recharge(double quantity){
        amount += quantity;
    }

    public double getSaldo() {
        return amount;
    }
    public String getOwnerName(){
        return name;
    }

    public static boolean isActive() {
        return true;
    }

    public String introduce(){
        return name + "-" + status.getPolishString();
    }

}
