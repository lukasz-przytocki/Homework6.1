import java.util.Scanner;
public class StrangeCalculator {

    public int strangeCalculator() {
        int value1;
        int value2;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą wartość: ");
        value1 = input.nextInt();
        System.out.println("Podaj drugą wartość: ");
        value2 = input.nextInt();

        if(value1>value2){
            return sum(value1, value2);

        }else if (value1<value2){
            return multi(value1, value2);

        }else{
            return square(value1,value2);
        }

    }

    private int sum(int value1, int value2){
        System.out.println("Suma dwóch liczb: ");
        return value1+value2;
    }

    private int multi(int value1, int value2){
        System.out.println("Iloczyn dwóch liczb: ");
        return value1*value2;
    }

    private int square(int value1, int value2){
        System.out.println("Kwadrat: ");
        return value1*value2;
    }
}
