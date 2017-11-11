public class SacrificeGreater6StarHandler extends Handler {

    public SacrificeGreater6StarHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Card card) {
        if(card.getStars()>6){
            System.out.println("The card "+ card.getName()+" needs 2 sacrifices");
        }
        dispatchToNext(card);
    }
}
