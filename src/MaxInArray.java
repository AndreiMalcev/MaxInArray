/**
 * Created by Андрей on 11.09.2016.
 */
import java.util.Scanner;
public class MaxInArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = in.nextInt();
        int [] array=new int[length];
        System.out.println("Введите массив");
        for (int i = 0; i < length; i++)
            array[i] = in.nextInt();
        int max=array[0];
        for (int i = 1; i < length; i++)
            if (max<array[i])
                max=array[i];
        System.out.print("Максимальный элемент массива="+max);
    }

}