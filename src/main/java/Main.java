public class Main {
    public static void main(String[] args) {

        //Решение к заданию 1
        {
            //инициализация трех экземпляров класса Phone без использования пеегруженного конструктора и вывод данных в консоль
            Phone nokia = new Phone();
            nokia.model = "5310";
            nokia.number = "88002000600";
            nokia.weight = 135;
            Phone motorola = new Phone();
            motorola.model = "e398";
            motorola.number = "88005553535";
            motorola.weight = 120;
            Phone samsung = new Phone();
            samsung.model = "galaxy A5";
            samsung.number = "88006969282";
            samsung.weight = 215;

            System.out.println(nokia.number + " " + nokia.model + " " + nokia.weight);
            System.out.println(motorola.number + " " + motorola.model + " " + motorola.weight);
            System.out.println(samsung.number + " " + samsung.model + " " + samsung.weight);

            //вызов методов receiveCall и геттера getNumber
            nokia.receiveCall("Джонатан");
            System.out.println(nokia.getNumber());

            motorola.receiveCall("Магомет");
            System.out.println(motorola.getNumber());

            samsung.receiveCall("Хидео");
            System.out.println(samsung.getNumber());

            //вызов перегруженного метода receiveCall
            nokia.receiveCall("Джонатан", "911");

            //инициализация экземпляра класса Phone с помощью конструктора с тремя параметрами и вывод данных в консоль
            Phone xiaomi = new Phone("424597", "Redmi Note 4", 200);
            System.out.println(xiaomi.number + " " + xiaomi.model + " " + xiaomi.weight);

            //вызов метода sendMessage
            Phone.sendMessage("911", "112", "01", "02");
        }
//--------------------------------------------------------------------------------------------------------------

        //Решение к заданию 2
        {
            //инициализация первой матрицы
            System.out.println("Инициализация первой матрицы");
            int[][] firstMatrixArray = {{0, 1, 4, 14}, {4, 2, 5, 4}, {10, -5, 18, 77}};
            Matrix firstMatrix = new Matrix(firstMatrixArray);
            //печать матрицы
            firstMatrix.printMatrix();

            //инициализация второй матрицы
            System.out.println("Инициализация второй матрицы");
            Matrix secondMatrix = new Matrix(4, 5);
            //печать матрицы
            secondMatrix.printMatrix();

            //сложение матриц с разной размерностью
            System.out.println("Сложение матриц с разной размерностью");
            firstMatrix.sumWithOtherMatrix(secondMatrix);

            //сложение матриц с одинаковой размерностью
            System.out.println("Сложение матриц с одинаковой размерностью");
            int[][] sumArray = {{0, 1, 3, 10}, {4, 2, -2, 4}, {3, -5, -30, 15}};
            Matrix sumMatrix = new Matrix(sumArray);
            firstMatrix.sumWithOtherMatrix(sumMatrix);

            //умножение матрицы на число
            System.out.println("Умножение матрицы на число");
            secondMatrix.mupltiplyByNumber(3);

            //умножение матриц
            System.out.println("Умножение матриц");
            firstMatrix.setMatrix(firstMatrix.multiplywithOtherMatrix(secondMatrix));
        }
    }
}
