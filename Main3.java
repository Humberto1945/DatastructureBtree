package application;

import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;  
         
public class Main3 extends Application { 
   @Override 
   public void start(Stage stage) {  
	   
	   ToggleGroup firstScreenRB = new ToggleGroup(); 
	      RadioButton setUpInv = new RadioButton("Set up inventory"); 
	      setUpInv.setToggleGroup(firstScreenRB); 
	      RadioButton searchInv = new RadioButton("Search inventory"); 
	      searchInv.setToggleGroup(firstScreenRB); 
	      RadioButton deleteInv = new RadioButton("Delete inventory"); 
	      deleteInv.setToggleGroup(firstScreenRB); 
	      
      //Creating Button 
      Button button1 = new Button("Go");   
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane 
      gridPane.setMinSize(200, 200); 
      
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(setUpInv, 0, 0); 
      gridPane.add(searchInv, 0, 1); 
      gridPane.add(deleteInv, 0, 2);       
      //gridPane.add(textField2, 1, 1); 
      gridPane.add(button1, 0, 4); 
      //gridPane.add(button2, 1, 2); 
       
      //Styling nodes  
      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      //button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
       
       
      gridPane.setStyle("-fx-background-color: BEIGE;"); 
      
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
       
      //Setting title to the Stage 
      stage.setTitle("Inventory"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}