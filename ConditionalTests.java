import java.util.Scanner;

/**
 *
 *
 *
 */

public class ConditionalTests {
    public static void main(String[] args) {
        //if, if - else, if - else-if- else, Nested ifs

        //Instantiate Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Please fill in the details below: ");
        System.out.println("How old are you? ");

        int age = scan.nextInt();

        do{
            //if
            if ( age >= 20 ){
                System.out.println("Good! You are eligible for the spot");

            }
            else{
                System.out.println("Unfortunately, we can't be able to take you in.");
                break;
            }

            System.out.println("We are looking for two slots. Fill in \"Java\" or \"Python\" for slot applying to: ");

            String whichLanguageGuy = scan.next();

            //switch case

//            switch (whichLanguageGuy){
//                case "Java":
//                    System.out.println("You would be good for our program as we use spring boot. We will be in contact");
//                    break;
//
//                case "Python":
//                    System.out.println("You'd be good in Machine Learning a lot my friend! \nUnfortunately, we don't offer that here!");
//                    break;
//
//                default:
//                    System.out.println("Please type correctly.");
//
//            }

            // if, else-if, else
            if (whichLanguageGuy.equals("Java")){
                System.out.println("You would be good for our program as we use spring boot. We will be in contact");
                break;
            }
            else if (whichLanguageGuy.equals("Python")) {
                System.out.println("You'd be good in Machine Learning a lot my friend! \nUnfortunately, we don't offer that here!");
                break;
            }
            else if (!whichLanguageGuy.equals("Java") && !whichLanguageGuy.equals("Python")){
                System.out.println("Please type correctly.");


            }
        }
        while (age >= 20);
    }
}
