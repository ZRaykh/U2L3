public class ChatBot {
    public void greeting() {
        System.out.println("Hello, I am a chat bot!");
        System.out.println("What would you like to do? For information enter: help");
    }

    public void help() {
        System.out.println("You can ask me about the weather: weather");
        System.out.println("You can tell me your favorite number: favorite number");
        System.out.println("I can even convert feet to meters!: feet to meters");
        System.out.println("To end program, type: end");
    }

    public void weather() {
        System.out.println("I actually don't know much about the weather");
        System.out.println("But it is always warm and dry inside this computer.");
    }

    public void distanceInfo() {
        System.out.println("There are 5280 feet in a mile");
        System.out.println("There are " + feetToMeters(1) + "meters in a foot");
        System.out.println("There are " + feetToMeters(5280) + " meters in a mile");
    }

    public double feetToMeters(double feet) {
        double meters = feet * 0.3048;
        return meters;
    }

    public void goodbye() {
        System.out.println("It was nice talking with you.");
        System.out.println("Have a great day!");
    }

    public void favoriteNumber(int yourNumber) {
        System.out.println("My favorite number is 8");
        System.out.print("That is ");
        System.out.print(yourNumber - 8);
        System.out.println(" away from your number.");
    }
}