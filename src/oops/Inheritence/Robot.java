package oops.Inheritence;

public class Robot {
	private String name;
	private char direction;
	private int xloc, yloc;

	public Robot(String name, char direction, int x, int y) {
		this.name = name;
		this.direction = direction;
		this.xloc = x;
		this.yloc = y;
	}

	public String toString() {
		return name + " is standing at (" + xloc + "," + yloc + ") and facing" + direction;
	}

	public void turnClockwise() {
		if (direction == 'N') {
			direction = 'E';
		} else if (direction == 'E') {
			direction = 'S';
		} else if (direction == 'S') {
			direction = 'W';
		} else {
			direction = 'N';
		}
	}

	public void turnCounterClockwise() {
	}

	public void takeSteps(int numSteps) {
		if (direction == 'N') {
			yloc += numSteps;
		} else if (direction == 'E') {
			xloc += numSteps;
		} else if (direction == 'S') {
			yloc -= numSteps;
		} else {
			xloc -= numSteps;
		}
	}

	public static void main(String[] args) {
		Robot robby = new Robot("Robby", 'N', 10, 12);
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				robby.turnClockwise();
			} else {
				robby.turnCounterClockwise();
			}
			robby.takeSteps(3);
			System.out.println(robby);
		}
	}
}
