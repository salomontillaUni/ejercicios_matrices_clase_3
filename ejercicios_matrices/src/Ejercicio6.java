public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int resultado = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz[i][j] % 2 == 0){
                    resultado ++;
                }
            }
        }
        System.out.println("La cantidad de numeros pares en la matriz es de: " + resultado);
    }
}
