package sample;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class ShoppingCart {

    private StringProperty dishName;
    private StringProperty dishDescription;
    private ObjectProperty picture;
    private DoubleProperty dishPrice;
    private static double VAT = 1.21;
    private double total;
    private ArrayList<Dish> shoppingCartArray = new ArrayList<>();
//    ObservableList<Dish> dishList = FXCollections.observableArrayList();

    public ShoppingCart() {
        this(null, null, null, null, 0.0, null);
    }
    //I guess there are too many values in a constructor

    public ShoppingCart(StringProperty dishName, StringProperty dishDescription, ObjectProperty picture, DoubleProperty dishPrice, double total, ArrayList<Dish> shoppingCartArray) {
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.picture = picture;
        this.dishPrice = dishPrice;
        //this.total = total;
        //this.shoppingCartArray = shoppingCartArray;
    }

    public String getDishName() {
        return dishName.get();
    }

    public StringProperty dishNameProperty() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName.set(dishName);
    }

    public String getDishDescription() {
        return dishDescription.get();
    }

    public StringProperty dishDescriptionProperty() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription.set(dishDescription);
    }

    public Object getPicture() {
        return picture.get();
    }

    public ObjectProperty pictureProperty() {
        return picture;
    }

    public void setPicture(Object picture) {
        this.picture.set(picture);
    }

    public double getDishPrice() {
        return dishPrice.get();
    }

    public DoubleProperty dishPriceProperty() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice.set(dishPrice);
    }

    public static double getVAT() {
        return VAT;
    }

    public static void setVAT(double VAT) {
        ShoppingCart.VAT = VAT;
    }

    public double getTotal() {
        for (int i = 0; i < MenuController.getCartList().size(); i++){
            total = total + MenuController.getCartList().get(i).getDishPrice();
        }
        return total;
    }

    public double getTotalVat(){
        final double tax = 1.21;

        return total * tax;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Dish> getShoppingCartArray() {
        return shoppingCartArray;
    }

    public void setShoppingCartArray(ArrayList<Dish> shoppingCartArray) {
        this.shoppingCartArray = shoppingCartArray;
    }
}