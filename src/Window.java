import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Window extends JPanel {
    private Timer _timer;
    Map field; // a 2d array that can hold
    Member member;
    int squareSize = 2;
    Color LAND = new Color(20, 130, 40);

    public Window() {
        this.field = new Map();
        this.field.getMapField();
        this.member = new Member();
        this.member.memberPlacement();

        this._timer = new Timer(300, (e) -> {
            this.paintInterval();
        });
        this._timer.start();
    }

    private void paintInterval() {
        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        this.drawMap(g2d);
        this.drawMember(g2d);
    }

    // fieldMap[500][140]
    public void drawMap(Graphics g2d) {
        for(int i = 0; i < field.fieldMap.length; i++) { // i is 500, field.fieldMap.length = 500
            for(int j = 0; j < field.fieldMap[0].length; j++) { // j is 140, field.fieldMap[0].length = 140
                // MUST stay [i][j] otherwise graphics rotates the map
                if(field.fieldMap[i][j] == 5) {
                    g2d.setColor(LAND);
                    g2d.fillRect(i * squareSize, j * squareSize, squareSize, squareSize);
                } if(field.fieldMap[i][j] == 1) {
                    g2d.setColor(Color.BLUE);
                    g2d.fillRect(i * squareSize, j * squareSize, squareSize, squareSize);
                } else {
                    // i don't know why this repaints the land to yellow but it's not a problem yet so I'll ignore it
                    g2d.setColor(Color.YELLOW);
                    //g2d.fillRect(i * squareSize, j * squareSize, squareSize, squareSize);
                }
            }
        }
    }
    public void drawMember(Graphics g2d) {
        for(int i = 0; i < field.fieldMap.length; i++) { // i is 500, all maps will be 500x280
            for (int j = 0; j < field.fieldMap[0].length; j++) { // j is 140
                if(member.memberMap[i][j] == 1) {
                    g2d.setColor(Color.RED);
                    g2d.fillRect(i * squareSize, j * squareSize, squareSize, squareSize);
                }
            }
        }
    }
}