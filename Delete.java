package application;

import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;  
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text;  
import javafx.scene.control.ToggleGroup;   
import javafx.stage.Stage; 

public class Delete extends Application {
	
	 public void start(Stage stage) {   
		 
		 Text instructions = new Text("Select from below or type barcode."); 
		 Text barcodeLabel = new Text("Barcode: ");
		//Creating new text field for barcode option
	         TextField barcode = new TextField();
	 
		  Text nameLabel = new Text("Type of clothes"); 
		  ToggleGroup groupType = new ToggleGroup(); 
	      RadioButton shirt = new RadioButton("shirt"); 
	      shirt.setToggleGroup(groupType); 
	      RadioButton dress = new RadioButton("dress"); 
	      dress.setToggleGroup(groupType); 
	      RadioButton pants = new RadioButton("pants");
	      pants.setToggleGroup(groupType);
	      
	      Text nameLabel2 = new Text("Size of clothes"); 
		  ToggleGroup groupSize = new ToggleGroup(); 
	      RadioButton sizeS = new RadioButton("S"); 
	      sizeS.setToggleGroup(groupSize); 
	      RadioButton sizeM = new RadioButton("M"); 
	      sizeM.setToggleGroup(groupSize); 
	      RadioButton sizeL = new RadioButton("L");
	      sizeL.setToggleGroup(groupSize);
	      
	      Text nameLabel3 = new Text("Color of clothes"); 
		  ToggleGroup groupColor = new ToggleGroup(); 
	      RadioButton blue = new RadioButton("blue"); 
	      blue.setToggleGroup(groupColor); 
	      RadioButton yellow = new RadioButton("yellow"); 
	      yellow.setToggleGroup(groupColor); 
	      RadioButton pink = new RadioButton("pink");
	      pink.setToggleGroup(groupColor);
	      
	      Button button1 = new Button("Delete from inventory"); 
	      
	    //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	      
	      //Setting size for the pane 
	      gridPane.setMinSize(383, 512); 
	      gridPane.setStyle("-fx-background-color: BEIGE;");
	      
	      //Setting the padding    
	      gridPane.setPadding(new Insets(5, 5, 5, 5));  
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      
	      //Setting the Grid alignment 
	     // gridPane.setAlignment(Pos.CENTER); 
	      
	      gridPane.add(instructions, 1, 1);
	      gridPane.add(barcodeLabel,1, 30);
	      gridPane.add(nameLabel, 1, 3);
	      gridPane.add(shirt,1,4);
	      gridPane.add(dress, 2, 4);
	      gridPane.add(pants, 11, 4);
	      gridPane.add(nameLabel2, 1, 8);
	      gridPane.add(sizeS,1,9);
	      gridPane.add(sizeM, 2,9);
	      gridPane.add(sizeL, 11,9);
	      gridPane.add(nameLabel3, 1,13);
	      gridPane.add(blue,1,15);
	      gridPane.add(yellow, 2, 15);
	      gridPane.add(pink, 11, 15);
	      gridPane.add(barcode, 1, 33);
	      gridPane.add(button1, 1, 40);
	      
	      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");      
	      
	    //Creating a scene object 
	      Scene scene = new Scene(gridPane); 
	       
	      //Setting title to the Stage 
	      stage.setTitle("Delete inventory"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);
	      
	      //Displaying the contents of the stage 
	      stage.show(); 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args); 
	}

}
