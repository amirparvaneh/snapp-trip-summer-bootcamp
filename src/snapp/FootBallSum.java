package snapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootBallSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = 0, b = 0, c = 0, d = 0;
        String perspolis = "perspolis";
        String esteghlal = "esteghlal";
        String penalty = "penalty";
        int es_total_goal, ps_total_goal;
        List<String> results = new ArrayList<>();
        int[][] goals = new int[t][4];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 4; j++) {
                goals[i][j] = scanner.nextInt();
                if (j == 0) {
                    a = goals[i][j];
                }
                if (j == 1) {
                    b = goals[i][j];
                }
                if (j == 2) {
                    c = goals[i][j];
                } else
                    d = goals[i][j];
            }
            ps_total_goal = (a + c);
            es_total_goal = (b + d);
            if (es_total_goal > ps_total_goal) {
                results.add(esteghlal);
            } else if (ps_total_goal > es_total_goal) {
                results.add(perspolis);
            } else {
                ps_total_goal = (a + c * 2);
                es_total_goal = (b * 2 + d);
                if (ps_total_goal > es_total_goal) {
                    results.add(perspolis);
                } else if (es_total_goal > ps_total_goal) {
                    results.add(esteghlal);
                } else
                    results.add(penalty);
            }
        }
        for (String res : results) {
            System.out.println(res);
        }
    }
}
