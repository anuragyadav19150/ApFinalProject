package application;
	

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.Label; 
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage; 
import java.net.*; 
import javafx.scene.layout.*; 
import javafx.scene.image.*;
import javafx.scene.input.KeyCode;
import javafx.animation.FillTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Polygon;  
import javafx.stage.Stage;  
import javafx.util.Duration;
import javafx.animation.StrokeTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;  
import javafx.stage.Stage;  
import javafx.util.Duration;


//--module-path "D:\javafx\javafx-sdk-15.0.1\lib" --add-modules javafx.controls,javafx.fxml
public class HomeScreen extends Application {
	Scene s1;
    @Override
    public void start( Stage stage) 
    {
    	stage.setTitle("creating canvas"); 
    	  
        // create a canvas 
        Canvas canvas = new Canvas(); 
        gameMode g=new gameMode();
        // set height and width 
        canvas.setHeight(800); 
        canvas.setWidth(800); 
  
        // graphics context 
        GraphicsContext graphics_context =  
            canvas.getGraphicsContext2D(); 
        graphics_context.setFill(Color.PINK); 
        graphics_context.fillRect(0, 0, 800, 800);
  
        // set fill for rectangle 
        graphics_context.setFill(Color.YELLOW); 
        graphics_context.fillRect(30, 30, 70, 70); 
  
        // set fill for rectangle 
        graphics_context.setFill(Color.RED); 
        graphics_context.fillRect(20, 20, 70, 70);
        
        
  
        // set fill for oval 
        graphics_context.setFill(Color.BLUE); 
        graphics_context.fillRect(10, 10, 70,70); 
  
        
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        GraphicsContext gc1 = canvas.getGraphicsContext2D();
         
        gc.setFill( Color.RED );
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(2);
        Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
        gc.setFont( theFont );
        gc.fillText( "WELCOME TO HOMESCREEN!", 60, 150 );
        gc.strokeText( "WELCOME TO HOMESCREEN!", 60, 150 );

        
        gc1.setFill( Color.BLUE );
        gc1.setStroke( Color.BLACK );
        gc1.setLineWidth(1.5);
        Font theFont1 = Font.font( "Times New Roman", FontWeight.BOLD, 65 );
        gc1.setFont( theFont1 );
        gc1.fillText( "COLOR SWITCH", 150, 250 );
        gc1.strokeText( "COLOR SWITCH", 150, 250 );
        FillTransition fill = new FillTransition();  
        Circle cir = new Circle(400,450,100);   
        
        
        fill.setAutoReverse(true);  
          
         
        fill.setCycleCount(50);  
          
       
        fill.setDuration(Duration.millis(2000));  
          
    
        fill.setFromValue(Color.RED);  
         
        fill.setToValue(Color.YELLOW); 
//        fill.setFromValue(Color.YELLOW);
//        fill.setToValue(Color.BLUE);
//        
//        fill.setFromValue(Color.BLUE);  
//         
//        fill.setToValue(Color.PURPLE); 
        fill.setShape(cir);
          
        
          
        //playing the fill transition   
        fill.play(); 
        cir.setStrokeWidth(10); 
        StrokeTransition stroke = new StrokeTransition();  
        
        //The transition will set to be auto reserved by setting this to true  
        stroke.setAutoReverse(true);  
          
        //setting cycle count for the Stroke transition   
        stroke.setCycleCount(500);  
          
        //setting duration for the Stroke Transition   
        stroke.setDuration(Duration.millis(2000));  
          
        //setting the Initial from value of the Stroke color  
        stroke.setFromValue(Color.BLUE);  
          
        //setting the target value of the Stroke color   
        stroke.setToValue(Color.PURPLE);  
          
        //setting polygon as the shape onto which the Stroke transition will be applied   
        stroke.setShape(cir);  
        
          
        //playing the Stroke transition   
        stroke.play();
        
        
        Button b = new Button("START GAME"); 
        Button bt = new Button("     EXIT     "); 
        
        // create a stack pane 
        Pane r = new Pane(); 
  
        // create a label 
        Label l = new Label("");
        b.setScaleY(3);
        b.setScaleX(4);
        b.setLayoutX(200);  //this is how you change locations
        b.setLayoutY(650);
        
        bt.setScaleY(3);
        bt.setScaleX(4);
        bt.setLayoutX(570);  //this is how you change locations
        bt.setLayoutY(650);
  
        // action event 
//        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
//            public void handle(ActionEvent e) 
//            { 
//            	b.setOnAction(event->stage.setScene(s1));
//                StackPane sp=new StackPane();
//                s1=new Scene(sp,800,800);
//                
//            } 
//        }; 
//  
        // when button is pressed 
    //    b.setOnAction({e->{stage.setScene(s1)}); 
        r.getChildren().add(b); 
        // bt.setOnAction(event); 
   	  
         // add button 
         r.getChildren().add(bt); 
         //r.getChildren().add(l);
         
         Group group = new Group(canvas,r); 
         group.getChildren().addAll(cir);
        Scene scene = new Scene(group, 800, 800); 
        
        Group f=new Group();
        b.setOnAction(e -> {
        	stage.setScene(s1);
        	//g.doit(s1);
        	
        	f.getChildren().add(g.doit(stage,scene));
                 	
    		
        });
        //StackPane sp=new StackPane();
        s1=new Scene(f,600,600);
        
        bt.setOnAction(e -> {
        	stage.close();
                 	
    		
        });
        
        
  
        // add button 
      
  
        // create a scene 
        
  
        // set the scene 
        stage.setScene(scene); 
  
        stage.show(); 
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // launch the application 
        launch(args); 
    }
}
