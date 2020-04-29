import java.util.Arrays;

public class ZombieKiller {
    public static void main(String[] args) {
        System.out.println("welcome to our zombieKiller program");


        //an array is a list of whatever you want

        String backpack[]={"shotgun","Assult rifle", "Sniper"};
        String zombies[]={"Close-range", "mid-range","High-Range"};
        int numbersZombiesHate[] ={2,4,6,7,9};


        System.out.println("Backpack items:");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);


        //can print elements one by one with index
        System.out.println("zombie types/:");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);

        //or print full array
        System.out.println(Arrays.toString(numbersZombiesHate ));
        System.out.println(Arrays.toString(backpack));
        System.out.println(Arrays.toString(zombies));

    }
}
