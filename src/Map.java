import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {
    static int[][] fieldMap;
    int mapWidth = 500;
    int mapHeight = 280;

    public void fieldMapData(int w, int h) {
        this.fieldMap = new int[w][h];
    }

    public void getMapField() {
        Scanner fileScanner;
        fieldMapData(mapWidth, mapHeight);

        try {
            fileScanner = new Scanner(new File("H:\\CS Projects\\WorldMap500x280.txt"));
        } catch (FileNotFoundException var6) {
            var6.printStackTrace();
            return;
        }

        // fieldMap[500][140]
       for (int j = 0; fileScanner.hasNextLine(); j++) {
            String a = fileScanner.nextLine();
            for(int i = 0; i < mapWidth; i++) {
                char c;
                // how do try catches work? learn tomorrow
                try {
                   c=  a.charAt(i);
                } catch (Exception e){
                    c = '.';
                }

                fieldMap[i][j] = ( c == '0')? 5 : 1;
            }
        }
    }
    public static boolean testMemberPlacement(int x, int y) {
        return fieldMap[x][y] == 5;
    }
}