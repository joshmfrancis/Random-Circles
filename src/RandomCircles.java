// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_6_14
// File Name: RandomCircles.java

// JavaFX Application that draws 100 circles of random color and random size in 
// Random locations while bieng visible on the whole screen

// Imports I used
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class RandomCircles extends Application 
{

    @Override
    public void start(Stage primaryStage) 
    {
        
        // Group root to hold all of the circles
        Group root = new Group();
        
        // Creates a random number generator object for use of the random values 
        Random gen = new Random();
        
        //width and height of the scene, for use of the circle position data
        int width = 700;
        int height = 600;
        
        // Loop to create the circles in random positions, size, and color
        for (int count = 1; count <=100; count++)
        {
            // Makes a random radius for a circle
            int radius = gen.nextInt(50)+5;
            
            // Makes a random x and y coordinate position for the circle
            int xPos = gen.nextInt(width-(radius*2))+radius;
            int yPos = gen.nextInt(height-(radius*2))+radius;
            
            // Makes the random colors for a circle
            int red = gen.nextInt(255);
            int blue = gen.nextInt(255);
            int green = gen.nextInt(255);
            
            // Creates a Color object to hold the color values for the circle
            Color randomColor = Color.rgb(red, blue, green);
            
            // Creates the circle object that holds all the above values
            Circle circle = new Circle(xPos, yPos, radius);
            circle.setFill(randomColor);
            circle.setStrokeWidth(2);
            circle.setStroke(Color.BLACK);
           
            // Adds the circle to the group root
            root.getChildren().add(circle); 
            
            //End of Loop, makes 100 Circles at the end
        }
    
        
        // Creates the scene and populates it the root group, size, and color
        Scene scene = new Scene(root, width, height, Color.WHITE);
        
        // Titles the stage and sets it to show with the scene
        primaryStage.setTitle("100 Random Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) 
    {
    launch(args);
    }
    
}
