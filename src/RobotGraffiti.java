import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
public static void main(String[] args) {
	Robot r = new Robot();
	r.penDown();
	r.setSpeed(8);
	r.setAngle(20);
	r.move(150);
	r.setAngle(160);
	r.move(75);
	r.setAngle(-90);
	r.move(50);
	r.setAngle(90);
	r.move(50);
	r.setAngle(160);
	r.move(75);
}
}
