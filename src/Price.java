public class Price {
    int price = 10;

    public void priceSentence(){
        System.out.println("Your item costs $"+price+'.');
    }

    public class Tax {
        int tax = 2;

        public void taxSentence(){
            System.out.println("Your item is taxed $"+tax+". Your total is $"+(price+tax)+".");
        }
    }
}
