/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectooriginal;
import java.util.Scanner;

/**
 *
 * @author F4NTA
 */
public class ProyectoOriginal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de votaciones");
        System.out.println("Ingrese la contraseña del usuario administrador:");
        String contrasenia = scanner.nextLine();

        if (contrasenia.equals("votaciones2023")) {
            System.out.println("Contraseña correcta");
            System.out.println("Menú");
            System.out.println("_____________________________________");
            System.out.println("1. Registro de usuarios");
            System.out.println("2. Registro de votantes");
            System.out.println("3. Administrador de Elecciones");
            System.out.println("4. Autenticación del votante");
            System.out.println("5. Conteo de votos");
            System.out.println("Seleccione una opción:");
            int opciones = scanner.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("REGISTRO DE USUARIOS");
                    System.out.println("___________________________");
                    System.out.println("1. Crear usuario del sistema");
                    System.out.println("2. Modificar usuario del sistema");
                    System.out.println("3. Reiniciar contraseña");
                    System.out.println("Seleccione una opción:");
                    int opcionUsuario = scanner.nextInt();

                    switch (opcionUsuario) {
                        case 1:
                            System.out.println("Creacion del usuario");
                            System.out.println("____________________________");
                            System.out.println("Ingrese el primer nombre:");
                            String nombre1 = scanner.nextLine();
                            System.out.println("Ingrese el segundo nombre:");
                            String nombre2 = scanner.nextLine();
                            System.out.println("Ingrese el primer apellido:");
                            String apellido1 = scanner.nextLine();
                            System.out.println("Ingrese el segundo apellido:");
                            String apellido2 = scanner.nextLine();
                            System.out.println("Ingrese el correo electrónico:");
                            String correo = scanner.nextLine();
                            System.out.println("Ingrese contraseña:");
                            String contraseniaUsuario = scanner.nextLine();
                            System.out.println("_______________________________");
                            System.out.println("Seleccione un rol");
                            System.out.println("1. Administrador");
                            System.out.println("2. Registradores de votantes");
                            System.out.println("3. Votante");
                            System.out.println("4. Auditor");
                            int rol = scanner.nextInt();
                            break;

                        case 2:
                            System.out.println("Modificar el usuario");
                            break;

                        case 3:
                            System.out.println("Para reiniciar la contraseña");
                            System.out.println("Ingrese el correo del usuario:");
                            String correoContra = scanner.nextLine();
                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Registro de votantes");
                    System.out.println("__________________________");
                    System.out.println("1. Agregar votante");
                    System.out.println("2. Modificar votante");
                    System.out.println("3. Reiniciar contraseña de votante");
                    System.out.println("4. Registrar fallecimiento de votante");
                    System.out.println("Ingrese una opción:");
                    int opcionVotante = scanner.nextInt();

                    switch (opcionVotante) {
                        case 1:
                            System.out.println("REGISTRO DE VOTANTES");
                            System.out.println("_____________________");
                            System.out.println("Ingrese la edad del votante:");
                            int edadVotante = scanner.nextInt();
                            if (edadVotante > 17) {
                                System.out.println("Ingrese el primer nombre:");
                                String nombre1Votante = scanner.nextLine();
                                System.out.println("Ingrese el segundo nombre:");
                                String nombre2Votante = scanner.nextLine();
                                System.out.println("Ingrese el primer apellido:");
                                String apellido1Votante = scanner.nextLine();
                                System.out.println("Ingrese el segundo apellido:");
                                String apellido2Votante = scanner.nextLine();
                                System.out.println("Ingrese el CUI:");
                                String cui = scanner.nextLine();
                                System.out.println("Ingrese el sexo:");
                                String sexo = scanner.nextLine();
                                System.out.println("Ingrese la fecha de nacimiento:");
                                String fechaNac = scanner.nextLine();
                                System.out.println("Ingrese la dirección de residencia:");
                                String direccion = scanner.nextLine();
                                System.out.println("Ingrese el departamento de residencia:");
                                String departamento = scanner.nextLine();
                                System.out.println("Ingrese el municipio de residencia:");
                                String municipio = scanner.nextLine();
                                System.out.println("Ingrese el país de residencia:");
                                String pais = scanner.nextLine();
                            }
                            break;

                        case 2:
                            System.out.println("Modificar el votante");
                            break;

                        case 3:
                            System.out.println("Reinicio de contraseña");
                            System.out.println("Ingrese el correo del votante para reiniciar su contraseña:");
                            String correoContraVotante = scanner.nextLine();
                            break;

                        case 4:
                            System.out.println("Registrar el fallecimiento del votante");
                            System.out.println("Ingrese el nombre completo:");
                            String nombreFallecimiento = scanner.nextLine();
                            System.out.println("Ingrese la fecha de fallecimiento:");
                            String fechaFallecimiento = scanner.nextLine();
                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Administrador de Elecciones");
                    System.out.println("________________________________");
                    System.out.println("1. Gestionar Elecciones");
                    System.out.println("2. Gestionar Candidatos");
                    System.out.println("3. Configurar opciones de Elección");
                    System.out.println("Ingrese una opción:");
                    int opcionElecciones = scanner.nextInt();

                    switch (opcionElecciones) {
                        case 1:
                            System.out.println("Gestionar Eleccion");
                            System.out.println("________________________");
                            System.out.println("Cree una elección");
                            System.out.println("_______________________________");
                            System.out.println("Ingrese el título de la elección:");
                            String nombreEleccion = scanner.nextLine();
                            System.out.println("Ingrese el propósito de la elección:");
                            String propositoEleccion = scanner.nextLine();
                            System.out.println("Ingrese la descripción de la elección:");
                            String descripcionEleccion = scanner.nextLine();
                            System.out.println("Ingrese un código único para esta elección:");
                            String codigoEleccion = scanner.nextLine();
                            System.out.println("Ingrese el tiempo de duración de la elección:");
                            System.out.println("Ingrese hora de inicio:");
                            String horaInicio = scanner.nextLine();
                            System.out.println("Ingrese hora de finalización:");
                            String horaFinal = scanner.nextLine();
                            break;

                        case 2:
                            System.out.println("BIENVENIDO AL MENÚ DE GESTIÓN DE CANDIDATOS");
                            System.out.println("1. Gestionar candidato");
                            System.out.println("2. Agregar información a candidato");
                            System.out.println("3. Modificar información de candidato");
                            System.out.println("4. Eliminar candidato");
                            System.out.println("Seleccione una opción:");
                            int opcionCandidatos = scanner.nextInt();
                            break;

                        case 3:
                            System.out.println("Configurar candidato para la elección");
                            System.out.println("Ingrese el código de la elección a configurar:");
                            String codigoConfigurar = scanner.nextLine();
                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Ingreso al Sistema");
                    System.out.println("_________________________");
                    System.out.println("Ingrese su correo electrónico:");
                    String correoIngreso = scanner.nextLine();
                    System.out.println("Ingrese su contraseña:");
                    String contraseniaIngreso = scanner.nextLine();
                    if (contraseniaIngreso.equals(contrasenia)) {
                        System.out.println("Ingrese su CUI:");
                        String cuiIngreso = scanner.nextLine();
                        System.out.println("Ejecución de Elección");
                        System.out.println("___________________________");
                        System.out.println("Elecciones activas");
                        System.out.println("1. Elección uno");
                        System.out.println("2. Elección dos");
                        System.out.println("3. Elección tres");
                        System.out.println("Ingrese una opción:");
                        int opcionEjecucion = scanner.nextInt();
                        System.out.println("¿Está seguro de la opción elegida? (Ingrese 1 para sí, y 2 para no):");
                        int seguroEjecucion = scanner.nextInt();
                        while (seguroEjecucion == 2) {
                            System.out.println("Seleccione una elección:");
                            System.out.println("Elecciones activas");
                            System.out.println("1. Elección uno");
                            System.out.println("2. Elección dos");
                            System.out.println("3. Elección tres");
                            System.out.println("Ingrese una opción:");
                            seguroEjecucion = scanner.nextInt();
                        }
                        System.out.println("Gracias por participar en estas elecciones");
                        System.out.println("Sesión finalizada");
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                    break;

                case 5:
                    System.out.println("Menú Conteo de Votos");
                    System.out.println("________________________");
                    System.out.println("Esta opción es solo para administradores y auditores");
                    System.out.println("Ingrese contraseña de administrador:");
                    String contraConteo = scanner.nextLine();
                    if (contraConteo.equals(contrasenia)) {
                        System.out.println("1. Conteo General");
                        System.out.println("2. Votos emitidos por sexo");
                        System.out.println("3. Votos por ubicación geográfica");
                        System.out.println("4. Reporte maestro");
                        System.out.println("Ingrese una opción:");
                        int opcionVotos = scanner.nextInt();

                        switch (opcionVotos) {
                            case 1:
                                System.out.println("El total de votos emitidos para cada candidato son:");
                                System.out.println("El total de votos emitidos son:");
                                break;

                            case 2:
                                System.out.println("El total de votos emitidos por el sexo masculino son");
                                System.out.println("Y el porcentaje total es:");
                                System.out.println("El total de votos emitidos por el sexo femenino son");
                                System.out.println("Y el porcentaje total es:");
                                break;

                            case 3:
                                System.out.println("El total de votos emitidos en el país es:");
                                System.out.println("Ingrese el departamento que desea saber el total de votos:");
                                String departVotos = scanner.nextLine();
                                System.out.println("Ingrese el municipio que desea saber el total de votos:");
                                String municipioVotos = scanner.nextLine();
                                break;

                            case 4:
                                System.out.println("Reporte Maestro");
                                System.out.println("Votos totales por candidatos");
                                System.out.println("Ingrese el nombre de la elección:");
                                String eleccion = scanner.nextLine();
                                System.out.println("El total de votos de este candidato es:");
                                break;

                            default:
                                System.out.println("Ingrese una opción válida");
                                break;
                        }
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }
}

       
 
   
