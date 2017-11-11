public class Main {

    public static void main(String[] args) {

        Handler fourStar = new SacrificeLess4StarHandler(null);
        Handler sixStars = new Sacrifice5to6StarHandler(fourStar);
        Handler eightStars = new SacrificeGreater6StarHandler(sixStars);

        Card card = new Card("Dark Magician", "Monster", 7);

        eightStars.handleRequest(card);

    }

}
