package IntroductiontoJava;

/* exercise 3 */
class FindMaxValue {
  /** Returns the maximum value from m using a for loop. */
  public static int max(int[] m) {
    int temp = 0;
    for (int i = 1; i < m.length; i++) {
      if (m[i - 1] < m[i]) {
        temp = m[i];
      }
    }
    System.out.println(temp);
    return 0;
  }

  public static void main(String[] args) {
    int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
    max(numbers);
  }
}