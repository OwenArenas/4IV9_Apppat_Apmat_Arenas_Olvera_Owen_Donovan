import java.util.Scanner;

public class ExamenArenas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        String nombre = "", ap1 = "", ap2 = "", dir = "", fecha = "";

        while (op != 4) {

            System.out.println("\n1. Datos del cliente");
            System.out.println("2. Tipos de piso");
            System.out.println("3. Calcular compra");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {

                System.out.print("Nombre: ");
                nombre = sc.nextLine();

                System.out.print("Apellido paterno: ");
                ap1 = sc.nextLine();

                System.out.print("Apellido materno: ");
                ap2 = sc.nextLine();

                System.out.print("Fecha de nacimiento: ");
                fecha = sc.nextLine();

                System.out.print("Direccion: ");
                dir = sc.nextLine();

            } else if (op == 2) {

                System.out.println("\nTipos de piso:");
                System.out.println("1. Porcelanato 22.35 m2");
                System.out.println("2. Marmoleado 34.27 m2");
                System.out.println("3. Acrilico 22.94 m2");

            } else if (op == 3) {

                int cuartos;

                do {
                    System.out.print("\nNumero de cuartos (2-4): ");
                    cuartos = sc.nextInt();
                } while (cuartos <= 1 || cuartos >= 5);

                double total = 0;

                for (int i = 1; i <= cuartos; i++) {

                    System.out.println("\nCuarto " + i);

                    System.out.print("Largo: ");
                    double largo = sc.nextDouble();

                    System.out.print("Ancho: ");
                    double ancho = sc.nextDouble();

                    double area = largo * ancho;

                    System.out.println("Tipo de piso:");
                    System.out.println("1. Porcelanato");
                    System.out.println("2. Marmoleado");
                    System.out.println("3. Acrilico");

                    int tipo = sc.nextInt();

                    double precio = 0;
                    String piso = "";

                    if (tipo == 1) {
                        precio = 22.35;
                        piso = "Porcelanato";
                    } else if (tipo == 2) {
                        precio = 34.27;
                        piso = "Marmoleado";
                    } else if (tipo == 3) {
                        precio = 22.94;
                        piso = "Acrilico";
                    }

                    double costo = area * precio;
                    total = total + costo;

                    System.out.println("Costo del cuarto: $" + costo + " (" + piso + ")");
                }

                double iva = total * 0.16;
                double totalConIva = total + iva;

                System.out.println("\n----- RESUMEN -----");
                System.out.println("Cliente: " + nombre + " " + ap1 + " " + ap2);
                System.out.println("Direccion: " + dir);
                System.out.println("Subtotal: $" + total);
                System.out.println("IVA (16%): $" + iva);
                System.out.println("Total: $" + totalConIva);

                System.out.print("\nDesea realizar la compra? (si/no): ");
                sc.nextLine();
                String r = sc.nextLine();

                if (r.equalsIgnoreCase("si")) {

                    double desc = totalConIva * 0.0795;
                    double totalFinal = totalConIva - desc;

                    System.out.println("\n--- COMPRA FINAL ---");
                    System.out.println("Descuento 7.95%: $" + desc);
                    System.out.println("Total a pagar: $" + totalFinal);
                }

            } else if (op == 4) {

                System.out.println("Programa terminado");

            } else {

                System.out.println("Opcion no valida");
            }
        }

        sc.close();
    }
}