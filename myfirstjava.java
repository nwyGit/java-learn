class DrawingTriangle {
  public static void drawTriangle(int N) {
    String symbol = "*";
    for (int i = 0; i < N; i++) {
      System.out.println(symbol);
      symbol = symbol + "*";
    }
  }

  public static void main(String[] args) {
    drawTriangle(10);
  }
}