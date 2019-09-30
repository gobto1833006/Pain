
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
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
        DropShadow ombrage = new DropShadow(20, -40, 40, Color.LIGHTGREY);
        maison.setEffect(ombrage);
        maison2.setTranslateX(950);



        Etoile etoile1 =new Etoile(1);
        Etoile etoile2 =new Etoile(3);
        Etoile etoile3 =new Etoile(2.5);
        Etoile etoile4 =new Etoile(1.75);

        etoile1.setTranslateY(50);
        etoile1.setTranslateX(1000);
        etoile1.setScaleX(0.5);
        etoile1.setScaleY(0.5);
        etoile2.setTranslateY(250);
        etoile2.setTranslateX(1150);
        etoile2.setScaleX(0.35);
        etoile2.setScaleY(0.35);
        etoile3.setTranslateY(150);
        etoile3.setTranslateX(1300);
        etoile3.setScaleX(0.4);
        etoile3.setScaleY(0.4);
        etoile4.setTranslateY(200);
        etoile4.setTranslateX(1510);
        etoile4.setScaleX(0.6);
        etoile4.setScaleY(0.6);


        Circle lune=new Circle(60);
        Stop[] stops=new Stop[]{new Stop(0,Color.LIGHTGREY),new Stop(1,Color.BLACK)};
        LinearGradient dégradé=new LinearGradient(0,0,1,1,true,CycleMethod.NO_CYCLE,stops);
        lune.setFill(dégradé);
        lune.setTranslateY(200);
        lune.setTranslateX(1710);


        Soleil soleil =new Soleil();
        soleil.setTranslateX(750);
        soleil.setTranslateY(200);


       Oiseau oiseau1 =new Oiseau();
       Oiseau oiseau2 =new Oiseau();
       oiseau1.setTranslateY(200);
       oiseau2.setTranslateX(300);
       oiseau2.setTranslateY(100);





        Group group = new Group(rectangle, text2, text1, maison,maison2,etoile1,etoile2,etoile3,etoile4,lune,soleil,oiseau1,oiseau2);
        primaryStage.setScene(new Scene(group));
        primaryStage.show();
    }
}



