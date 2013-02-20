public class Board 
{
	private Space[][] board;
  public Space blank;
  public Dead destroyed = new Dead("Ship");
  public Dead epicFail = new Dead("Dud");
  private Space[] shipTracker;
  private int player;
  private int lenX;
  private int lenY;

	public Board(int width, int height, int boatSpaces, int numOfBoats, int player)
	{

    // Here we are defining the array that 
    // forms the basis of the board
		board = new Space[width][height];
    lenX = width;
    lenY = height;
    blank = new Space((width*height)-boatSpaces);
    shipTracker = new Ship[numOfBoats];
    // This for loop initiates every
    // item in the array to false
    // so we don't have any issues with
    // methods accessing empty array slots
		for (int i = 0; i < width; i++)
		{
			for (int j = 0; j < height; j++)
			{
				board[i][j] = blank;
			}
		}

	}
  
  public Board(int player) {
    // Default board size
    this(10, 10, 31, 10, player);
  }


	public void addShip(int x, int y, int length, int direction)
	{
    // This sets the first (x,y) coordinate to
    // be true. We don't have any out of bounds
    // error catching here as this will be handled
    // by the graphic interface
    int x1 = x;
    int x2 = x;
    int y1 = y;
    int y2 = y;
    // This for loop traces the direction of the
    // boat through the array.
		for (int k = 0; k < length; k++)
		{
      // Donal: I cleaned this up a bit to make it more
      // logical the other method was a bit prone
      // to mistakes. In this version we redefine
      // x/y on every iteration so we can have a
      // single assignment statement

      // The switch case is a bit of a nicer solution
      // than all the if statements
      switch (direction) {
        case 0: 
          y1 = y-k;
          if (k > 0) y--;
          break;
        case 1:
          x1 = x+k;
          if (k > 0) x++;
          break;
        case 2:
          y1 = y+k;
          if (k > 0) y++;
          break;
        case 3:
          x1 = x-k;
          if (k > 0) x--;
          break;
      }
      
      Ship newShip = new Ship(this.player, length, new Position(x2,y2), new Position(x1,y1));
      this.shipTracker[newShip.numberOfShips-1] = newShip;
	  	board[x][y] = newShip;
     }

	}
  
  public int lengthX() {
    return this.lenX;
  }

  public int lengthY() {
    return this.lenY;
  }

	public ShipStatus getVal(int x, int y)
	{
		return board[x][y].shipHere();
	}
  
  public boolean strike(Position p) {
    if (board[p.x][p.y].hit()) {
      board[p.x][p.y] = this.destroyed;
      for (int i = 0; i < this.shipTracker.length; i++) {
        if (!this.shipTracker[i].aFloat()) this.shipTracker[i] = this.destroyed; // You sunk my battleship
        else board[p.x][p.y] = this.epicFail;
      return true;
      } 
    }
    return false;
  }
}
