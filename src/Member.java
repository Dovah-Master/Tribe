public class Member {
    int[][] memberMap = new int[500][280];
    int numberMember = 3;
    public Member() {
        memberPlacement();
    }
    public void memberPlacement() {
        for(int i = 0; i < numberMember; i++) {

            double xTemp = Math.random() * 500;
            int x = (int)xTemp;
            double yTemp = Math.random() * 280;
            int y = (int)yTemp;

            if(Map.testMemberPlacement(x, y)) {
                memberMap[x][y] = 1;
            } if(i <= 0) {
                i = 0;
            } else {
                i--;
            }
        }
    }
}
