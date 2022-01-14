import java.util.Scanner;

//ЗАДАНИЕ 2
//Создать класс "Матрица". Класс должен иметь следующие поля:
// 1) двумерный массив вещественных чисел;
// 2) количество строк и столбцов в матрице.
// Класс должен иметь следующие методы:
// 1) сложение с другой матрицей; 2) умножение на число; 3) вывод на печать; 4) умножение матриц - по желанию.

public class Matrix {
    private int [][] number;
    private int rows;
    private int columns;

    public int getNumber(int row, int column) {
        return number[row][column];
    }

    public void setNumber(int row, int column, int value) {
        number[row][column] = value;
    }

    public int[][] getMatrix() {
        return number;
    }

    public void setMatrix(int [][] number) {
        this.number = number;
        rows = number.length;
        columns = number[0].length;
    }

    public Matrix(int[][] number){
        rows = number.length;
        columns = number[0].length;
        this.number = number;
    }

    public Matrix(int rows, int columns){
        if(rows >0 && columns >0){
            this.rows = rows;
            this.columns = columns;
            number = new int[rows][columns];
        }
        System.out.println("Введите числа для заполнения массива: ");
        Scanner scr = new Scanner(System.in);
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                number[i][j] = scr.nextInt();
            }
        }
        scr.close();
    }

    void sumWithOtherMatrix(Matrix otherMatrix){
        if(this.number.length == otherMatrix.number.length && this.number[0].length==otherMatrix.number[0].length){
            System.out.println("Первая матрица до сложения");
            this.printMatrix();
            System.out.println("Вторая матрица до сложения");
            otherMatrix.printMatrix();
            int[][] resultMatrix = this.number;
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<columns; j++){
                    number[i][j] = number[i][j] + otherMatrix.number[i][j];
                }
            }
            System.out.println("Результат сложения");
            this.printMatrix();
        }
        else System.out.println("Складываемые матрицы имеют разные размерности, операция не может быть выполнена!\n");
    }

    void mupltiplyByNumber(int multiplicator){
        System.out.println("Исходная матрица до умножения на " + multiplicator);
        this.printMatrix();
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                number[i][j] *= multiplicator;
            }
        }
        System.out.println("Результат умножения");
        this.printMatrix();
    }

    void printMatrix(){
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    int[][] multiplywithOtherMatrix(Matrix secondMatrix){
        int[][]resultMatrix = new int[this.rows][secondMatrix.number[0].length];
        System.out.println("Первая матрица до умножения");
        this.printMatrix();
        System.out.println("Вторая матрица до умножения");
        secondMatrix.printMatrix();
        for (int i = 0; i < resultMatrix.length; i++){
            for (int j = 0; j < resultMatrix[0].length; j++){
                int sum = 0;
                for(int k = 0; k< this.columns; k++){
                    sum += this.number[i][k]*secondMatrix.number[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }
        System.out.println("Результат умножения матриц");
        for(int i = 0; i< resultMatrix.length; i++){
            for(int j = 0; j< resultMatrix[0].length; j++){
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return resultMatrix;
     }
}
