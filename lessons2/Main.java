package lessons2;

public class Main {

    public static void main(String[] args) {
        String str = new String("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0");

        try{
            System.out.println(stringToArray(str));}
        catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public static int stringToArray(String s) {//task1
        String[] strArr = s.split("\n");
        if (strArr.length != 4) try {
            throw new Exception("Кол-во строк в матрице не равно 4x4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[][] matrixArr = {
                strArr[0].split(" "),
                strArr[1].split(" "),
                strArr[2].split(" "),
                strArr[3].split(" "),
        };
        int[][] intArr = new int[4][4]; //task2
        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(matrixArr[i][j]);
                } catch (NumberFormatException e) {
                    try {
                        throw new Exception("В матрице,в строке "+i+" столбце "+j+" не число(символ/слово)");
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        }for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr.length; j++) {
                System.out.print(intArr[i][j] + " ");
            }System.out.println(" ");
        }System.out.println("=======");
        int sum = 0;
        int div;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                sum += intArr[i][j];
            }
        }div = sum / 2;
        System.out.print("Сумма матрицы, деленная на 2, равна ");
        return div;
    }
    
}
