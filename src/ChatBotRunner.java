import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //command list

        //starting  chat bot
        ChatBot bot = new ChatBot();

        //greeting
        bot.greeting();

        String input = s.nextLine();

        //help message
        if (input .equals("help"))
        {
            bot.help();
            input = s.nextLine();
        }

        //says weather
        if (input.equals("weather"))
        {
            bot.weather();
            input = s.nextLine();
        }

        //allows you to say favorite number
        if (input.equals("favorite number")){
            System.out.print("Enter your favorite number");
            int number = s.nextInt();
            bot.favoriteNumber(number);
            input = s.nextLine();
        }

        //converts feet to meters
        if (input.equals("feet to meters"))
        {
            System.out.print("Enter the feet to convert:");
            double feet = s.nextDouble();
            bot.feetToMeters(feet);
            bot.distanceInfo();
            input = s.nextLine();
        }

        //goodbye message
        if (input.equals("end"))
        {
            bot.goodbye();
        }
    }
}