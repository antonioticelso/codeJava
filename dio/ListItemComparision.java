import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SoftDrink {
    String name;
    String color;
    int volume; 

    SoftDrink (String name, String color, int volume) {
        this.name = name;
        this.color = color;
        this.volume = volume;
    }
}

public class ListItemComparision {
    public static void main (String...arg) {
        // Collection<String> list = new TreeSet<String>(Collator.getInstance());

        List<SoftDrink> softDrinkList = new ArrayList<SoftDrink>();
        softDrinkList .add(new SoftDrink("Faygo", "ColorOne", 4));
        softDrinkList .add(new SoftDrink("Marco", "ColorOne", 3));
        softDrinkList .add(new SoftDrink("Fanta",  "ColorTwo", 3));
        softDrinkList .add(new SoftDrink("Frooti", "ColorThree", 2));
        softDrinkList .add(new SoftDrink("Freshie", "ColorFour", 1));

        Collections.sort(softDrinkList, new Comparator() {
            @Override
            public int compare(Object softDrinkOne, Object softDrinkTwo) {
                //use instanceof to verify the references are indeed of the type in question
                return ((SoftDrink)softDrinkOne).name
                        .compareTo(((SoftDrink)softDrinkTwo).name);
            }
        }); 
        for (SoftDrink sd : softDrinkList) {
            System.out.println(sd.name + " - " + sd.color + " - " + sd.volume);
        }

        // Collections.sort(softDrinkList, new Comparator() {
        //     @Override
        //     public int compare(Object softDrinkOne, Object softDrinkTwo) {
        //         //comparision for primitive int uses compareTo of the wrapper Integer
        //         return(new Integer(((SoftDrink)softDrinkOne).volume))
        //                 .compareTo(((SoftDrink)softDrinkTwo).volume);
        //     }
        // });

        // for (SoftDrink sd : softDrinkList) {
        //     System.out.println(sd.volume + " - " + sd.color + " - " + sd.name);
        // }   
    }
}

