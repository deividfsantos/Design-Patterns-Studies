public class SacrificeLess4StarHandler extends Handler {

    public SacrificeLess4StarHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Card card) {

        if(card.getStars()<=4){
            System.out.println("The card "+ card.getName()+" needs no sacrifice");
        }
        dispatchToNext(card);
    }

}
