package week11;

public class Question_2_Total_Price {
    public static void main(String[] args) {
        int price = intInput("Enter the price of the product:);
        int quantity = intInput(“Enter the quantity to purchase: *);
        int totalPrice = colculateTotalPrice(price, quantity);
        // display the total price
        System.out.println("The total price is " + totalPrice);
    }
}
