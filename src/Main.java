import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IntContainer intContainer = new IntContainer();

        System.out.println("Enter your collection of 3 integer numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            intContainer.pushEndNum(input.nextInt());
        }

        intContainer.printCollection();

        System.out.println("Add 1 into top and end of collection: ");
        intContainer.pushForwardNum(1);
        intContainer.pushEndNum(1);
        intContainer.printCollection();

        System.out.println("Pop two last and first nums, than add it to top of collection: ");
        int buf[] = new int[4];
        buf[0] = intContainer.popLastNum();
        buf[1] = intContainer.popLastNum();
        buf[2] = intContainer.popFirstNum();
        buf[3] = intContainer.popFirstNum();
        intContainer.printCollection();

        System.out.println("than add it to top of collection: ");
        for(int i = 0; i<4; i++) {
            intContainer.pushForwardNum(buf[i]);
        }
        intContainer.printCollection();

        System.out.println("Get first and last elements: ");
        System.out.println(intContainer.getFirstNum());
        System.out.println(intContainer.getLastNum());

        System.out.println("Collection: ");
        intContainer.printCollection();

        System.out.println("Delete two first and one last number: ");
        intContainer.deleteFirstNum();
        intContainer.deleteFirstNum();
        intContainer.deleteLastNum();

        System.out.println("Collection: ");
        intContainer.printCollection();
    }
}
