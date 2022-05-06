import java.util.Scanner;

public class chatBot {

    public static void main(String[] args) {
askName();
guessAge();
countNumber();
programmingTest();
tellAStory();
daysWeek();
    }

    public static void askName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey there! What was your name again?");
        newName = scanner.nextLine();
        newName = newName.substring(0,1).toUpperCase() + newName.substring(1).toLowerCase();
        System.out.println("Okay, " + newName + "!, I have few questions for you");
    }
    public static void guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your Chinese zodiac sign?");
        zodiacSign = scanner.nextLine();
        zodiacSign = zodiacSign.substring(0, 1).toUpperCase() + zodiacSign.substring(1).toLowerCase();
        System.out.println(zodiacSign + " it is! Are you in your 30s? Answer yes or no:");
        zodiacSign2 = scanner.nextLine();
        System.out.println("Okay are you in your 20s? Answer yes or no:");
        String zodiacSign3 = scanner.nextLine();


        if (zodiacSign.equals("Rat") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 38!");
        } else if (zodiacSign.equals("Rat") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 26!");
        } else if (zodiacSign.equals("Ox") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 37!");
        } else if (zodiacSign.equals("Ox") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 25!");
        } else if (zodiacSign.equals("Tiger") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 36!");
        } else if (zodiacSign.equals("Tiger") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 24!");
        } else if (zodiacSign.equals("Rabbit") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 35!");
        } else if (zodiacSign.equals("Rabbit") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 23!");
        } else if (zodiacSign.equals("Dragon") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 34!");
        } else if (zodiacSign.equals("Dragon") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 22!");
        } else if (zodiacSign.equals("Snake") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 33!");
        } else if (zodiacSign.equals("Snake") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 21!");
        } else if (zodiacSign.equals("Horse") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 32!");
        } else if (zodiacSign.equals("Horse") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 20!");
        } else if (zodiacSign.equals("Goat") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 31!");
        } else if (zodiacSign.equals("Goat") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 19!");
        } else if (zodiacSign.equals("Monkey") && zodiacSign2.equals("yes")) {
            System.out.println("Okay, you are 30!");
        } else if (zodiacSign.equals("Monkey") && zodiacSign2.equals("no") && !zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 18!");
        } else if (zodiacSign.equals("Rooster") && zodiacSign3.equals("yes")) {
            System.out.println("Okay, you are 29!");
        } else if (zodiacSign.equals("Rooster") && zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 17!");
        } else if (zodiacSign.equals("Dog") && zodiacSign3.equals("yes")) {
            System.out.println("Okay, you are 28!");
        } else if (zodiacSign.equals("Dog") && zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 16!");
        } else if (zodiacSign.equals("Pig") && zodiacSign3.equals("yes")) {
            System.out.println("Okay, you are 27!");
        } else if (zodiacSign.equals("Pig") && zodiacSign3.equals("no")) {
            System.out.println("Okay, you are 15!");
        }

        if (zodiacSign2.equals("no") && zodiacSign3.equals("no")) {
            System.out.println("Okay pops, we will try again for you. \nIf you are in your 70s put 70, 60s put 60, 50s put 50, 40s put 40");
            int oldInput = scanner.nextInt();

            if (zodiacSign.equals("Rat") && oldInput == 70) {
                System.out.println("Congrats, you are 74");
            } else if (zodiacSign.equals("Rat") && oldInput == 60) {
                System.out.println("Congrats, you are 62");
            } else if (zodiacSign.equals("Rat") && oldInput == 50) {
                System.out.println("Congrats, you are 50");}

            if (zodiacSign.equals("Ox") && oldInput == 70) {
                System.out.println("Congrats, you are 73");
            } else if (zodiacSign.equals("Ox") && oldInput == 60) {
                System.out.println("Congrats, you are 61");
            } else if (zodiacSign.equals("Ox") && oldInput == 50) {
                System.out.println("Congrats, you are 49");}

            if (zodiacSign.equals("Tiger") && oldInput == 70) {
                System.out.println("Congrats, you are 72");
            } else if (zodiacSign.equals("Tiger") && oldInput == 60) {
                System.out.println("Congrats, you are 60");
            } else if (zodiacSign.equals("Tiger") && oldInput == 40) {
                System.out.println("Congrats, you are 48");}

            if (zodiacSign.equals("Rabbit") && oldInput == 70) {
                System.out.println("Congrats, you are 71");
            } else if (zodiacSign.equals("Rabbit") && oldInput == 50) {
                System.out.println("Congrats, you are 59");
            } else if (zodiacSign.equals("Rabbit") && oldInput == 40) {
                System.out.println("Congrats, you are 47"); }

            if (zodiacSign.equals("Dragon") && oldInput == 70) {
                System.out.println("Congrats, you are 70");
            } else if (zodiacSign.equals("Dragon") && oldInput == 50) {
                System.out.println("Congrats, you are 58");
            } else if (zodiacSign.equals("Dragon") && oldInput == 40) {
                System.out.println("Congrats, you are 46"); }

            if (zodiacSign.equals("Snake") && oldInput == 60) {
                System.out.println("Congrats, you are 69");
            } else if (zodiacSign.equals("Snake") && oldInput == 50) {
                System.out.println("Congrats, you are 57");
            } else if (zodiacSign.equals("Snake") && oldInput == 40) {
                System.out.println("Congrats, you are 45"); }

            if (zodiacSign.equals("Horse") && oldInput == 60) {
                System.out.println("Congrats, you are 68");
            } else if (zodiacSign.equals("Horse") && oldInput == 50) {
                System.out.println("Congrats, you are 56");
            } else if (zodiacSign.equals("Horse") && oldInput == 40) {
                System.out.println("Congrats, you are 44"); }

            if (zodiacSign.equals("Goat") && oldInput == 60) {
                System.out.println("Congrats, you are 67");
            } else if (zodiacSign.equals("Goat") && oldInput == 50) {
                System.out.println("Congrats, you are 55");
            } else if (zodiacSign.equals("Goat") && oldInput == 40) {
                System.out.println("Congrats, you are 43"); }

            if (zodiacSign.equals("Monkey") && oldInput == 60) {
                System.out.println("Congrats, you are 66");
            } else if (zodiacSign.equals("Monkey") && oldInput == 50) {
                System.out.println("Congrats, you are 54");
            } else if (zodiacSign.equals("Monkey") && oldInput == 40) {
                System.out.println("Congrats, you are 42"); }

            if (zodiacSign.equals("Rooster") && oldInput == 60) {
                System.out.println("Congrats, you are 65");
            } else if (zodiacSign.equals("Rooster") && oldInput == 50) {
                System.out.println("Congrats, you are 53");
            } else if (zodiacSign.equals("Rooster") && oldInput == 40) {
                System.out.println("Congrats, you are 41"); }

            if (zodiacSign.equals("Dog") && oldInput == 60) {
                System.out.println("Congrats, you are 65");
            } else if (zodiacSign.equals("Dog") && oldInput == 50) {
                System.out.println("Congrats, you are 53");
            } else if (zodiacSign.equals("Dog") && oldInput == 40) {
                System.out.println("Congrats, you are 40"); }

            if (zodiacSign.equals("Pig") && oldInput == 60) {
                System.out.println("Congrats, you are 64");
            } else if (zodiacSign.equals("Pig") && oldInput == 50) {
                System.out.println("Congrats, you are 52");
            } else if (zodiacSign.equals("Pig") && oldInput == 40) {
                System.out.println("Congrats, you are 39"); }

        }

    }
    public static void countNumber() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Okay, now I will count to any number you want so give me a number:");
        number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            System.out.println(i);
        }
    }
    public static void programmingTest () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay, let's test your programming knowledge with a question.");
        System.out.println("What is Java?\na)Coffee brand\nb)Advertising company\nc)Programming language\nd)Sister of Javascript");
        System.out.println("Enter your answer such as: a, b, c or d");
        while (true) {
            theAnswer = scanner.nextLine();
            if (theAnswer.equals("c")) {
                System.out.println("Correct!");
                break;
            } else
                System.out.println("Wrong answer try again");
        }
    }
    static String newName;
    static int number;
    static String theAnswer;
    static String zodiacSign;
    static String zodiacSign2;
    public static void tellAStory(){
        System.out.println("Okay! So your name is: " + newName + " and you answered the programming question as " + theAnswer + "\nso it looks like you are a programming geek!\nI am also guessing your favorite number is " + number);
        System.out.println("I can tell your zodiac sign being " + zodiacSign + " you are hell of a fighter!");
        if(zodiacSign2.equals("yes")){
            System.out.println("I can also say that you have wisdom, but does not mean you are not young!");
        } else if(zodiacSign2.equals("no")){
            System.out.println("You are still young but you do have joy!");
        }
    }
    public static void daysWeek () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay! So tell me your favorite day:");
        String favDay = scanner.nextLine();
        favDay = favDay.substring(0,1).toUpperCase() + favDay.substring(1).toLowerCase();
        switch (favDay) {
            case "Monday" -> System.out.println("I hate Mondays!");
            case "Tuesday" -> System.out.println("Tuesday are just a bit better than Mondays");
            case "Wednesday" -> System.out.println("It is already mid week!");
            case "Thursday" -> System.out.println("Thursday means we're getting closer to Fridays so\nI love it!");
            case "Friday" -> System.out.println("Favorite day of the week, even better than weekends");
            case "Saturday" ->
                    System.out.println("This is just bit worse than Saturday, since it is already weekend day 1");
            case "Sunday" ->
                    System.out.println("This is the slightly worse day than Saturday, since it is almost Monday!");
            default -> System.out.println("You just need to spell the day right!");
        }
    }
}