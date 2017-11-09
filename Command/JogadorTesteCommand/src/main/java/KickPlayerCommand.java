public class KickPlayerCommand implements PlayerCommand {

    private SoccerPlayer soccerPlayer;

    public KickPlayerCommand(SoccerPlayer soccerPlayer) {
        this.soccerPlayer = soccerPlayer;
    }

    @Override
    public void execute() {
        soccerPlayer.kick();
    }
}
