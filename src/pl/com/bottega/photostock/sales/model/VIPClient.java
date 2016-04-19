package pl.com.bottega.photostock.sales.model;

/**
 * Created by bartosz.paszkowski on 12.04.2016.
 */
public class VIPClient extends Client {

    private double debt;
    private double creditLimit;
    private double amount;

    public VIPClient(String name, String address, double amount, double creditLimit) {
        super(name, address, ClientStatus.VIP, amount);
        this.debt = 0;
        this.creditLimit = creditLimit;
        this.amount = amount;
    }

    public boolean canAfford(double purchasePotential) {

        if (Math.abs(debt) <= creditLimit) {
                return purchasePotential >= amount + creditLimit + debt;
            }
            else {
                return false;
            }
    }

    public void charge(double quantity, String cause)throws IllegalStateException{
        if (canAfford(quantity)){
            amount -= quantity;
            if (amount < 0) {
                debt = amount - quantity;
                amount = 0;
            }
        }
        else{
            throw new IllegalStateException("You do not have sufficient funds in your account ");
        }
    }

    public void recharge(double quantity){
        if (wantPayDebt() && debt !=0) {
            debt = debt + quantity;
            if (debt > 0) {
                amount = amount + debt;
                debt = 0;
            }
        }
        else {
            amount += quantity;
        }
    }
    public double getSaldo() {
        return amount = amount + debt;
    }

    //chęć spłaty długu
    public boolean wantPayDebt() { return true; }
}
