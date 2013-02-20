public class TestASCII {
  public static String printArray(int[][] array) {
    String returnVal = "";
    for (int i = 0; i < array.length; i++) {
      for (int k = 0; k < array[i].length; k++) {
        if (array[i][k] == 0) returnVal += " [ ]";
        else returnVal += (" [" + Integer.toString(array[i][k]) + "]");
      }
      returnVal += "\n";
    }
    return returnVal;
  }
  
  public static String printArray(char[][] array) {
    String returnVal = "";
    for (int i = 0; i < array.length; i++) {
      for (int k = 0; k < array[i].length; k++) {
        if (array[i][k] == 0) returnVal += " [ ]";
        else returnVal += (" [" + array[i][k] + "]");
      }
      returnVal += "\n";
    }
    return returnVal;
  }

  public static void main(String args[]) {
    Board board = new Board(10,10);
    board.addShip(0, 0, 7, 1);
    System.out.print(printArray(board.returnArray()));
  }
}
