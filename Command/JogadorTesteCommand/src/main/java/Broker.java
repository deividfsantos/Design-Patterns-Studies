import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<PlayerCommand> playerList = new ArrayList<>();

    public void takePlayer(PlayerCommand playerCommand){
        playerList.add(playerCommand);
    }

    public void placePlayers(){
        for (PlayerCommand p: playerList) {
            p.execute();
        }
        playerList.clear();
    }

}
