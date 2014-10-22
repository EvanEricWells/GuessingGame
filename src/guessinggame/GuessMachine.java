package guessinggame;


public class GuessMachine {
    private int num;
    private int numguesses;
    private int guess;
    private String giveHint;
    private boolean setGuess;
            
    public GuessMachine(){
        num=(int)(Math.random()*100)+1;
        guess=0;
        numguesses=0;
    }
    
    public String giveHint(){
        if(guess == num){
            giveHint =("You got it!");
              
        } else if (guess > num) {
            giveHint= ("Guess lower");
           
        } else if (guess < num) {
            giveHint=("Guess higher");
            
        }
        return giveHint;
    }
    
    public boolean setGuess(int number){
        if (number <=100 || number >0){
            number=guess;
            return true;
        }
        else return false;
        
    }
    
    
    
    
    
    
    //to do - add methods
    //giveInt(), setGuess(), getNumGuesses()
}
