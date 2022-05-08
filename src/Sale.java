public class Sale {
    public static void main(String[] args) {
        Price price = new Price();
        price.priceSentence();

        Price.Tax tax = price.new Tax();
        tax.taxSentence();
    }
}
