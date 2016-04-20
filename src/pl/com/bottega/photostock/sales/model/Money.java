package pl.com.bottega.photostock.sales.model;

/**
 * Created by bartosz.paszkowski on 12.03.2016.
 */
public class Money {

    private final Double value;// TODO zmienic na Fraction
    private final String currency; // TODO zamienic na użycie klasy Currency z biblioteki Javy

    public Money(Double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Money(int integerValue, int cents, String currency){
        this(integerValue + (double)cents/100, currency);
    }

    public Money(double value) {
        this(value, "PLN");
    }

    public Money add (Money amount){
        if (!currency.equals(amount.currency))
            throw new IllegalArgumentException("Can not add if different currency");
        return new Money(value + amount.value, currency);
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
    public boolean equals(Object mon2){
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (!value.equals(money.value)) return false;
        return currency.equals(money.currency);*/
        if (this == mon2) return true;
        if (mon2 == null || getClass() != mon2.getClass()) return false;

        Money money2 = (Money) mon2;

        if (this.currency.equals(money2.currency)){
            if (value < 100 || money2.value < 100 ){
                boolean delta = Math.abs(value - money2.value) <= 0.001;
                return delta;
            }else{
                boolean delta = Math.abs(value - money2.value) <= 0.01;
                return delta;
            }
        }
        return false;
    }
    @Override
    public int hashCode (){
        int result = value.hashCode();
        result = 31 * result + currency.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return value + " " + currency;
    }

    /**
     *
     * @param val
     * @return true if this is grater or equals than val
     */
    public boolean ge(Money val){
        return this.value >= val.value;
    }
    /**
     *
     * @param val
     * @return true if this is less or equals than val
     */
    public boolean le (Money val){
        return this.value <= val.value;
    }

    /**
     *
     * @param val
     * @return true if this is less than val
     */
    public boolean lt (Money val){
        return this.value < val.value;
    }

    /**
     *
     * @param val
     * @return true if this is grater than val
     */
    public boolean gt(Money val){
        return this.value > val.value;
    }

    public Money getZero(){
        return new Money(0d, currency);
    }

}


