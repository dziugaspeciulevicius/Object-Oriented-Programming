package sample;

import javafx.beans.property.*;

import java.util.ArrayList;

public class ShoppingCart {

    private StringProperty itemName;
    private StringProperty itemDescription;
    private ObjectProperty picture;
    private double price;
    private double PriceVAT;
    private ArrayList<Item> shoppingCartArray = new ArrayList<>();

    public ShoppingCart(String itemName, String itemDescription, double itemPrice) {
    }

    public ShoppingCart() {
        this(null, null,0.0);
    }


    public ArrayList<Item> getShoppingCartArray(){
        return shoppingCartArray;
    }

    public void setShoppingCartArray(Item item) {
        shoppingCartArray.add(item);
    }

    public StringProperty itemNameProperty() {
        return itemName;
    }

    public double getFinalPrice() {
        calculateFinalPrice();
        return price;
    }

    public double getFinalPriceVAT() {
        return PriceVAT;
    }

    private void calculateFinalPrice() {
        price = 0;
        for(int i = 0; i < getShoppingCartArray().size(); i++){
            price += getShoppingCartArray().get(i).getItemPrice();
        }
        //with VAT
        PriceVAT = price * Item.getVAT();
    }
}