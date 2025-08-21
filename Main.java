
class Main {
  private static int i;
  public static void main(String[] args) {
     //Odd integers from 1 to 100, inclusive of both
     
    for (i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        System.out.print(i + "-");
      }
    }
    System.out.println(" ");
    System.out.println(" ");

    //All multiples of 3 from 1 to 100
     for (i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        System.out.print(i + "-");

      }
    }
    System.out.println(" ");
    System.out.println(" ");


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
     for (i = 1000; i >= 1; i--) {
      if (i % 10 == 0) {
        System.out.print(i + "-");
      }
    }




  }
}
