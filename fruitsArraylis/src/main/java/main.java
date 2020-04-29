import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {


        //difference between arrays and array list
        //arrays you MUST know the size
        //arrays are better for smaller things for which you know the size
        String[] fruits = new String[4];
        fruits[0]="Mango";
        fruits[1]="Apple";
        fruits[2]="Strawberry";
        fruits[3]="watermelon";
        System.out.println(Arrays.toString(fruits));


       //Arraylists are more flexible and dont require you to have
        //a definite size
        //Arraylists have different features using the dot operator that arrays do not
        ArrayList fruitsList = new ArrayList();
        fruitsList.add("Mango");
        fruitsList.add("Apple");
        fruitsList.add("Strawberry");
        fruitsList.add("watermelon");

        System.out.println(fruitsList);

        //see if list contains spevcific items. will return true or false
        System.out.println(fruitsList.contains("raspberry"));

        //remove something grom list
        fruitsList.remove("Mango");
        System.out.println(fruitsList);
        //clear whole array
        fruitsList.clear();

        System.out.println(fruitsList);


    }
}
