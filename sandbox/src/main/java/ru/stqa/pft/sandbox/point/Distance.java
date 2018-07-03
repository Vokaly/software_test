package ru.stqa.pft.sandbox.point;

public class Distance {
   public static void main(String[] args) {
       Point p1 = new Point (3,5);
       Point p2 = new Point (13, 4);
       System.out.println(distance(p1,p2));
       System.out.println(p2.sayDistanceTo(p1));
   }

   public static double distance(Point p1, Point p2){
       double dist = Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
       return dist;

   }
}
//q
