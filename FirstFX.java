import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application {

    public void start(Stage stage){
	Text face = new Text(0, 0, "\nAccording to all known laws\nof aviation,\nthere is no way a bee\nshould be able to fly.\nIts wings are too small to get\nits fat little body off the ground.\nThe bee, of course, flies anyway\nbecause bees don't care\nwhat humans think is impossible.");
	Rectangle head = new Rectangle(0, 0, 200, 200);
	
	head.setStroke(Color.BLUE);
	head.setFill(null);
	
	Rectangle flag = new Rectangle(250, 250, 80, 60);
	Line pole = new Line(250, 250, 250, 500);

	flag.setStroke(Color.YELLOW);
	flag.setFill(Color.YELLOW);
	
	Group root = new Group(face, head, flag, pole);
	Scene scene = new Scene(root, 640, 480, Color.LIGHTGREEN);

	stage.setTitle("First Fx Program");
	stage.setScene(scene);
	stage.show();
    }

    public static void main(String[] args){
	launch(args);
    }
}
