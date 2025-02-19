public class Ejercicio2 {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2},
                          {3, 4}};
        int matriz2[][] = {{5, 6},
                           {7, 8}};
        System.out.println("Suma de matrices: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(matriz[i][j] + matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
