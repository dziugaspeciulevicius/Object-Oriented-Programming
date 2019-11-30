package Classes;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Dish {

    private SimpleStringProperty dishName;
    private SimpleStringProperty dishDescription;
    private double dishPrice;
    private SimpleStringProperty picture;
    public static double VAT = 0.21;

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public SimpleStringProperty dishNameProperty() {
        return dishName;
    }

    public String getDishDescription() {
        return dishDescription.get();
    }

    public SimpleStringProperty dishDescriptionProperty() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription.set(dishDescription);
    }

    public String getPicture() {
        return picture.get();
    }

    public SimpleStringProperty pictureProperty() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture.set(picture);
    }

    public static double getVAT() {
        return VAT;
    }

    public static void setVAT(double VAT) {
        Dish.VAT = VAT;
    }

    public String getDishName() {
        return dishName.get();
    }

    public void setDishName(String dishName) {
        this.dishName.set(dishName);
    }
}