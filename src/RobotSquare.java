import org.jointheleague.graphical.robot.Robot;
public class RobotSquare {
    public static void main(String[] args) throws Exception {
Robot r = new Robot();
r.penDown();
r.setSpeed(10);
for (int i = 0; i < 4; i++) {
r.move(100);
r.turn(90);
    }
}
}