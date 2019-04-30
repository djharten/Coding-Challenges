// Leetcode Problem, "Robot Return To Origin" : https://leetcode.com/problems/robot-return-to-origin/description/


// Places the robot at (0,0) and moves it on the Y axis for up and down, and the X axis
// for left and right. Returns whether or not the robot is back at (0,0) at the end.
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < moves.length(); i++) {
            char letter = moves.charAt(i);
            if(letter == 'U'){
                y++;
            } else if(letter == 'D'){
                y--;
            } else if(letter == 'R'){
                x++;
            } else {
                x--;
            }
        }
        return(x == 0 && y == 0);
    }
}
