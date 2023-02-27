public class Math {
    public static void main(String[] args) {
    }
    /*
    Метод fact вычисляет факториал числа
    IntermediateUnit это переменная, в которую будет записан результат вычислений
    Метод для вычисления факториала числа должен принимать на вход число, меньше 13, иначе на выходе будет 1
    С отрицательным числом выйдет -1

     */
    public int fact( int factInputNumber) {
        int IntermediateUnit = 1;
        if(factInputNumber > 13) {
            System.out.println("Число должно быть меньше 13!");
            IntermediateUnit = 1;
        } else if (factInputNumber < 0) {
            System.out.println("Число не должно быть отрицательным!");
            IntermediateUnit = 1;
    } else{
            while (factInputNumber != 0){
                IntermediateUnit = IntermediateUnit * factInputNumber;
                factInputNumber -= 1;
            }
        }
        System.out.println(IntermediateUnit);
        return (IntermediateUnit);
    }
    /*
    Метод sign вычисляет кусочно-постоянную функцию действительного аргумента
    Переменная result является результатом вычислений
     */
    public int sign(int signInputNumber){
        int result = 0;
        if(signInputNumber > 0){
            result = 1;
        } else if (signInputNumber == 0) {
            result = 0;
        } else {
            result = -1;
        }
        System.out.println(result);
        return (result);
    }
}