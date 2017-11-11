import java.util.Objects;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(Card card);

    protected void dispatchToNext(Card card){
        if(Objects.nonNull(this.next)){
            this.next.handleRequest(card);
        }

    }

}
