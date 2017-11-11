public class Main {

    public static void main(String[] args) {

        SoccerPlayer soccerPlayer = new SoccerPlayer("Deivid", 1.7, 70);

        PlayerCommand kickCommand = new KickPlayerCommand(soccerPlayer);
        PlayerCommand passCommand = new PassPlayerCommand(soccerPlayer);
        PlayerCommand crossCommand = new CrossPlayerCommand(soccerPlayer);

        Broker broker = new Broker();
        broker.takePlayer(kickCommand);
        broker.takePlayer(passCommand);
        broker.takePlayer(crossCommand);

        broker.takePlayer(crossCommand);


        broker.placePlayers();

    }

}
