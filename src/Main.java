import java.util.Scanner;

public class Main {
    static int X;
    static int[][] matriz;
    static boolean matrizRellena = false;  // Verifica si la matriz ha sido rellenada

    static String[][] golosinas = {
            {"KitKat", "32", "10"},
            {"Chicles", "2", "50"},
            {"Caramelos de Menta", "2", "50"},
            {"Huevo Kinder", "25", "10"},
            {"Chetoos", "30", "10"},
            {"Twix", "26", "10"},
            {"M&M'S", "35", "10"},
            {"Papas Lays", "40", "20"},
            {"Milkybar", "30", "10"},
            {"Alfajor Tofi", "20", "15"},
            {"Lata Coca", "50", "20"},
            {"Chitos", "45", "10"}
    };

    static int totalVentas = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una opción (1-23) o 24 para salir:");
            for (int i = 1; i <= 23; i++) {
                System.out.println("Opción " + i);
            }
            System.out.println("24. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Has seleccionado la opción 1");
                    String[][] paisesYciudades = new String[4][4];
                    sc.nextLine(); // Consumir el salto de línea
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Ingrese el nombre del país " + (i + 1) + ": ");
                        paisesYciudades[i][0] = sc.nextLine();
                        for (int j = 1; j < 4; j++) {
                            System.out.println("Ingrese el nombre de la ciudad " + j + " para " + paisesYciudades[i][0] + ": ");
                            paisesYciudades[i][j] = sc.nextLine();
                        }
                    }
                    break;

                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    System.out.print("Ingrese el valor de X: ");
                    int X1 = sc.nextInt();
                    System.out.print("Ingrese el valor de Y: ");
                    int Y = sc.nextInt();

                    int[][] array1 = new int[X1][Y];
                    System.out.println("Ingrese los valores para el primer array [" + X1 + "," + Y + "]:");
                    for (int i = 0; i < X1; i++) {
                        for (int j = 0; j < Y; j++) {
                            System.out.print("Posición [" + i + "][" + j + "]: ");
                            array1[i][j] = sc.nextInt();
                        }
                    }

                    int[][] array2 = new int[Y][X1];
                    System.out.println("Ingrese los valores para el segundo array [" + Y + "," + X1 + "]:");
                    for (int i = 0; i < Y; i++) {
                        for (int j = 0; j < X1; j++) {
                            System.out.print("Posición [" + i + "][" + j + "]: ");
                            array2[i][j] = sc.nextInt();
                        }
                    }

                    int[][] resultado = new int[X1][Y];
                    for (int i = 0; i < X1; i++) {
                        for (int j = 0; j < Y; j++) {
                            resultado[i][j] = array1[i][j] * array2[j][i];
                        }
                    }

                    System.out.println("\nPrimer Array [" + X1 + "," + Y + "]:");
                    for (int i = 0; i < X1; i++) {
                        for (int j = 0; j < Y; j++) {
                            System.out.print(array1[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    System.out.println("\nSegundo Array [" + Y + "," + X1 + "]:");
                    for (int i = 0; i < Y; i++) {
                        for (int j = 0; j < X1; j++) {
                            System.out.print(array2[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    System.out.println("\nArray Resultante (Multiplicación) [" + X1 + "," + Y + "]:");
                    for (int i = 0; i < X1; i++) {
                        for (int j = 0; j < Y; j++) {
                            System.out.print(resultado[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    do {
                        System.out.print("Ingrese un valor para X (mayor o igual a 3 y menor o igual a 10): ");
                        X = sc.nextInt();
                    } while (X < 3 || X > 10);

                    matriz = new int[X][X];

                    System.out.println("Ingrese los valores para la matriz de tamaño [" + X + "," + X + "]:");
                    for (int i = 0; i < X; i++) {
                        for (int j = 0; j < X; j++) {
                            System.out.print("Posición [" + i + "][" + j + "]: ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }

                    System.out.println("\nMatriz ingresada:");
                    for (int i = 0; i < X; i++) {
                        for (int j = 0; j < X; j++) {
                            System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    int[] sumaColumnas = new int[X];
                    for (int j = 0; j < X; j++) {
                        for (int i = 0; i < X; i++) {
                            sumaColumnas[j] += matriz[i][j];
                        }
                    }

                    System.out.println("\nSuma de cada columna:");
                    for (int j = 0; j < X; j++) {
                        System.out.println("Columna " + j + ": " + sumaColumnas[j]);
                    }

                    int sumaTotal = 0;
                    for (int j = 0; j < X; j++) {
                        sumaTotal += sumaColumnas[j];
                    }

                    System.out.println("\nSuma total de las columnas: " + sumaTotal);
                    break;

                case 4:
                    System.out.println("Has seleccionado la opción 4");
                    do {
                        System.out.print("Ingrese un valor para X (mayor o igual a 4 y menor o igual a 10): ");
                        X = sc.nextInt();
                    } while (X < 4 || X > 10);

                    matriz = new int[X][X];
                    matrizRellena = false;

                    int opcion;
                    do {
                        System.out.println("\nMenú de opciones:");
                        System.out.println("1. Rellenar toda la matriz");
                        System.out.println("2. Sumar una fila");
                        System.out.println("3. Sumar una columna");
                        System.out.println("4. Sumar la diagonal principal");
                        System.out.println("5. Sumar la diagonal inversa");
                        System.out.println("6. Calcular la media de todos los valores de la matriz");
                        System.out.println("0. Salir");
                        System.out.print("Elija una opción: ");
                        opcion = sc.nextInt();

                        switch (opcion) {
                            case 1:
                                rellenarMatriz(sc);
                                break;
                            case 2:
                                sumarFila(sc);
                                break;
                            case 3:
                                sumarColumna(sc);
                                break;
                            case 4:
                                sumarDiagonalPrincipal();
                                break;
                            case 5:
                                sumarDiagonalInversa();
                                break;
                            case 6:
                                calcularMedia();
                                break;
                            case 0:
                                System.out.println("Saliendo del menú de matriz...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (opcion != 0);
                    break;

                case 5:
                    System.out.println("Has seleccionado la opción 5");
                    Scanner sc2 = new Scanner(System.in); // Scanner adicional para evitar conflictos
                    int option5;
                    do {
                        System.out.println("\nMenú:");
                        System.out.println("1. Pedir golosina");
                        System.out.println("2. Mostrar golosinas");
                        System.out.println("3. Rellenar golosinas (solo técnico)");
                        System.out.println("4. Apagar máquina (mostrar ventas totales)");
                        System.out.print("Seleccione una opción: ");
                        option5 = sc2.nextInt();

                        switch (option5) {
                            case 1:
                                pedirGolosina(sc2);
                                break;
                            case 2:
                                mostrarGolosinas();
                                break;
                            case 3:
                                rellenarGolosinas(sc2);
                                break;
                            case 4:
                                apagarMaquina();
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }
                    } while (option5 != 4);
                    sc2.close();
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione un número entre 1 y 24.");
                    break;
            }
        } while (option != 24);

        sc.close();
    }

    public static void rellenarMatriz(Scanner sc) {
        System.out.println("\nIngrese los valores para la matriz de tamaño [" + X + "," + X + "]:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        matrizRellena = true;  // Marcar la matriz como rellenada
        System.out.println("Matriz rellenada correctamente.");
    }

    public static void sumarFila(Scanner sc) {
        if (matrizRellena) {
            System.out.print("Ingrese el número de la fila a sumar (0-" + (X - 1) + "): ");
            int fila = sc.nextInt();
            if (fila >= 0 && fila < X) {
                int sumaFila = 0;
                for (int j = 0; j < X; j++) {
                    sumaFila += matriz[fila][j];
                }
                System.out.println("La suma de la fila " + fila + " es: " + sumaFila);
            } else {
                System.out.println("Fila no válida.");
            }
        } else {
            System.out.println("Debes rellenar la matriz antes de usar esta opción.");
        }
    }

    public static void sumarColumna(Scanner sc) {
        if (matrizRellena) {
            System.out.print("Ingrese el número de la columna a sumar (0-" + (X - 1) + "): ");
            int columna = sc.nextInt();
            if (columna >= 0 && columna < X) {
                int sumaColumna = 0;
                for (int i = 0; i < X; i++) {
                    sumaColumna += matriz[i][columna];
                }
                System.out.println("La suma de la columna " + columna + " es: " + sumaColumna);
            } else {
                System.out.println("Columna no válida.");
            }
        } else {
            System.out.println("Debes rellenar la matriz antes de usar esta opción.");
        }
    }

    public static void sumarDiagonalPrincipal() {
        if (matrizRellena) {
            int sumaDiagonalPrincipal = 0;
            for (int i = 0; i < X; i++) {
                sumaDiagonalPrincipal += matriz[i][i];
            }
            System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal);
        } else {
            System.out.println("Debes rellenar la matriz antes de usar esta opción.");
        }
    }

    public static void sumarDiagonalInversa() {
        if (matrizRellena) {
            int sumaDiagonalInversa = 0;
            for (int i = 0; i < X; i++) {
                sumaDiagonalInversa += matriz[i][X - 1 - i];
            }
            System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
        } else {
            System.out.println("Debes rellenar la matriz antes de usar esta opción.");
        }
    }

    public static void calcularMedia() {
        if (matrizRellena) {
            int sumaTotal = 0;
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < X; j++) {
                    sumaTotal += matriz[i][j];
                }
            }
            double media = (double) sumaTotal / (X * X);
            System.out.println("La media de todos los valores de la matriz es: " + media);
        } else {
            System.out.println("Debes rellenar la matriz antes de usar esta opción.");
        }
    }

    public static void pedirGolosina(Scanner sc) {
        mostrarGolosinas();
        System.out.print("Seleccione la fila de la golosina que desea (1-" + golosinas.length + "): ");
        int fila = sc.nextInt() - 1;

        if (fila >= 0 && fila < golosinas.length) {
            int cantidad = Integer.parseInt(golosinas[fila][2]);

            if (cantidad > 0) {
                golosinas[fila][2] = String.valueOf(cantidad - 1);
                totalVentas += Integer.parseInt(golosinas[fila][1]);
                System.out.println("Has seleccionado: " + golosinas[fila][0] + ". Quedan " + golosinas[fila][2] + " en stock.");
            } else {
                System.out.println("Lo siento, no hay stock de " + golosinas[fila][0] + ". Seleccione otra golosina.");
            }
        } else {
            System.out.println("Selección inválida.");
        }
    }

    public static void mostrarGolosinas() {
        System.out.println("\nGolosinas disponibles:");
        for (int i = 0; i < golosinas.length; i++) {
            System.out.println((i + 1) + ". " + golosinas[i][0] + " - Precio: " + golosinas[i][1] + " - Stock: " + golosinas[i][2]);
        }
    }

    public static void rellenarGolosinas(Scanner sc) {
        System.out.print("Ingrese la contraseña: ");
        String password = sc.next();

        if (password.equals("AdminXYZ")) {
            mostrarGolosinas();
            System.out.print("Seleccione la fila de la golosina que desea rellenar (1-" + golosinas.length + "): ");
            int fila = sc.nextInt() - 1;

            if (fila >= 0 && fila < golosinas.length) {
                System.out.print("Ingrese la cantidad a añadir: ");
                int cantidad = sc.nextInt();
                golosinas[fila][2] = String.valueOf(Integer.parseInt(golosinas[fila][2]) + cantidad);
                System.out.println("Se ha rellenado " + golosinas[fila][0] + ". Stock actual: " + golosinas[fila][2]);
            } else {
                System.out.println("Selección inválida.");
            }
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    public static void apagarMaquina() {
        System.out.println("\nApagando máquina...");
        System.out.println("Ventas totales realizadas: $" + totalVentas);
    }
}

