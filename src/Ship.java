/***********************
 * NAME: Ship
 * DESCRIPTION:
 *   This is kind of more extendable than the old idea
 *   of putting all boats characteristics into this 
 *   object to keep it away from other parts of the program, We 
 *   can use this object to  contain information like,
 *   the type of the boat, it's length, when it is destroyed etc.
************************/

public class Ship extends Space {
  private int boatID;
  private Position startCell;
  private Position stopCell;
  public static int numberOfShips;
  private boolean aFloat = true;

  public Ship(int player, int length, Position startCell, Position stopCell) {
    super(length);
 
    this.boatID = boatID;
    this.startCell = startCell;
    this.stopCell = stopCell;
    boatID = (player*100)+(++numberOfShips);
  }


  public boolean aFloat() {
    return aFloat;
  }

  public ShipStatus shipHere() {
    return ShipStatus.SHIP;
  }

  public boolean hit() {
    if (--this.damage == 0) {
      numberOfShips--;
      aFloat = false;
      // You sunk my battleship
    }
    return true;
  }
}
