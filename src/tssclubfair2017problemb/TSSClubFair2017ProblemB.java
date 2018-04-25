/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssclubfair2017problemb;

import java.util.Scanner;

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
        Scanner sc=new Scanner(System.in);
        String line = sc.nextLine();
        String[] pair=line.split(" ");
        int n=Integer.parseInt(pair[0]);
        int q=Integer.parseInt(pair[1]);

        distances=new long[n];
        for (int i=0;i<n;i++) {
            line=sc.nextLine();
            pair=line.split(" ");
            long x=Long.parseLong(pair[0]);
            long y=Long.parseLong(pair[1]);
            distances[i]=x*x+y*y;
        }
        for (int i=0;i<q;i++) {
            line=sc.nextLine();
            long impactDistance=Long.parseLong(line);
            impactDistance*=impactDistance;
            int count=0;
            for (int j=0;j<n;j++) {
                if (distances[j]<=impactDistance)
                    count++;
            }
            System.out.println(count);
        }
        
    }
}
