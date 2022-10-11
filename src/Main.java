import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task123();
        Task4();

    }
    public static void Task123() {
        /*Задача 1
    Объявите три массива:
    1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
    2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
    3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
    с помощью ключевого слова или сразу заполненный элементами.
         */
        /*Задача 2
    Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
    через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
         */
        /*Задача 3
    Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
    Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
    а элементы другого массива – на другой.
    Запятая между последним элементом одного массива и первым элементом следующего не нужна.
         */
        System.out.println("Задание #1, #2, #3" + '\n');
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        String intArrayString = Arrays.toString(array);
        System.out.print(intArrayString);
        System.out.println();
        System.out.print(array[2] + " , " + array[1] + " , " + array[0]);
        System.out.println('\n');

        double[] arrayTwo = {1.57, 7.654, 9.986};
        System.out.print(arrayTwo[0]);
        for (int i = 1; i < arrayTwo.length; i++) {
            System.out.print(" , " + arrayTwo[i]);
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrayTwo[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println('\n');

        String[] arrayThree = {"Один", "Два", "Три", "Четыре", "Пять"};
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayThree[i]);
            if (i < 4) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 4; i >= 0; i--) {
            System.out.print(arrayThree[i]);
            if (i > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }
    public static void Task4(){
        /*
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
    Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
    Распечатайте результат преобразования в консоль.
         */
        System.out.println('\n' + "Задача #4");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            } else {
                array[i] = array[i] + 1;
                System.out.println(array[i]);
            }
        }
    }

}