public class PassPlayerCommand implements PlayerCommand {

    private SoccerPlayer soccerPlayer;

    public PassPlayerCommand(SoccerPlayer soccerPlayer) {
        this.soccerPlayer = soccerPlayer;
    }

    @Override
    public void execute() {
        soccerPlayer.pass();
    }
}
