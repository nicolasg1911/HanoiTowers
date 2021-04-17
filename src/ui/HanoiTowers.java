package ui;

import java.util.Scanner;


public class HanoiTowers{

    public static int [] towers = new int [3];
    public static Scanner sc = new Scanner(System.in);
    public static int x =0;
    public static void torresHanoi(int n,int o,int d,int aux){


    if(n>0){
    	
            torresHanoi(n-1,o,aux,d);
            towers[o-1]--;
            towers[d-1]++;
            System.out.println(towers[0]+ " " + towers[1] + " "+towers[2]);
            torresHanoi(n-1,aux,d,o);
        }
    }
    public static void main(String[] args){
    	x=sc.nextInt();
    	sc.nextLine();
    	int counter=0;
    	while(x-counter!=0) {
        int n;
        n=sc.nextInt();
        sc.nextLine();
        towers[0]=n;
        System.out.println(n+" 0 0");
        torresHanoi(n,1,3,2);
        System.out.println(" ");
        counter++;
    	}
        
    }
}