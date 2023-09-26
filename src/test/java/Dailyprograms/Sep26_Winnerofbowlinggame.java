package Dailyprograms;

import org.junit.Test;

public class Sep26_Winnerofbowlinggame {
/*
https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/

You are given two 0-indexed integer arrays player1 and player2, that represent the number of pins that player 1 and player 2 hit in a bowling game, respectively.

The bowling game consists of n turns, and the number of pins in each turn is exactly 10.

Assume a player hit xi pins in the ith turn. The value of the ith turn for the player is:

2xi if the player hit 10 pins in any of the previous two turns.
Otherwise, It is xi.
The score of the player is the sum of the values of their n turns.

Return

1 if the score of player 1 is more than the score of player 2,
2 if the score of player 2 is more than the score of player 1, and
0 in case of a draw.
 */

    /*
    Pseudcode:
    declare two arrays to store each player score
    iterate over the array till player 1 array length
    if i greater than 2 then assign the max value of player 1 score, 2 *player1index + player1scoreindex-2
    and assign the max value of player 2 score, 2 *player2index + player2scoreindex
     otherwise player1score of index as 2 * player1index
                player2score of index as 2* player2index
     if i is greater than 1 then   assign the max value of player 1 score, player1index + player1scoreindex-1
        and assign the max value of player 2 score, 2 *player2index + player2scoreindex-1
     other wise player1scoreof index is assign the max value of player1scoreof index and player 1 index
     player2score of index as assign max value of player2score of index vs player2index

     Assign the player1total score as player1score[n-1]
     Assign the player2total score as player2score[n-1]
     compare the player1total vs player2total
     return 1 if player1 total is high
     else return 2 if player 2 total is high
     else return 0 if both are same.


     */
    @Test
    public void test1(){
        int i = bowlingGameWinner(new int[]{4, 10, 7, 9}, new int[]{6, 5, 2, 3});
        System.out.println(i);
    }
    public int bowlingGameWinner(int[] player1, int[] player2) {
        int n = player1.length;
        int[] player1Score = new int[n];
        int[] player2Score = new int[n];

        for (int i = 0; i < n; i++) {
            if (i >= 2) {
                player1Score[i] = Math.max(player1Score[i], 2 * player1[i] + player1Score[i - 2]);
                player2Score[i] = Math.max(player2Score[i], 2 * player2[i] + player2Score[i - 2]);
            } else {
                player1Score[i] = 2 * player1[i];
                player2Score[i] = 2 * player2[i];
            }

            if (i >= 1) {
                player1Score[i] = Math.max(player1Score[i], player1[i] + player1Score[i - 1]);
                player2Score[i] = Math.max(player2Score[i], player2[i] + player2Score[i - 1]);
            } else {
                player1Score[i] = Math.max(player1Score[i], player1[i]);
                player2Score[i] = Math.max(player2Score[i], player2[i]);
            }
        }

        int player1TotalScore = player1Score[n - 1];
        int player2TotalScore = player2Score[n - 1];

        if (player1TotalScore > player2TotalScore) {
            return 1;
        } else if (player2TotalScore > player1TotalScore) {
            return 2;
        } else {
            return 0;
        }
    }
}
