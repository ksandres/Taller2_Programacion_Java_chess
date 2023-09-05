
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int x,y;
        Scanner o = new Scanner(System.in);
        System.out.println("ingrese la posicion en x");
        x = o.nextInt()-1;
        System.out.println("ingrese la posicion en Y");
        y = o.nextInt()-1;

        int tamano = 8;
        char[][] matriz = new char[tamano][tamano];
        if (validacion.validarCoordenadas(x, y)){
        matriz[x][y]= 'C';
        int[][] movs = validacion.movimientosCaballo(x,y);

        System.out.println("movimientos validos del caballo en " +(x+1)+ ","+(y+1));
            for (int[] mov:movs) {
                int mx = mov[0];
                int my = mov[1];
                if (validacion.validarCoordenadas(mx, my)) {
                    matriz[mx][my] = 'C';
                }
                if (validacion.validarCoordenadas(mx, my)) {
                    matriz[mx][my] = 'G';
                    System.out.println("Puede moverse a: (" + (my+1) + ", " + (mx+1) + ")");
                }
            }
            validacion.imprimirTablero(matriz);
            System.out.println("movimientos validos del caballo en " +(x+1)+ ","+(y+1));
        }else {
            System.out.println("las coordenandas ingresadas son invalidas");
        }
    }
}