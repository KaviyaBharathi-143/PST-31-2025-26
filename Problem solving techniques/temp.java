import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cel;
        double fahren; 
        System.out.print("enter the temperature: ");
        cel = sc.nextInt();
        fahren = (cel * 1.8) + 32;
        System.out.println("the temperature is " + fahren);
        sc.close();
    }
}
