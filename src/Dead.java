public class Dead extends Space {
  private ShipStatus type;
  public Dead(String type) { 
    super(0);
    if (type == "Ship") this.type = ShipStatus.DESTROYED;
    else this.type = ShipStatus.DUD;
  }

  public ShipStatus shipHere() {
    return type;
  }
}
