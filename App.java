class App {
  public static void main(String args[]) {
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop() {
    int i = 10;
    while (i > 0) {
      System.out.println(i);
      i--;
    }
    System.out.println("Launch!");
  }

  private static void whileLoop() {
    int i = 0;
    System.out.println("Make whileLoop print the statement 'I love Java' 5 times:");
    while (i < 5) {
      System.out.println("I love Java!");
      i++;
    }
  }

  private static void doWhileLoop() {
    int i = 0;
    System.out.println("Make doWhileLoop print the statement 'I love Java' 5 times:");
    while (i < 5) {
      System.out.println("I love Java!");
      i++;
    }
  }
}
