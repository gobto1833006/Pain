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

        Rectangle fondMaison = new Rectangle(0, 0, 300, 200);
        fondMaison.setFill(Color.BEIGE);

        Rectangle fenetre = new Rectangle(200, 95, 60, 30);
        fenetre.setFill(Color.AQUA);
        fenetre.setStroke(Color.DARKGRAY);
        fenetre.setStrokeWidth(5 / 2);

        Line barreauFenetreHor = new Line(200, 110, 260, 110);
        barreauFenetreHor.setStroke(Color.DARKGREY);
        barreauFenetreHor.setStrokeWidth(5 / 2);

        Line barreauFenetreVer = new Line(230, 95, 230, 125);
        barreauFenetreVer.setStroke(Color.DARKGRAY);
        barreauFenetreVer.setStrokeWidth(5 / 2);

        Group groupeFenetre = new Group(fenetre, barreauFenetreHor, barreauFenetreVer);
        groupeFenetre.setScaleX(2);
        groupeFenetre.setScaleY(2);
        groupeFenetre.setTranslateX(-25);

        Rectangle porte = new Rectangle(40, 110, 50, 90);
        porte.setFill(Color.BROWN);

        Circle poignePorte = new Circle(10);
        poignePorte.setTranslateX(75);
        poignePorte.setTranslateY(155);
        poignePorte.setFill(Color.GREEN);

        Polygon triangle = new Polygon(-15, 0, 150, -165, 315, 0);
        triangle.setFill(Color.RED);

        Group maison = new Group(fondMaison, groupeFenetre, porte, poignePorte, triangle);
        maison.setTranslateX(350);
        maison.setTranslateY(500);

        DropShadow ombrage = new DropShadow(20, -40, 40, Color.BLACK);
        maison.setEffect(ombrage);
        Group maison2 = new Group(maison.getChildren());


        Group group = new Group(rectangle, text2, text1, maison, maison2);
        primaryStage.setScene(new Scene(group));
        primaryStage.show();
    }
}


    
