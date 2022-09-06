import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of arraylist");
        int num = scanner.nextInt();
        List<Integer> numberList = new ArrayList<>(num);
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        for (int i = 0; i < strings.length; i++) {
            numberList.add(Integer.parseInt(strings[i]));
        }
        System.out.println("Enter number of queries");
        int numberOfQueries = scanner.nextInt();


        do{
            System.out.println("Enter type of query");
            scanner.nextLine();
            String typeOfQuery = scanner.nextLine();
            if(typeOfQuery.equals("Insert")){
                numberList.add(scanner.nextInt(),scanner.nextInt());
            }
            else if(typeOfQuery.equals("Delete")){
                int num1 = scanner.nextInt();
                numberList.remove(num1);
            }

            numberOfQueries--;
        }while(numberOfQueries != 0);

        for(Integer element : numberList){
            System.out.print(element + " ");
        }
    }
}
