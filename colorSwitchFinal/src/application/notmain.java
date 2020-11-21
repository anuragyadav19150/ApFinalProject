package application;
	




import javafx.animation.KeyValue;
import javafx.animation.Timeline;

/*//import java.awt.Button;
import java.awt.Label;
import javafx.scene.control.Button; 

import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.control.Button; 
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;

public class notmain {

	void Color_Change_Check(Circle ball,Circle c,Pane canvas) {
		if(ball.getBoundsInParent().intersects(c.getBoundsInParent()))
		{
			ball.setFill(Color.BLUE);
			canvas.getChildren().remove(c);
			c=null;
			
			
		}
		
	}
	
	Stage window;
	public void startu(Stage s) {
	
			window= s;
			Pane canvas = new Pane();
	    	Scene scene = new Scene(canvas, 300, 300);
	    	Ball b=new Ball(150,100,"Red");
	    	colorChanger c=new colorChanger(150,50);
	        
	        canvas.getChildren().addAll(b.ball,c.changer);
	        window.setTitle("Moving Ball");
	        window.setScene(scene);
	        window.show();
			
			  Button button; 
			  button=new Button("Bounce the ball");
			  canvas.getChildren().add(button);
			  button.relocate(0,30);
			  
//			  button.setOnMousePressed(new EventHandler<Event>() {
//
//				@Override
//				public void handle(Event arg0) {
//					ball.setCenterY(ball.getCenterY()-25);
//					
//				}
//				  
//			  });
			  
//			  EventHandler<KeyEvent> click=new EventHandler<KeyEvent>() {
//
//				@Override
//				public void handle(KeyEvent key) {
//					//if(key.getCharacter().equals("w"))
//					//{
//						ball.setCenterY(ball.getCenterY()-25);
//					//}
//					// TODO Auto-generated method stub
//					
//				}
//				  
//			  };
			  
			  scene.setOnKeyPressed(new EventHandler<KeyEvent>(){

				@Override
				public void handle(KeyEvent event) {
					if(event.getCode().toString().equals("W"))
					{
						b.ball.setCenterY(b.ball.getCenterY()-25);
					}
					
				}
				  
			  });
			  
			 
			  
//			  button.setOnMouseReleased(new EventHandler<Event>() {
//
//				@Override
//				public void handle(Event arg0) {
//					ball.relocate(ball.getCenterX(), ball.getCenterY());
//					// TODO Auto-generated method stub
//					
//				}
//				  
//			  });
			 
			
	        
	        /*
			 * Label label1=new Label("Color Switch"); Label label2=new
			 * Label("Welcome to NEW GAME"); Label label3=new
			 * Label("Welcome to SAVED GAME"); Button button1=new Button("NEW GAME"); Button
			 * button2=new Button("Load Games"); //button1.setOnAction(e ->
			 * window.setScene(scene2));
			 * 
			 * 
			 * final String
			 * Button_Pressed="-fx-background-color: transparent; -fx-background-image: url('/red_button_pressed.png');"
			 * ; final String
			 * Button_Free="-fx-background-color: transparent; -fx-background-image: url('/red_button.png');"
			 * ; button1.setStyle(Button_Free); button2.setStyle(Button_Free);
			 * 
			 * button1.setOnMousePressed(new EventHandler() {
			 * 
			 * @Override public void handle(javafx.event.Event arg0) {
			 * button1.setStyle(Button_Pressed);// TODO Auto-generated method stub
			 * 
			 * } });
			 * 
			 * VBox layout1= new VBox();
			 * layout1.getChildren().addAll(label1,button1,button2); scene1= new
			 * Scene(layout1,800,800);
			 * 
			 * StackPane layout2= new StackPane(); layout2.getChildren().add(label2);
			 * scene2= new Scene(layout2,800,800);
			 */
			
			//window.setScene(scene1);
			window.show();
			
			Bounds bounds = canvas.getBoundsInLocal();
//	        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), 
//	                new KeyValue(ball.layoutYProperty(), ball.getCenterY()-0.5)));
////	      //  timeline.setCycleCount(1);
//	        timeline.play();
			
			AnimationTimer timer=new AnimationTimer() {

				@Override
				public void handle(long arg0) {
					 Color_Change_Check(b.ball,c.changer,canvas);
					if(b.ball.getCenterY()<290)
					{
						//System.out.println(ball.getCenterY());
					b.ball.setCenterY(b.ball.getCenterY()+0.8);// TODO Auto-generated method stub
					}
					else
					{
						System.out.println("Game over");
						
					}
				}
				
			};
			timer.start();
			
			
	
	}
	
	
}