import javafx.animation.FillTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Soleil extends Group {
    public Soleil(){
        Circle soleil =new Circle(60);
        FillTransition fillTransition=new FillTransition(Duration.seconds(3),soleil);
        fillTransition.setFromValue(Color.YELLOW);
        fillTransition.setToValue(Color.ORANGE);
        fillTransition.setCycleCount(Timeline.INDEFINITE);
        fillTransition.setAutoReverse(true);
        fillTransition.play();

        RayonSoleil rayonSoleil1=new RayonSoleil(0,0.3,0.7,1);
        RayonSoleil rayonSoleil2=new RayonSoleil(90,0.3,0.7,1);
        RayonSoleil rayonSoleil3=new RayonSoleil(45,0.25,0.75,0.75);
        RayonSoleil rayonSoleil4=new RayonSoleil(135,0.25,0.75,0.75);



        this.getChildren().addAll(soleil,rayonSoleil1,rayonSoleil2,rayonSoleil3,rayonSoleil4);
    }
}
