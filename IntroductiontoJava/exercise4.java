package IntroductiontoJava;

/* exercise 4 */
class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0) {
        continue;
      } else {
        int temp = 0;
        for (int j = i; j <= n + i; j++) {
          if (j == a.length) {
            break;
          }
          temp += a[j];
        }
        a[i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, -3, 4, 5, 4 };
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}