package sample;

import java.util.ArrayList;

public class ShoppingCart {

    private double finalPrice;
    private double finalPriceVAT;
    private ArrayList<Dish> shoppingCartArray = new ArrayList<>();
//    ObservableList<Dish> dishList = FXCollections.observableArrayList();


    public ShoppingCart(double finalPrice, double finalPriceVAT, ArrayList<Dish> shoppingCartArray) {
        this.finalPrice = finalPrice;
        this.finalPriceVAT = finalPriceVAT;
        this.shoppingCartArray = shoppingCartArray;
    }

    public ArrayList<Dish> getOrderArray() {
        return shoppingCartArray;
    }

    public void setOrderArray(Dish dish) {
        shoppingCartArray.add(dish);
    }

    public double getFinalPrice() {
        calculateFinalPrice();
        return finalPrice;
    }

    public double getFinalPriceVAT() {
        return finalPriceVAT;
    }

    private void calculateFinalPrice() {
        finalPrice = 0;
        for(int i = 0; i < getOrderArray().size(); i++){
            finalPrice += shoppingCartArray.get(i).getDishPrice();
        }
        //with VAT
        finalPriceVAT = finalPrice * Dish.getVAT();
    }

    public void setOrderItems(Dish dish) {
        shoppingCartArray.add(dish);
    }
}