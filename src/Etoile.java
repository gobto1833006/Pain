import javafx.animation.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

public class Etoile extends Group {
    public Etoile(double duration) {
        Polygon etoile = new Polygon(-10, 0, 25, 0, 45, -35, 65, 0, 100, 0, 70, 15, 80, 45, 45, 30, 10, 45, 20, 15);
        etoile.setFill(Color.YELLOW);
        FadeTransition shimering = new FadeTransition(Duration.seconds(duration), etoile);
        shimering.setAutoReverse(true);
        shimering.setFromValue(1);
        shimering.setToValue(0);
        shimering.setCycleCount(FadeTransition.INDEFINITE);
        shimering.play();
        this.getChildren().addAll(etoile);

    }
}
