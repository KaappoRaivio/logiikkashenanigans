import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main (String args[]) {
        Kauppalista kauppalista = new Kauppalista(Item.getExamples());

        System.out.println(kauppalista.toString());

    }
}

class Kauppalista {
    private List<Item> jutut = new ArrayList<>();
    private long luomisaika;

    Kauppalista (List<Item> jutut) {
        this.jutut = jutut;
        this.luomisaika = System.currentTimeMillis();
    }

    @Override
    public String toString () {
        return "Kauppalista(" + this.jutut.toString() + ", " + this.luomisaika + ")";
    }
}


class Item {
    public static String MAITOTUOTE = "maito";
    public static String HEVI = "hevi";
    public static String LIHATUOTE = "liha";
    public static String MUUT = "muu";

    private String nimi;
    private String tuoteryhmä;
    private int määrä;


    Item (String nimi, String tuoteryhmä, int määrä) {
        this.nimi = nimi;
        this.tuoteryhmä = tuoteryhmä;
        this.määrä = määrä;

        // assert tuoteryhmä on cons
    }

    @Override
    public String toString ()  {
        return "Item (" + this.nimi + ", " + this.tuoteryhmä + ", " + this.määrä + ")";
    }

    public static List<Item> getExamples () {
        List<Item> temp = new ArrayList<>();

        temp.add(new Item("Maito", Item.MAITOTUOTE, 1));
        temp.add(new Item("Kinkku", Item.LIHATUOTE, 1));
        temp.add(new Item("Juusto", Item.MAITOTUOTE, 1));
        temp.add(new Item("Omenat", Item.HEVI, 1));

        return temp;
    }
}
