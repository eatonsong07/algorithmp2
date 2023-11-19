public class Main {
    public static void main(String[]args){
        Algorithm eaton= new Algorithm();

        System.out.println(eaton.contains("123money", "money"));
        System.out.println(eaton.contains("pizza", "chiptole"));

        System.out.println(eaton.reverse("pizzza"));
        System.out.println(eaton.reverse("chitpole"));

        System.out.println(eaton.palindrome("racecar"));
        System.out.println(eaton.palindrome("money"));

        System.out.println(eaton.occurence("pizza", "zz"));
        System.out.println(eaton.occurence("chiptole", "z"));
    }
}
