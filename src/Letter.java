public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */
    private String writer;
    public Letter(String writer){
        this.writer = writer;
    }
    public void writeLetter(String addressed)
    {
        greeting(addressed);
        specialMessage();
        closing(writer);
    }

    public void greeting(String name)
    {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing(String writer)
    {
        System.out.println("From " + writer);
    }
}
