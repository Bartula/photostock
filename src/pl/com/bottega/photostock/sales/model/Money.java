package pl.com.bottega.photostock.sales.model;

/**
 * Created by bartosz.paszkowski on 12.03.2016.
 */
public class Money {

    private final Double value = null;// zmienic na Fraction
    private final String currency = null;

    public Money(Double value, String currency) {
        //this.value = value;
        //this.currency = currency;
    }

    public Money (int integerValue, int cents, String currency){

    }

    public Money(double value) {
        this(value, "PLN");
    }

    public Money add (Money amount){
        return null;
    }

    public Money substract (Money amount){
        return null;
    }

    public Money multiple (int ratio){
        return null;
    }

    public Money multiple (double ratio){
        return null;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (!value.equals(money.value)) return false;
        return currency.equals(money.currency);
    }
    @Override
    public int hashCode (){
        int result = value.hashCode();
        result = 31 * result + currency.hashCode();
        return result;
    }
    public Money(){
        this(0);
    }

    /**
     * Created by bartosz.paszkowski on 09.04.2016.
     */
    public static class PrintRequest {
    }
}
