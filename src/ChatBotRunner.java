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

        if (input == "i")
        {
            bot.help();
        }

        if (input == "w")
        {
            bot.weather();
        }

        if (input == "n" ){
            System.out.print("Enter your favorite number");
            int number = s.nextInt();
            bot.favoriteNumber(number);
        }
    }
}