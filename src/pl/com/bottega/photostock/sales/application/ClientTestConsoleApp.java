package pl.com.bottega.photostock.sales.application;


import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.ClientStatus;

/**
 * Created by bartosz.paszkowski on 13.03.2016.
 */
public class ClientTestConsoleApp {
    public static void main(String[] args) {
        Client panJanusz = new Client("Janusz", "ksiezyc", ClientStatus.STANDARD,10);
        panJanusz.recharge(10);
        if (panJanusz.canAfford(12)) {
            panJanusz.charge(12, "za coś");
            System.out.println("Saldo: " + panJanusz.getSaldo());
        }
        else{
            System.out.println("can not afford!");
        }
    }
}
