public class main {
    public static void main (String args[]) {
        Item item = new Item("Maito", Item.MAITOTUOTE, 1);
        System.out.println(item.repr());

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

    public String repr ()  {
        return "Item (" + this.nimi + ", " + this.tuoteryhmä + ", " + this.määrä + ")";
    }
}
