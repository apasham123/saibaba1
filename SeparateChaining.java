import java.util.LinkedList;
import java.util.Scanner;
public class SeparateChaining {
    static LinkedList<Integer>[] hashTable = new LinkedList[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to insert: ");
        int num = sc.nextInt();
        insert(num);
        display();
    }
    static void insert(int num) {
        int index = num % 10;
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
        }
        hashTable[index].add(num);
    }
    static void display() {
        for (int i = 0; i < 10; i++) {
            if (hashTable[i] != null) {
                System.out.print(i + " -> ");
                for (Integer num : hashTable[i]) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println(i + " -> ");
            }
        }
    }
}
