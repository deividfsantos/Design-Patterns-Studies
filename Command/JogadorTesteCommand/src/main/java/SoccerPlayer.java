public class SoccerPlayer {

    public String name;
    public double height;
    public double weight;

    public SoccerPlayer(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void kick(){
        System.out.println("Kick the ball");
    }

    public void pass(){
        System.out.println("Pass the ball");
    }

    public void cross(){
        System.out.println("Cross the ball");
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
