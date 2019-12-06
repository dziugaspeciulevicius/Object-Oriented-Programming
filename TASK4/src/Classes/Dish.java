package Classes;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.FileInputStream;
import java.io.InputStream;

public class Dish {

    private SimpleStringProperty dishName;
    private SimpleStringProperty dishDescription;
    private SimpleDoubleProperty dishPrice;
    private FileInputStream picture;
    public static double VAT = 0.21;

    public Dish(String dishName, String dishDescription, double dishPrice, String picture) {
        this.dishName = new SimpleStringProperty(dishName);
        this.dishDescription = new SimpleStringProperty(dishDescription);
        this.dishPrice = new SimpleDoubleProperty(dishPrice);
        try {
            this.picture = new FileInputStream(String.valueOf(picture));
        } catch (Exception e){
            System.out.println("Ths method for the picture does not work");
        }
    }

    public SimpleDoubleProperty getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(SimpleDoubleProperty dishPrice) {
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

    public FileInputStream getPicture() {
        return picture;
    }

    public FileInputStream pictureProperty() {
        return picture;
    }

    public void setPicture(FileInputStream picture) {
        this.picture = picture;
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