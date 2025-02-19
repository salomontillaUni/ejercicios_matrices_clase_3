public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        int[][] matrizTranspuesta = transponerMatriz(matriz);
        System.out.println("Matriz original: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transponerMatriz(int[][] matriz){
        int[][] matrizTranspuesta = new int[matriz.length][matriz[0].length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
}
