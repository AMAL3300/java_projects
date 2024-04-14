import java.util.Scanner;

interface Calculate{
    double sum();
    double diffrence();
    double product();
    double division();
}

 class Calculator implements Calculate {
    private double n1,n2;
    public Calculator(double n1,double n2){
        this.n1=n1;
        this.n2=n2;
    }
    public double sum(){
        return n1+n2;
    }
    public double diffrence(){
        return n1-n2;
    }
    public double product(){
        return n1*n2;
    }
    public double division(){
        return n1/n2;
    }}
 
public class InnerCalculator {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.println("\nSmiple Calculator");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice=scanner.nextInt();

            double n1,n2;

            switch (choice) {
                case 1:
                    System.out.println("ENTER THE FIRST NUMBER");
                     n1=scanner.nextDouble();
                    System.out.println("enter the second number");
                     n2=scanner.nextDouble();
                    Calculator calculator=new Calculator(n1,n2);
                    System.out.println("sum="+calculator.sum());
                break;

                case 2:
                    System.out.println("ENTER THE FIRST NUMBER");
                     n1=scanner.nextDouble();
                    System.out.println("enter the second number");
                     n2=scanner.nextDouble();
                    Calculator calculator2=new Calculator(n1,n2);
                    System.out.println("sum="+calculator2.diffrence());
                break;

                case 3:
                    System.out.println("ENTER THE FIRST NUMBER");
                    n1=scanner.nextDouble();
                    System.out.println("enter the second number");
                    n2=scanner.nextDouble();
                    Calculator calculator3=new Calculator(n1,n2);
                    System.out.println("sum="+ calculator3.product());
                    break;

                case 4:
                    System.out.println("ENTER THE FIRST NUMBER");
                    n1=scanner.nextDouble();
                    System.out.println("enter the second number");
                    n2=scanner.nextDouble();
                    Calculator calculator4=new Calculator(n1,n2);
                    System.out.println("sum="+calculator4.division());
                    break;

                case 5:
                    System.out.println("Exiting....");
                    scanner.close();
                    System.exit(0);
                  
                    break;


            
                default:
                
                System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
            
        }
    }
}

    



        