public class UI_console{

    public UI_console(){
        printWelcome();
        
    }

    public void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
    }

    public void printCurrent(/*Room room*/){
        
    }

    public void printWhere(){System.out.println("Go where?");}

    public void printNoDoor(){System.out.println("There is no door!");}

    public void printInvalid(){System.out.println("I don't know what you mean...");}

    public void printQuit(boolean bool){
        if(bool==true){
            System.out.println("Quit what?");
        }else{
            System.out.println("Thank you for playing.  Good bye.");
        }
    }

    public void printHelp()
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println("   go quit help");
    }

    

}