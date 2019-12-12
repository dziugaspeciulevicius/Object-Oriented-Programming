package sample;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class Dish {

    private SimpleStringProperty dishName = new SimpleStringProperty();
    private SimpleStringProperty dishDescription = new SimpleStringProperty();
    private ObjectProperty picture = new SimpleObjectProperty();
    private SimpleDoubleProperty dishPrice = new SimpleDoubleProperty();
    private static double VAT = 1.21;

    public String getDishName() {
        return dishName.get();
    }

    public SimpleStringProperty dishNameProperty() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName.set(dishName);
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

    public double getDishPrice() {
        return dishPrice.get();
    }

    public SimpleDoubleProperty dishPriceProperty() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice.set(dishPrice);
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

    public static double getVAT() {
        return VAT;
    }

    public static void setVAT(double VAT) {
        Dish.VAT = VAT;
    }
}