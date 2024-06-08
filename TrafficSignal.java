import java.util.Timer;
import java.util.TimerTask;

public class TrafficSignal {
    private String color;

    public TrafficSignal() {
        this.color = "Red";
    }

    public void changeColor() {
        if (color.equals("Red")) {
            color = "Green";
        } else if (color.equals("Green")) {
            color = "Yellow";
        } else if (color.equals("Yellow")) {
            color = "Red";
        }
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                trafficSignal.changeColor();
                System.out.println("Traffic Signal: " + trafficSignal.getColor());
            }
        }, 0, 5000); // Change color every 5 seconds
    }
}
