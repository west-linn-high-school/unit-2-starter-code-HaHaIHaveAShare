import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Snowman extends Application {

    @Override
    public void start(Stage stage){

	double WIN_WIDTH = 640;
	double WIN_HEIGHT = 480;
	
	Rectangle ground = new Rectangle(0, WIN_HEIGHT/2, WIN_WIDTH, WIN_HEIGHT/2);

	ground.setFill(Color.WHITE);

	Image img = new Image("https://i.pinimg.com/originals/11/1a/e8/111ae85eae5061d92e3b67de68516331.png", WIN_WIDTH, WIN_HEIGHT, false, true); // Work smarter, not harder
        ImageView imgView = new ImageView(img);
	
	Group root = new Group(ground, imgView);
	Scene scene = new Scene(root, WIN_WIDTH, WIN_HEIGHT, Color.LIGHTBLUE);
      
	stage.setTitle("\u2744\u2603\u2744\u2603\u2744\u2603\u2744");
	stage.setScene(scene);
	stage.show();
	
    }
    public static void main(String[] args){
	launch(args);
    }
}
