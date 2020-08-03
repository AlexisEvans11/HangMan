
public class Hello {

  public static void main() {

    String word;
    char letter;
    int tries = 7;
//HangMan
    
///Pick a word
    System.out.println("Pick a word"); 
    word = Zystem.ReadWord();
    int totalLength = word.length();

//Draw dashes
    int length = 0;
    while (length < totalLength) { 
    System.out.print("_");
    length = length + 1;
}
    length = 0;
    String soFar = "";
    while (length < totalLength) { 
        soFar+= "_" ;
        length = length + 1;
    }
    System.out.println(soFar);
    
//Guess a letter
    boolean won = false;
    boolean found = false;
while (tries > 0 && won == false){
    char[] chars = soFar.toCharArray();

    System.out.println("  ");
    System.out.println("Guess a letter");
    letter = Zystem.ReadLetter();
    found = false;
    int check = 0;
  
        while (check <= (length-1)) {
        if (letter == word.charAt(check)) {
            System.out.println("This letter " + letter + " is a match for position " + check);
            found = true;
            //change dash in string "soFar" to letter
            //that location is the carriable check variable
           chars[check] = letter;
        }   
        check ++;
    }
    soFar = String.valueOf(chars);
    System.out.println(soFar);
    
    //Check for dashes to see if game is won
    
    if (found == false) {
        tries = tries - 1;
        System.out.println("Wrong guess, try again");
        System.out. println("You have " +tries+ " remaining.");
    }
   // boolean foundUnderscore
   //int I = 0;
   //while(I < chars.length){
   //if(chars[I] == "_") foundUnderscore = true;
   //I++
    int p = 0;
    int count = 0;
    while(p < totalLength){
        if (chars [p] == '_'){
        count = count + 1;
       }
       p = p + 1;
    }
    if(count == 0) {
        System.out.println("You won!");
        won = true;
    }
    if(tries == 0) {
        System.out.println("You lost, better luck next time");
    }
//Read in guess from user

//Check for matches

//If the letter is wrong, draw a body part
//If the letter is correct, replace the dashes with the letter
// the person is hanged, game over. (out of tries).
//OR no dashes are left, game won. 


  // ~main 
// ~Hello 
}
}
}