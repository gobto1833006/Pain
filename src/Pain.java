import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        primaryStage.setFullScreen(false);
        primaryStage.setTitle("Dessins!");

        Text text1 = new Text("Jour");
        text1.setScaleY(3);
        text1.setScaleX(3);
        Text text2 = new Text("Nuit");
        text2.setScaleY(3);
        text2.setScaleX(3);
        text1.setTranslateX(480);
        text1.setTranslateY(800);
        text2.setTranslateX(1440);
        text2.setTranslateY(800);
        text2.setFill(Color.SNOW);


        Rectangle rectangle = new Rectangle(960, 0, 960, 1080);
        rectangle.setFill(Color.BLACK);
        Rectangle rectangle1 = new Rectangle(0, 0, 960, 1080);
        rectangle1.setFill(Color.WHITE);

        Maison maison = new Maison();
        Maison maison2 =new Maison();
        Etoile etoile1 =new Etoile();
        Etoile etoile2 =new Etoile();
        Etoile etoile3 =new Etoile();
        Etoile etoile4 =new Etoile();

        DropShadow ombrage = new DropShadow(20, -40, 40, Color.LIGHTGREY);
        maison.setEffect(ombrage);
        maison2.setTranslateX(950);

        etoile1.setTranslateY(100);
        etoile1.setTranslateX(1700);
        etoile2.setTranslateY(150);
        etoile2.setTranslateX(1300);
        etoile3.setTranslateY(200);
        etoile3.setTranslateX(1500);
        etoile4.setTranslateY(150);
        etoile4.setTranslateX(1410);


        Group group = new Group(rectangle, text2, text1, maison,maison2,etoile1,etoile2,etoile3,etoile4);
        primaryStage.setScene(new Scene(group));
        primaryStage.show();
    }
}



