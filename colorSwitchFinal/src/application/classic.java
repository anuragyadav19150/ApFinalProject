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


public class classic {
	classic(){
		
	}
	static Scene s3;
	
	public static Group doit(Stage s) {
		//Scene s2;
		 Canvas canvas = new Canvas();
		 canvas.setHeight(800); 
	        canvas.setWidth(800); 
	        
	      //  classic c=new classic();
	        notmain m1=new notmain();
	  
	        // graphics context 
	        GraphicsContext graphics_context =  
	            canvas.getGraphicsContext2D(); 
	        graphics_context.setFill(Color.LIGHTBLUE); 
	        graphics_context.fillRect(0, 0, 600, 600);
	  
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
	        Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 28 );
	        gc.setFont( theFont );
	        gc.fillText( "CHOOSE GAME_MODE!", 120, 250  );
	        gc.strokeText( "CHOOSE GAME_MODE!", 120, 250  );

	        
	        gc1.setFill( Color.BLUE );
	        gc1.setStroke( Color.BLACK );
	        gc1.setLineWidth(1.5);
	        Font theFont1 = Font.font( "Times New Roman", FontWeight.BOLD, 50 );
	        gc1.setFont( theFont1 );
	        gc1.fillText( "COLOR SWITCH", 80, 150);
	        gc1.strokeText( "COLOR SWITCH", 80, 150 );
	        
	        
	        Button b = new Button("START"); 
	        Button bt = new Button("PAUSE"); 
	        Button btt = new Button("RESUME"); 
	        
	        // create a stack pane 
	        Pane r = new Pane(); 
	  
	        // create a label 
	        Label l = new Label("");
	        b.setScaleY(3);
	        b.setScaleX(4);
	        b.setLayoutX(100);  //this is how you change locations
	        b.setLayoutY(350);
	        
	        bt.setScaleY(3);
	        bt.setScaleX(4);
	        bt.setLayoutX(400);  //this is how you change locations
	        bt.setLayoutY(350);
	        r.getChildren().add(b); 
	        // bt.setOnAction(event);
	        
	        btt.setScaleY(3);
	        btt.setScaleX(4);
	        btt.setLayoutX(250);  //this is how you change locations
	        btt.setLayoutY(450);
	        
	   	  
	         // add button 
	         r.getChildren().add(bt);
	         r.getChildren().add(btt);
	         Group f1=new Group();
	         b.setOnAction(e -> {
		         	//s.setScene(s3);
		         	//g.doit(s1);
	        	 m1.startu(s);
		         	
		         	
		                  	
		     		
		         });
		        // s3=new Scene(f1,600,600);
	     
	         Group g2=new Group(canvas,r);
		        return g2;
		
	}

}
