package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MampleController  implements Initializable {
    
 
    @FXML
    private ImageView eve;
    
    @FXML
    private VBox mybox2;
    
    @FXML
    private StackPane spane;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        //File file = new File("/images/cards/Ad.png");
        //Image image = new Image(file.toURI().toString());
    	//eve = new ImageView("images/cards/Ad.png");
        //card.setFitHeight(726); //726
       // card.setFitWidth(500); //500
        //Image image = new Image(getClass().getResourceAsStream("/images/cards/Ad.png"));
    	File file1 = new File("c:\\temp\\rifle.jpg");
        BackgroundImage myBI= new BackgroundImage(new Image(file1.toURI().toString(),532,532,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                  BackgroundSize.DEFAULT);

    	mybox2.setBackground(new Background(myBI));
    	
    	
    	
        File file = new File("c:\\temp\\cape.png");
        System.out.println("Init");
        Image image = new Image(file.toURI().toString());
        
        
        File file3 = new File("c:\\temp\\allure.png");
        Image splashimage = new Image(file3.toURI().toString());
        ImageView splashView = new ImageView();
        splashView.setImage(splashimage);
        
        //mybox2.getChildren().addAll(splashView);
       // mybox2
    //   spane.getChildren().addAll(splashView);
        
    //    Stage stage = (Stage) spane.getScene().getWindow();
    //    stage.setHeight(800);
     //   stage.setWidth(1600);
  //      eve.setFitHeight(100); //726
  //      eve.setFitWidth(200); //500
   //     eve.setImage(image);
    }    
 
}