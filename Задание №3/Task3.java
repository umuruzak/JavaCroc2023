/**
*   Task №3
*   Umurzakov A., 18.10.23
*/
import java.util.Scanner;

public class Task3{
    
    public static void main(String[] args){
        System.out.print("Введите число: ");
        try (Scanner scan = new Scanner(System.in)){
            int number = scan.nextInt();
            boolean[] array = new boolean[number+3];
            sieve(array);
            if (array[number]){
                if (array[number-2] || array[number+2]){
                    System.out.println("Простое число-близнец");
                } else{
                    System.out.println("Простое");
                }
            } else{
                System.out.println("Составное");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    // Заполнение решета Эратосфена
    static void sieve(boolean[] array){
        array[0] = array[1] = false;
        for (int i = 2; i < array.length; i++){
            array[i] = true;
        }
        for (int p = 2; p * p < array.length; p++){
            if (array[p] == true){
                for (int j = 2 * p; j < array.length; j = j + p){
                    array[j] = false;
                }
            }
        }
    }
}
