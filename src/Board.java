public class Board 
{
	private boolean[][] board;
	public Board(int width, int height)
	{

    // Here we are defining the array that 
    // forms the basis of the board
		board = new boolean[width][height];

    // This for loop initiates every
    // item in the array to false
    // so we don't have any issues with
    // methods accessing empty array slots
		for (int i = 0; i < width; i++)
		{
			for (int j = 0; j < height; j++)
			{
				board[i][j] = false;
			}
		}

	}
	public void addShip(int x, int y, int length, int direction)
	{
    // This sets the first (x,y) coordinate to
    // be true. We don't have any out of bounds
    // error catching here as this will be handled
    // by the graphic interface
		board[x][y] = true;
    // This for loop traces the direction of the
    // boat through the array.
		for (int k = 1; k < length; k++)
		{
      // Donal: I cleaned this up a bit to make it more
      // logical the other method was a bit prone
      // to mistakes. In this version we redefine
      // x/y on every iteration so we can have a
      // single assignment statement
		  board[x][y] = true;

      // The switch case is a bit of a nicer solution
      // than all the if statements
      switch (direction) {
        case 0: 
          y--;
          break;
        case 1:
          x++;
          break;
        case 2:
          y++;
          break;
        case 3:
          x--;
          break;
      }
		}
	}
	public boolean getVal(int x, int y)
	{
		return board[x][y];		
	}

}
