public class Board 
{
	private int[][] board;
	public Board(int width, int height)
	{
		board = new int[width][height];
		for (int i = 0; i < width; i++)
		{
			for (int j = 0; j < height; j++)
			{
				board[i][j] = 0;
			}
		}

	}
	public void addShip(int x, int y, int length, char direction)
	{
		board[x][y] = 1;
		for (int k = 1; k < length; k++)
		{
			if (direction == 'u' )
			{
				board[x][y-k] = 1;
			}
			else if (direction == 'r')
			{
				board[x+1][y] = 1;
			}
			else if (direction == 'd')
			{
				board[x][y+1] = 1;
			}
			else if (direction == 'l')
			{
				board[x-1][y] = 1;
			}
		}
	}
	public int getVal(int x, int y)
	{
		return board[x][y];		
	}




}
