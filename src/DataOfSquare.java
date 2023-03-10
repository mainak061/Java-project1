import javax.swing.plaf.ColorUIResource;
import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {


    //ArrayList that'll contain the colors
    ArrayList<Color> C =new ArrayList<Color>();
    int color; //2: snake , 1: food, 0:empty
    SquarePanel square;
    public DataOfSquare(int col){

        //Let's add the color to the arrayList
        C.add(Color.red);//0
        C.add(Color.yellow);    //1
        C.add(Color.black);   //2
        color=col;
        square = new SquarePanel(C.get(color));
    }
    public void lightMeUp(int c){
        square.ChangeColor(C.get(c));
    }
}
