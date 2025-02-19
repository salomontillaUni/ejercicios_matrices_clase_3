public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] matriz = {{1,1}, {1,1}};
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(matriz[i][j] * 2  + " ");
            }
            System.out.println();
        }
    }
}
