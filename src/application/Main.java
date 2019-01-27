package application;
	
import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	   static double DPI;
	   static double DPIHeight;
	   
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
		      Parent root = FXMLLoader.load(getClass().getResource("/Mample.fxml"));
		        Scene scene = new Scene(root, 100, 175);
	        
		        primaryStage.setTitle("FXML Welcome");
		        primaryStage.setScene(scene);
		        primaryStage.sizeToScene();
		        primaryStage.show();
		        
		        */
		   	File file1 = new File("c:\\temp\\rifle.jpg");
		   	file1 = new File("c:\\temp\\back.png");
		   	Image back = new Image(file1.toURI().toString());
		   	double width = back.getWidth();
		   	double height = back.getHeight();
	        BackgroundImage myBI= new BackgroundImage(back,
	                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
	                  BackgroundSize.DEFAULT);

		       	        
	    	
			final VBox root1 = new VBox();
			
			final StackPane root = new StackPane();
			
		//	root.setBackground(new Background(myBI));
			root.setAlignment(Pos.TOP_LEFT);
			primaryStage.setHeight(height);
			primaryStage.setWidth(width);
			for(int i=0;i<1;i++) {
		     File file3 = new File("c:\\temp\\allure.png");
		     file3 = new File("c:\\temp\\printer.png");
		        Image splashimage = new Image(file3.toURI().toString());
		        //Image splashimage = new Image(file3.toURI().toString(),400,400,true,true);
		        ImageView splashView = new ImageView();
		        splashView.setImage(splashimage);
			
		            // apply a shadow effect.
		        DropShadow shadow = new DropShadow();
		        shadow.setOffsetX(3.0);
		        shadow.setOffsetY(3.0);
	            splashView.setEffect(shadow);
		        
		        splashView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

		            @Override
		            public void handle(MouseEvent event) {
		                System.out.println("Titanic pressed ");
		                event.consume();
		            }
		       });
		        
		        splashView.setTranslateX(100+(i*5));
		        splashView.setTranslateY(100+(i*5));
		        splashView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

		            @Override
		            public void handle(MouseEvent event) {
		                Parent root;
		                try {
		                	root = FXMLLoader.load(getClass().getResource("/Mample.fxml"));
		                    Stage stage = new Stage();
		                    stage.setTitle("My New Stage Title");
		                    stage.setScene(new Scene(root, 450, 450));
		                    stage.show();
		                    // Hide this current window (if this is what you want)
		                  //  ((Node)(event.getSource())).getScene().getWindow().hide();
		                }
		                catch (IOException e) {
		                    e.printStackTrace();
		                }
		                event.consume();
		            }
		       });

		       root.getChildren().addAll(splashView);
			}
				primaryStage.setScene(new Scene(root));
				GetDPI();
				
				primaryStage.show();
		       
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	   private static void GetDPI() {
		   
		   Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		   // Rectangle2D bounds =null;
		   
			DPIHeight = bounds.getHeight() / (double) (800 + 25 + 75); // main png + titlebar height + extra gaps above and
																		// below
			DPI = bounds.getWidth() / (double) 1600;
			System.out.println("DPI: " + DPI + " DPIH: " + DPIHeight + " W: " + bounds.getWidth());
			// DPI = 800 / (double) 1920;
			// DPI = 1;
			if (DPIHeight < DPI)
				DPI = DPIHeight;

	   }
	public static void main(String[] args) {
		launch(args);
	}
}
