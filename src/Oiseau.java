import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.util.Duration;

public class Oiseau extends Group {
    public Oiseau(){
        QuadCurve aileGauche=new QuadCurve(125,0,175,0,200,75);
        aileGauche.setStroke(Color.BLACK);
        aileGauche.setFill(Color.TRANSPARENT);
        aileGauche.setStrokeWidth(3);
        QuadCurve aileDroite=new QuadCurve(200,75,225,0,275,0);
        aileDroite.setStroke(Color.BLACK);
        aileDroite.setFill(Color.TRANSPARENT);
        aileDroite.setStrokeWidth(3);

        Timeline timeline=new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);

        KeyValue keyValue1 =new KeyValue(aileGauche.startYProperty(),0);
        KeyValue keyValue2 =new KeyValue(aileGauche.endYProperty(),75);
        KeyValue keyValue3 =new KeyValue(aileDroite.startYProperty(),75);
        KeyValue keyValue4 =new KeyValue(aileDroite.endYProperty(),0);
        KeyFrame keyFrame1=new KeyFrame(Duration.seconds(0),keyValue1,keyValue2,keyValue3,keyValue4);

        KeyValue keyValue5 =new KeyValue(aileGauche.startYProperty(),75);
        KeyValue keyValue6 =new KeyValue(aileGauche.endYProperty(),60);
        KeyValue keyValue7 =new KeyValue(aileDroite.startYProperty(),60);
        KeyValue keyValue8 =new KeyValue(aileDroite.endYProperty(),75);
        KeyFrame keyFrame2=new KeyFrame(Duration.seconds(1),keyValue5,keyValue6,keyValue7,keyValue8);

        timeline.getKeyFrames().addAll(keyFrame1,keyFrame2);
        timeline.setAutoReverse(true);
        timeline.play();



        this.getChildren().addAll(aileDroite,aileGauche);

    }
}
