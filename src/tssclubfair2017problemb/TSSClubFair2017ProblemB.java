/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssclubfair2017problemb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author zhuan
 */
public class TSSClubFair2017ProblemB {

    /**
     * @param args the command line arguments
     */
    static long[] distances;

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] nq = reader.readLine().split(" ");
            int n = Integer.parseInt(nq[0]);
            int q = Integer.parseInt(nq[1]);
            
            
            distances = new long[n];
            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                String[] coord = line.split(" ");
                Long x = Long.parseLong(coord[0]);
                Long y = Long.parseLong(coord[1]);
                distances[i] = x * x + y * y;
            }
            Arrays.sort(distances);
            for (int i = 0; i < q; i++) {
                Long impactDistance = Long.parseLong(reader.readLine());
                impactDistance *= impactDistance;
                int count = 0;
                count=Arrays.binarySearch(distances, impactDistance);
                if (count>=0) {
                    count++;
                } else {
                    count= -(count+1);
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
}
