public class Member {

    int[][] memberMap = new int[500][280];
    int numberMember = 4;

    public Member() {
        memberPlacement();
        memberMovement();
    }

    public void memberPlacement() {
        for(int i = 0; i <= numberMember; i++) {

            double xTemp = Math.random() * 500;
            int x = (int)xTemp;
            double yTemp = Math.random() * 280;
            int y = (int)yTemp;

            if(Map.testMemberPlacement(x, y)) {
                memberMap[x][y] = 1;
            } else {
                i--;
            }
            if(i < 0) {
                i = 0;
            }
        }
    }

    public void memberMovement() {
        int[][] newMemberMap = new int[500][280];
        for(int i = 0; i < memberMap.length; i++) {
            for(int j = 0; j < memberMap[0].length; j++) {
                if(memberMap[i][j] == 1) {
                    double directionTemp = Math.random() * 3;
                    int direction = (int)directionTemp;
                    if(direction == 0) {
                        newMemberMap[i][j++] = 1;
                    } if(direction == 1) {
                        newMemberMap[i++][j] = 1;
                    } if(direction == 2) {
                        newMemberMap[i][j--] = 1;
                    } if(direction == 3) {
                        newMemberMap[i--][j] = 1;
                    }
                    newMemberMap[i][j] = 0;
                }
            }
        }
        memberMap = newMemberMap.clone();
    }
}
