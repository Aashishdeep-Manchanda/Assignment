
package assignment2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class FavGameController implements Initializable {
    
    
    @FXML
    private TextField nameTextField;

    @FXML
    private TextField sizeTextField;

    @FXML
    private DatePicker launchDatePicker;

    @FXML
    private RadioButton worldWideRadioButton;

    @FXML
    private RadioButton domesticRadioButton;

    @FXML
    private ComboBox<String> platformComboBox;
    
    @FXML
    private ComboBox<String> genreComboBox;
    
     @FXML
    private ImageView genreImageView;

    @FXML
    void genreChanger(ActionEvent event) {

    }
 
     
    @FXML
    private Button registerButton;

    @FXML
    private Label label;
    
    
    
    
     @FXML
    void registerGamePushed(ActionEvent event) {

    }
    private ToggleGroup AvailabilitytoggleGroup;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         platformComboBox.setPromptText("Select Platform");
        platformComboBox.getItems().add("PC");
        platformComboBox.getItems().add("Mobile");
        platformComboBox.getItems().add("Home Console");
        platformComboBox.getItems().add("Tablet");
        platformComboBox.getItems().add("Other");
        
        label.setText("");
        
        
        AvailabilitytoggleGroup = new ToggleGroup();
        worldWideRadioButton.setToggleGroup(AvailabilitytoggleGroup);
        domesticRadioButton.setToggleGroup(AvailabilitytoggleGroup);
        domesticRadioButton.setSelected(true);
        
           
       genreComboBox.setValue("");
       genreComboBox.getItems().add("Action");
       genreComboBox.getItems().add("Adventure");
       genreComboBox.getItems().add("Real-Time Strategy");
       genreComboBox.getItems().add("Puzzle");  
       genreComboBox.getItems().add("Sports");
    }
    
    /**
     *here is a genre choice box for setting images
     */
    
     @FXML
       public void genreChanger()
    {
        String genre = genreComboBox.getValue();
        if (genre.equalsIgnoreCase("Action"))
            genreImageView.setImage(new Image("./image/action.jpeg"));
        else if (genre.equalsIgnoreCase("Adventure"))
            genreImageView.setImage(new Image("./image/adventure.jpeg"));
         else if (genre.equalsIgnoreCase("Puzzle"))
            genreImageView.setImage(new Image("./image/puzzle.jpg"));
         else if (genre.equalsIgnoreCase("Sports"))
            genreImageView.setImage(new Image("./image/sports.jpg"));
          else if (genre.equalsIgnoreCase("Real-Time Strategy"))
            genreImageView.setImage(new Image("./image/real-time-strategy.jpeg"));
         else
            genreImageView.setImage(new Image("./image/strategy-1040157.jpeg"));
    }
       
      public void  registerGamePushed()
     {
        if (this.launchDatePicker.getValue() != null)
        {
            try{
                
                 System.out.printf("Fav game is : Name '%s'%n",nameTextField.getText() );                
                Game newGame = new Game(
                                        this.nameTextField.getText(),
                                        this.platformComboBox.getValue(),
                                        this.genreComboBox.getValue(),                       
                                        this.sizeTextField.getText(),
                                        this.launchDatePicker.getValue(),
                                        this.worldWideRadioButton.getText());
                
               
                System.out.println(newGame);
                
            } catch (IllegalArgumentException e)
            {
                label.setText(e.getMessage());
            }
        }
        else
        {
           label.setText("You need to set the launch date of a game" );
        }
        
    }
    
 
}

    

