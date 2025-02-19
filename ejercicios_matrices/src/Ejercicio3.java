public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        System.out.print("Valor maximo de la matriz: ");
        int max = matriz[0][0];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz[i][j] > max){
                    max = matriz[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
