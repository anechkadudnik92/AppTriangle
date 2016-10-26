package com.company.Triangle;
import java.util.*;

public class AppTriangle {
    static String name;
    static int[] side;
    static boolean toContinue=false;
    static HashMap<String, Double> triangles= new HashMap<>();

    public static void main(String[] args) {
        addTriangle();
    }

    public static void inputTriangle() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        Scanner in = new Scanner(System.in);
        side = new int[3];
        for (int i = 0; i < side.length; i++) {
            side[i] = in.nextInt();
        }
    }

    public static void addTriangle(){
        inputTriangle();
        Triangle triangle = new Triangle(name, side[0], side[1], side[2]);
        if (triangle.isValid()) {
            triangles.put(triangle.getName(),triangle.getSquare());
        } else
            System.out.println(triangle.getName()+" is not triangle");
        toContinue();
    }

    public static void printSortedList(){
        Set<Map.Entry<String, Double>> set = triangles.entrySet();
        List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Double>>()
        {
            public int compare( Map.Entry<String, Double> o1, Map.Entry<String, Double> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        System.out.println("-Triangle-");
        for(Map.Entry<String, Double> entry:list){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void toContinue(){
        System.out.println("Do you want to continue?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.toLowerCase().equals("y")||answer.toLowerCase().equals("yes"))
           addTriangle();
        else printSortedList();
    }
}
