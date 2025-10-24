import java.util.Random;
public class Edwinjames {
    private String name;
    private int aiLevel;
    // Cameras: Bedroom (0), Living Room (1), Dining Room (2), Kitchen (3), Basement (4)
    private int camera;
    public Edwinjames() {
        this.name = "Edwinjames";
        this.aiLevel = (int) (Math.random() * 20) + 1;
        this.camera = 4;
    }

}
