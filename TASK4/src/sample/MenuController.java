package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MenuController {

    @FXML private AnchorPane topbar;
    @FXML private AnchorPane menuDishes;
    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private TableView<Dish> dishTable;
    @FXML private TableColumn<Dish, String> nameColumn;
    @FXML private ImageView foodPicture;
    @FXML private Label foodName;
    @FXML private Label foodPrice;
    @FXML private Label dishDescription;
    @FXML private TableView<Dish> orderTable;
    @FXML private TableColumn<Dish, String> orderColumn;
    @FXML private Button addDishToCart;
    @FXML private Label subtotalPriceLabel;
    @FXML private Label VATLabel;
    @FXML private Label totalPriceLabel;
    @FXML private Button buyButton;

    private Main main;

    Driver database = new Driver();
    ShoppingCart shoppingCart = new ShoppingCart();

    @FXML
    private void initialize(URL url, ResourceBundle resourceBundle) {
/*
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().dishNameProperty());
        orderColumn.setCellValueFactory(celLData -> celLData.getValue().dishNameProperty());

        showDishes(null);
        showShoppingCart(null);

        dishTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue)-> showDishes(newValue));
        //orderTable.getSelectionModel().selectedItemProperty().addListener(
        //        (observable, oldValue, newValue)-> showShoppingCart(newValue));
*/
/**------------------------------------------------------------------------------------------**/
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        orderColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        database.ConnectionDB();

    }

    private void showDishes(Dish dish){
        if(dish != null) {
            //PICTURE
            //foodPicture.setImage(dish.getPicture());
            foodName.setText(dish.getDishName());
            dishDescription.setText(dish.getDishDescription());
            foodPrice.setText(Double.toString(dish.getDishPrice()));
        } else {
            foodName.setText("");
            dishDescription.setText("");
            foodPrice.setText("");
        }
    }

    private void showShoppingCart(ShoppingCart shoppingCart){
        if (shoppingCart != null) {
            subtotalPriceLabel.setText(Double.toString(shoppingCart.getFinalPrice()));
            totalPriceLabel.setText(Double.toString(shoppingCart.getFinalPriceVAT()));
        } else {
            subtotalPriceLabel.setText("");
            totalPriceLabel.setText("");
        }
    }

    @FXML
    void addDishToCartAction(ActionEvent event) {

    }

    @FXML
    void buyButtonAction(ActionEvent event) {

    }

    public void setMain(Main main) {
        this.main = main;

        //Adding observable lists data to the tables
        dishTable.setItems(main.getDishList());
        orderTable.setItems(main.getCartList());
    }
}