/***********************
 * PROJECT:       BattleShips
 * GROUP:         Team 3 Tutorial Group 13
 * 
 * DESCRIPTION:   We'll add this when it's done
 *
 **********************/


public class Main 
{
	
	public Main()
	{
		Board x = new Board(50,50);
		x.addShip(1,1,3,2);
		x.getVal(1,1);
	}
	public static void main(String[] args)
	{
		Main m = new Main();
	}
	
}
