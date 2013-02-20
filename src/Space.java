public class Space {
  protected int damage;
  protected int size;

  public Space(int size) {
    this.size = size;
    this.damage = 0;
  }

  public ShipStatus shipHere() {
    return ShipStatus.BLANK;
  }

  public boolean hit() {
    return false;
  }

  public boolean aFloat() {
    return false;
  }
}
