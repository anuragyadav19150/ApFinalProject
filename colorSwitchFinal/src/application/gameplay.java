package application;

import javafx.animation.KeyValue;
import javafx.animation.Timeline;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

import java.util.*;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Shape;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;

public class gameplay {

	void Rotate(Shape c, boolean reverse, int angle, int duration) {
		RotateTransition rt = new RotateTransition(Duration.seconds(duration), c);
		rt.setAutoReverse(reverse);
		rt.setByAngle(angle);
		rt.setRate(3);
		rt.setCycleCount(500);
		rt.playFromStart();
	}

	Stage window;

	public void startu(Stage primaryStage) {

		window = primaryStage;
		Pane canvas1 = new Pane();
		Circle c1 = new Circle(134);
		Color f = Color.web("#1f93ff00");
		c1.setFill(f);
		c1.setLayoutX(400);
		c1.setLayoutY(170);
		c1.setStyle("-fx-stroke: #b700ff; -fx-strokeType: INSIDE;-fx-strokeWidth: 15; -fx-stroke-dash-array: 100;");
		c1.setStrokeWidth(15);
		Rotate(c1, true, 360, 20);

		Circle c2 = new Circle(80);
		c2.setFill(f);
		c2.setLayoutX(400);
		c2.setLayoutY(170);
		c2.setStyle("-fx-stroke: #b7ffff; -fx-strokeType: INSIDE;-fx-strokeWidth: 15; -fx-stroke-dash-array: 100;");
		c2.setStrokeWidth(15);
		Rotate(c2, true, 360, 20);

		Ball b = new Ball(400, 500, "RED");

		Group g1 = new Group();

		Path path1 = new Path();
		path1.getElements().add(new MoveTo(300, 400));
		path1.getElements().add(new LineTo(500, 400));
		path1.setStrokeWidth(15);
		path1.setStroke(Color.CYAN);

		Path path2 = new Path();
		path2.getElements().add(new MoveTo(300, 385));
		path2.getElements().add(new LineTo(300, 175));
		path2.setStrokeWidth(15);
		path2.setStroke(Color.GOLD);

		Path path3 = new Path();
		path3.getElements().add(new MoveTo(500, 385));
		path3.getElements().add(new LineTo(500, 175));
		path3.setStrokeWidth(15);
		path3.setStroke(Color.LAWNGREEN);

		Path path4 = new Path();
		path4.getElements().add(new MoveTo(300, 175));
		path4.getElements().add(new LineTo(500, 175));
		path4.setStrokeWidth(15);
		path4.setStroke(Color.CYAN);

		g1.getChildren().addAll(path1, path2, path3, path4);

		// Obstacle o1=new Obstacle(g1);
		StackPane sp = new StackPane();
		Image img = new Image("b12.png");
		ImageView imgView = new ImageView(img);
		imgView.setX(50);
		imgView.setY(25);

		imgView.setFitHeight(800);
		imgView.setFitWidth(800);
		sp.getChildren().add(imgView);

		Rotate(path1, true, 360, 20);
		Rotate(path2, true, 360, 20);
		Rotate(path3, true, 360, 20);
		Rotate(path4, true, 360, 20);
		canvas1.getChildren().addAll(sp, b.ball, g1);
		Scene scene2 = new Scene(canvas1, 800, 800);
		scene2.setFill(Color.BLACK);
		window.setScene(scene2);

		Bounds bounds = canvas1.getBoundsInLocal();

		AnimationTimer timer = new AnimationTimer() {

			@Override
			public void handle(long arg0) {

				if (b.ball.getBoundsInLocal().getCenterY() < bounds.getMaxY()) {

					b.ball.setCenterY(b.ball.getCenterY() + 2);// TODO Auto-generated method stub
				} else {
					// System.out.println("Game over");
				}
			}

		};
		timer.start();

		scene2.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode().toString().equals("W")) {
					b.ball.setCenterY(b.ball.getCenterY() - 80);
				}

			}

		});

		window.show();

	}

}