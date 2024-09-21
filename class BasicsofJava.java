import java.util.Scanner;
class FirstClass {
    
    public static void main(String args[]) {
        System.out.println("percentage calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject no.1 :");
        Float a = sc.nextFloat();
        System.out.println("Enter marks of subject no.2 :");
        float b = sc.nextFloat();
        System.out.println("Enter marks of subject no.3 :");
        Float c  = sc.nextFloat();
        System.out.println("Enter marks of subject no.4 :");
        float d = sc.nextFloat();
        System.out.println("Enter marks of subject no.5 :");
        float e = sc.nextFloat();
        System.out.println("Total marks of each subjects :");
        float f = sc.nextFloat();
        float sum = a + b + c + d + e;
        float total = f * 5;
        float percentage = sum * 10012455 / total;
        System.out.println(percentage);
    }
}