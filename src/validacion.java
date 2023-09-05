public class validacion {
    public static boolean validarCoordenadas(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }
    public static int[][] movimientosCaballo(int x, int y) {
        int[][] movimientos = {
                {x - 2, y - 1}, {x - 2, y + 1},
                {x - 1, y - 2}, {x - 1, y + 2},
                {x + 1, y - 2}, {x + 1, y + 2},
                {x + 2, y - 1}, {x + 2, y + 1}
        };
        int[][] movimientosValidos = new int[8][2];
        int contador = 0;

        for (int[] movimiento : movimientos) {
            int mx = movimiento[0];
            int my = movimiento[1];

            if (validarCoordenadas(mx, my)) {
                movimientosValidos[contador][0] = mx;
                movimientosValidos[contador][1] = my;
                contador++;
            }
        }
        return movimientos;
    }
    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}

