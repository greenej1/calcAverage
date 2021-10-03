class Main 
{
  public double calcAverage(int num1, double num2)
  {
    double average = (num1 + num2)/2;
    return average;
  }

  public double calcAverage(int num1, int num2, double num3)
  {
    double average = (num1 + num2 + num3)/3;
    return average;
  }

  public static void main(String[] args) 
  {
    Calculator newAverage = new Calculator();
    System.out.print("The average of 20 and 15.4 is ");
    System.out.println(newAverage.calcAverage(20, 15.4));
    System.out.print("The average of 5, 8, and 6.4 is " + newAverage.calcAverage(5, 8, 6.4));
  }
}