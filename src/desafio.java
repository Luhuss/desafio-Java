import java.util.Scanner; // Importa la clase Scanner para permitir la entrada del usuario

public class desafio { // Definición de la clase principal llamada "desafio"
    public static void main(String[] args) { // Metodo principal donde comienza la ejecución del programa
        // Declaración e inicialización de variables que almacenan los datos del cliente
        String nombre = "Tony Starck"; // Nombre del cliente.
        String tipoDeCuenta = "Corriente"; // Tipo de cuenta del cliente.
        double saldo = 1599.99; // Saldo inicial de la cuenta.
        int opcion = 0; // Variable que se usará para almacenar la opción seleccionada.

        // Imprime los detalles iniciales del cliente y su saldo.
        System.out.println("*****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("\n*****************************************");

        // Menú de opciones que se muestra al usuario.
        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        // Se crea un objeto Scanner para capturar las entradas del usuario.
        Scanner teclado = new Scanner(System.in);

        // Ciclo que mantiene el programa en ejecución hasta que el usuario seleccione la opción 9 (Salir).
        while (opcion != 9){
            System.out.println(menu); // Muestra el menú al usuario.
            opcion = teclado.nextInt(); // Lee la opción seleccionada por el usuario.

            // Estructura swtich que ejecuta acciones basadas en la opción seleccionada
            switch (opcion){
                case 1: // Si elige la opción 1, muestra el saldo actual.
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break; // Termina el caso y evita continuar con los siguientes.

                case 2: // Si elige la opción 2, se inicia el proceso de retiro
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble(); // Lee el valor a retirar.

                    // Verifica si el monto a retirar es mayor que el saldo disponible.
                    if (valorARetirar > saldo){
                        System.out.println("Saldo insuficiente"); // si el valor es mayor, muestra mensaje de saldo insuficiente.
                    }else{
                        saldo = saldo - valorARetirar; // Actualiza el saldo después del retiro
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break; // Finaliza este caso y vuelve al inicio del 'While'

                case 3: // Si elige la ipción 3, se inicia el proceso del depósito.
                    System.out.println("¿Cuál es el valor que desea depositar? ");
                    double valorADepositar = teclado.nextDouble(); // Lee el valor a depositar.
                    saldo += valorADepositar; // Actualiza el saldo después del depósito.
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break; // Termina el caso del déposito.

                case 9: // Si elige la opción 9. el programa termina
                    System.out.println("Salíendo del programa, gracias por utilizar nuestros servicios");
                    break; // Sale del caso 'switch' y el bucle 'while' se detiene

                default: // Si elige una opción no válida, muestra un mensaje de error.
                    System.out.println("Opción no válida");
                    break; // Evita continuar con el siguiente caso aunque no sea válido
            }
        }

        teclado.close(); // Cierra el objeto Scanner para liberar los recursos usados.
    }
}

/*
Pasos para el desafio planteado
- Adicionar los datos del cliente
- Menú de opciones
- Visualizar saldo
- Hacer un depósito
- Hacer un retiro
 */

/*
Datos del cliente:

Las variables nombre, tipoDeCuenta y saldo contienen la información del cliente que se muestra al principio del programa.
Menú interactivo:

El menú se imprime en cada iteración del bucle while, donde el usuario elige entre las opciones 1, 2, 3 y 9.
Opción 1: Consulta el saldo actual de la cuenta.
Opción 2: Permite al usuario retirar dinero, pero primero verifica si el saldo es suficiente.
Opción 3: Permite al usuario depositar dinero, sumando el valor ingresado al saldo.
Opción 9: Sale del programa.
Control de flujo:

Se utiliza un bucle while para que el programa siga ejecutándose hasta que el usuario elija la opción de salida (9).
El switch controla qué acción se toma dependiendo de la opción que elija el usuario.
Dentro del switch, el break se utiliza para detener la ejecución de los siguientes casos una vez que se completa
el caso actual. Si no se incluye, el flujo de control "cae" en el siguiente caso, ejecutando el código de los casos
subsiguientes, incluso si no fueron seleccionados por el usuario.
Operaciones bancarias:

El saldo se actualiza después de cada operación de retiro o depósito.
Si se intenta retirar más del saldo disponible, el programa muestra un mensaje de "Saldo insuficiente".
Este programa simula un sistema básico de cuenta bancaria, donde el usuario puede consultar su saldo, retirar o depositar dinero, y salir cuando lo desee.
 */