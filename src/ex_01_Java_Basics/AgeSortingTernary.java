package ex_01_Java_Basics;

public class AgeSortingTernary
{
    public static void main(String[] args) {
        int age=18;

        String category= (age<18) ? "Minor":
                (age>65) ? "Senior" : "Adult";

        System.out.println(category);

    }
}
