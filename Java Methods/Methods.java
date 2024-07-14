import java.util.Scanner;


public static void main(String[] args){

    //Method for entering marks
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter The First Number: ");
    int fnum = scanner.nextInt();

    System.out.println("Enter The Second Number: ");
    int snum = scanner.nextInt();

    System.out.println("Enter The Third Number: ");
    int tnum = scanner.nextInt();

    //Determining the largest number
    int largest;
    if (fnum >= snum && fnum >= tnum) {
        largest = fnum;
    } else if (snum >= fnum && snum >= tnum) {
        largest = snum;
    } else {
        largest = tnum;
    }
    
    // Determining the smallest number
    int smallest;
    if (fnum <= snum && fnum <= tnum) {
        smallest = fnum;
    } else if (snum <= fnum && snum <= tnum) {
        smallest = snum;
    } else {
        smallest = tnum;
    }
    
    System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " smallest number.");

        scanner.close();

}