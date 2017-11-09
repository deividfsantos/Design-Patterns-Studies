public class CrossPlayerCommand implements PlayerCommand {

    private SoccerPlayer soccerPlayer;

    public CrossPlayerCommand(SoccerPlayer soccerPlayer) {
        this.soccerPlayer = soccerPlayer;
    }

    @Override
    public void execute() {
        soccerPlayer.cross();
    }
}
