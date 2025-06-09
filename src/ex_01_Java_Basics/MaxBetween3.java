package ex_01_Java_Basics;

public class MaxBetween3 {
    public static void main(String[] args) {
        int n1=291, n2=1270, n3=210;

        int max= ((n1>n2)? n1: n2)>n3 ? ((n1>n2)? n1: n2) : n3;

        System.out.println("Max number is "+ max);

    }
}
