import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;



public class Maison extends Group {
    public Maison() {

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
        this.getChildren().addAll(maison);
    }
}
