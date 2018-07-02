/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssclubfair2017problemb;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author zhuan
 */
public class TSSClubFair2017ProblemB {

    /**
     * @param args the command line arguments
     */
    static Double[] distances;

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] nq = reader.readLine().split(" ");
            int n = Integer.parseInt(nq[0]);
            int q = Integer.parseInt(nq[1]);
            
            distances = new Double[n];
            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                String[] coord = line.split(" ");
                double x = Double.parseDouble(coord[0]);
                double y = Double.parseDouble(coord[1]);
                distances[i] = x * x + y * y;
            }
            for (int i = 0; i < q; i++) {
                Double impactDistance = Double.parseDouble(reader.readLine());
                impactDistance *= impactDistance;
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (distances[j] <= impactDistance) {
                        count++;
                    }
                }                
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
}
