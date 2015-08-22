public abstract class AI {
    
    // An AI should make int variables mySnake and other
    // Before compiling, if you are player 1, make mySnake = 1 and other = 2
    // Before compiling, if you are player 2, make mySnake = 2 and other = 1
    // to get the arraylist of your own snake, use Game.board.getSnake(mySnake)
    // to get the arraylist of your opponent's snake, use Game.board.getSnake(other)
    // to get length of board, use Game.board.getLength()
    // to get height of board, use Game.board.getHeight()
    // to get Point of food, use Game.board.getFood()
    
    // returns your bot's name
    abstract String getName();
    
    // returns one of the following uppercase letters: U, D, L, R
    abstract char getDirection();
}