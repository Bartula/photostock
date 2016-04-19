package pl.com.bottega.photostock.sales.model;

/**
 * Created by bartosz.paszkowski on 17.04.2016.
 */
public interface ProductRepository {
    public Product load(String nr);
    public void save(Product product);
}
