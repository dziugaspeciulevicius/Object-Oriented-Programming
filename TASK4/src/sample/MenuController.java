package sample;

import java.net.URL;
import java.sql.SQLException;
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
    @FXML private TableView<ShoppingCart> orderTable;
    @FXML private TableColumn<ShoppingCart, String> orderColumn;
    @FXML private Button addDishToCart;
    @FXML private Label subtotalPriceLabel;
    @FXML private Label VATLabel;
    @FXML private Label totalPriceLabel;
    @FXML private Button buyButton;

    private Main mainWindow;

    Driver database = new Driver();
    ShoppingCart shoppingCart = new ShoppingCart();

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().dishNameProperty());
        orderColumn.setCellValueFactory(celLData -> celLData.getValue().dishNameProperty());

        showDishes(null);
        showShoppingCart(null);

        dishTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue)-> showDishes(newValue));
        orderTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue)-> showShoppingCart(newValue));


        dishTable.setItems(Main.getDishList());

/**------------------------------------------------------------------------------------------**/
//        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//        orderColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//
//        database.ConnectionDB(dishTable);

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
//        orderTable.setItems(main.getCartList());
        if (shoppingCart != null) {
            subtotalPriceLabel.setText(Double.toString(shoppingCart.getTotal()));
            totalPriceLabel.setText(Double.toString(shoppingCart.getTotalVat()));
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
        this.mainWindow = main;

        //Adding observable lists data to the tables
        dishTable.setItems(Main.getDishList());
        //orderTable.setItems(main.getCartList());
    }
}