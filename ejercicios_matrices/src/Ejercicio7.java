public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2},
                {3, 4}};
        int[][] matriz2 = {{5, 6},
                {7, 8}};

        int[][] resultado = sumaMatrices(matriz, matriz2);
        System.out.println("Suma de matrices: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2){
        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizSuma;
    }

}
