import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class RayonSoleil extends Group {
    public RayonSoleil(int angle,double offset1,double offset2,double taille){
        Line rayon=new Line(0,0,0,360);
        Stop[] stopSoleil=new Stop[]{new Stop(0,Color.YELLOW),new Stop(offset1,Color.YELLOW),new Stop(offset1+0.00001,Color.TRANSPARENT),new Stop(offset2-0.00001,Color.TRANSPARENT),new Stop(offset2,Color.YELLOW),new Stop(1,Color.YELLOW)};
        LinearGradient couleurRayonSoleil=new LinearGradient(0,0,1,1,true,CycleMethod.NO_CYCLE,stopSoleil);
        rayon.setStroke(couleurRayonSoleil);
        rayon.setTranslateY(-180);
        rayon.setScaleX(2);
        rayon.setScaleY(taille);

        RotateTransition rotateTransition=new RotateTransition(Duration.seconds(1.25),rayon);
        rotateTransition.setToAngle(angle);
        rotateTransition.setFromAngle(angle-90);
        rotateTransition.setAutoReverse(false);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.play();

        this.getChildren().addAll(rayon);
    }
}
