
public class Sacrifice5to6StarHandler extends Handler {

    public Sacrifice5to6StarHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Card card) {

        if(card.getStars()>4&& card.getStars()<=6){
            System.out.println("The card "+ card.getName()+" needs one sacrifice");
        }
        dispatchToNext(card);
    }

}
