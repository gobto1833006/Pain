import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Etoile extends Group {
    public Etoile(){
        Polygon etoile=new Polygon(-10,0,25,0,45,-35,65,0,100,0,70,15,80,45,45,30,10,45,20,15);
        this.getChildren().addAll(etoile);
        etoile.setFill(Color.YELLOW);
    }
}
