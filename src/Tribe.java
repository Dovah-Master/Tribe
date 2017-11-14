import javax.swing.*;

public class Tribe extends JFrame {
    private Window window = new Window();

    private Tribe() {
        this.add(this.window);
        this.setTitle("Tribe");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500 * 2 + 10, 280 * 2 + 30); // map width or height * squareSize. additional spaced needed, why?
        this.setLocationRelativeTo(null);
        this.setUndecorated(false);
        this.setVisible(true);
        this.setResizable(true);
    }

    public static void main(String[] args) {
        new Tribe();
    }
}