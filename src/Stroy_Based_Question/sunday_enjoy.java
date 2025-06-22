package Stroy_Based_Question;

import java.util.Scanner;
import java.util.HashMap;
public class sunday_enjoy{
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter starting days");
    String d = sc.nextLine();

    System.out.print("Enter the number of Days");
    int n = sc.nextInt();

    HashMap<String,Integer> map = new HashMap<>();

    map.put("mon",6);
    map.put("tue",5);
    map.put("wed",4);

    map.put("thu",3);

    map.put("fri",2);

    map.put("sat",1);
    map.put("sun",0);

    int count = 0;
    for(String str: map.keySet()){
        if(d.equals(str)){
            count++;
            n = n - map.get(d);
            if(n>0){
                count = 1+n/7;
            }
            else{
                count = 1;
            }
        }
    }
    System.out.print(count);
}
}



