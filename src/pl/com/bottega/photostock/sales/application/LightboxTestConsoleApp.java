package pl.com.bottega.photostock.sales.application;

import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.ClientStatus;
import pl.com.bottega.photostock.sales.model.LightBox;
import pl.com.bottega.photostock.sales.model.ProductNotAvailableException;
import pl.com.bottega.photostock.sales.model.products.Picture;

import java.util.ArrayList;

/**
 * Created by bartosz.paszkowski on 19.03.2016.
 */
public class LightboxTestConsoleApp {
    public static void main(String[] args) {

        Client Janusz = new Client("Janusz", "ksiezyc", ClientStatus.STANDARD, 10);
        LightBox lightBoxJanusza = new LightBox(Janusz, "Ogolne");
        LightBox lightBoxJanuszaHome = new LightBox(Janusz, "Home" );
        LightBox lightBoxJanuszaNature = new LightBox(Janusz, "Nature");
        LightBox lightBoxJanuszaGirls = new LightBox(Janusz, "Girls");


        Picture lubberJack = new Picture ("n1", new String[]{"piła", "drewno"} , 2, false);
        Picture kitty = new Picture ("n2", new String[]{"zwierz", "kotek"} , 2, false);
        Picture lamp = new Picture("n3", new String[]{"oswietlenie", "lampa" }, 3, false);
        Picture lamp2 = new Picture("n4", new String[]{"oswietlenie", "lampa" }, 2, false);
        Picture tree = new Picture("n5", new String[]{"natura", "drzewo" }, 1, false);
        Picture grass = new Picture("n6", new String[]{"natura", "trawa" }, 1, false);
        Picture waterfall = new Picture("n6", new String[]{"natura", "woda" }, 4, false);
        Picture girl1 = new Picture("n7", new String[]{"kobieta", "portret" }, 2, false);
        Picture girl2 = new Picture("n8", new String[]{"kobieta", "portret" }, 2, false);
        Picture girl3 = new Picture("n9", new String[]{"kobieta", "portret" }, 3, false);
       //Picture lubberJack2 = new Picture ("n1", new String[]{"piła", "drewno"} , 2, true);

        try {
            lightBoxJanusza.add(lubberJack);
            //lightBoxJanusza.close(); //!!!!!
            lightBoxJanusza.add(kitty);

            lightBoxJanuszaHome.add(lamp);
            lightBoxJanuszaHome.add(lamp2);

            lightBoxJanuszaNature.add(tree);
            lightBoxJanuszaNature.add(grass);
            lightBoxJanuszaNature.add(waterfall);

            lightBoxJanuszaGirls.add(girl1);
            lightBoxJanuszaGirls.add(girl2);
            lightBoxJanuszaGirls.add(girl3);

            //lightBoxJanusza.add(lubberJack);
        }
        catch(ProductNotAvailableException ex){
            System.out.println(ex.getClass()+ " " + ex.getMessage()+ " " + ex.getNumber() );
        }
       // catch (IllegalArgumentException ex){
       //     System.out.println("nie udało się " + ex);
       // }

        int count = lightBoxJanusza.getItemsCount();
        System.out.println("ilość elementów " + count);

        ArrayList<LightBox> lightBoxes = new ArrayList<>();
        lightBoxes.add(lightBoxJanusza);
        lightBoxes.add(lightBoxJanuszaHome);
        lightBoxes.add(lightBoxJanuszaNature);
        lightBoxes.add(lightBoxJanuszaGirls);

        LightBox.displayLbxPictures(lightBoxes);

    }
}
