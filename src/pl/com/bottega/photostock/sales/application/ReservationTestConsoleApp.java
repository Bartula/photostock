package pl.com.bottega.photostock.sales.application;

import pl.com.bottega.photostock.sales.infrastructure.repositories.FakeProductRepository;
import pl.com.bottega.photostock.sales.model.*;
import pl.com.bottega.photostock.sales.model.products.Picture;
import pl.com.bottega.photostock.sales.model.products.Song;

import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

/**
 * Created by bartosz.paszkowski on 17.03.2016.
 */
public class ReservationTestConsoleApp {
    public static void main(String[] args) {
        ProductRepository repository = new FakeProductRepository();

        Client zegrzyslaw =new Client("Zegrzysław", "tajny", ClientStatus.STANDARD,20); // TODO pobrac z repo
        Product mustang = repository.load("nr1"); //new Picture("nr1", new String[]{"ford", "mustang"}, 10, true);
        Product mustang2 = repository.load("nr2"); //new Picture("nr1", new String[]{"ford", "mustang"}, 10, true);
        Picture grass = new Picture("n6", new String[]{"natura", "trawa" }, 1, false);

        Song whiteTree = new Song("nr1","White Tree", "3:30", new String[]{"",""}, "New age", 4, true, Song.Channel.STEREO, Song.File_Extension.MP3);
        Song bigBanana = new Song("nr2","Big Banana", "4:10", new String[]{"",""}, "Folk", 5, true, Song.Channel.STEREO, Song.File_Extension.MP3);



        Reservation reservation = new Reservation(zegrzyslaw);// TODO pobrac z repo
        //reservation.add(mustang);

        try{
            reservation.add(mustang);
            reservation.add(mustang2);
        }
        catch (ProductNotAvailableException ex){
            System.out.println(ex.getClass()+ " " + ex.getMessage()+ " " + ex.getNumber() );
        }

        repository.save(mustang);
        repository.save(mustang2);

        Offer ofertaDlaZegrzyslawa = reservation.generateOffer();
        int count = ofertaDlaZegrzyslawa.getItemsCount();
        System.out.println("Ilość pozycji w ofercie: " + count);
    }

}
