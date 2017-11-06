import java.awt.Component;
import java.io.FileNotFoundException;
import javax.swing.JFrame;

public class Tribe extends JFrame {
    private Window window = new Window();

    private Tribe() {
        this.add(this.window);
        this.setTitle("Tribe");
        this.setDefaultCloseOperation(3);
        this.setSize(500 * 2 + 10, 280 * 2 + 30); // map width or height * squareSize. additional spaced needed, why?
        this.setLocationRelativeTo((Component)null);
        this.setUndecorated(false);
        this.setVisible(true);
        this.setResizable(true);
    }

    public static void main(String[] args) {
        new Tribe();
    }
}