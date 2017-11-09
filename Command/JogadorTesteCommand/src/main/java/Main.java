public class Main {

    public static void main(String[] args) {

        SoccerPlayer soccerPlayer = new SoccerPlayer("Deivid", 1.7, 70);

        KickPlayerCommand kickCommand = new KickPlayerCommand(soccerPlayer);
        PassPlayerCommand passCommand = new PassPlayerCommand(soccerPlayer);
        CrossPlayerCommand crossCommand = new CrossPlayerCommand(soccerPlayer);

        Broker broker = new Broker();
        broker.takePlayer(kickCommand);
        broker.takePlayer(passCommand);
        broker.takePlayer(crossCommand);

        broker.placePlayers();

    }

}
