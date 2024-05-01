import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion en java");
                //System.out.println("Pelicula Matrix");

                /*Tipos de datos primitivos:
                * "int" tipo de dato entero
                * "double" y "float, este se limita en decimales" tipos de datos con decimales
                * "boolean" tipo de dato false y true
                * "String" es una clase pero se puede utilizar como una variable
                *  */


                //Declaracion de variables
                int fechaDeLanzamiento = 1999;
                double evaluacion = 4.5;
                boolean incluidoEnElPlanBasico = true;
                String nombre = "Matrix";
                //Bloque de texto en una linea
                String sinopsis = """
                        La mejor pelicula del fin del milenio
                        """;
                double mediaEvaluacionesUsuario = 0;


                //("pelicula: " + nombre) = A esto se le conoce como concatenacion
                System.out.println("Pelicula: " + nombre);
                System.out.println("Fecha De Lanzamiento: " + fechaDeLanzamiento);
                System.out.println("Calificacion: " + evaluacion);
                System.out.println("Tipos de datos: " + incluidoEnElPlanBasico);
                System.out.println("Sinopsis: " + sinopsis);

                double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
                System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

                //Estructura de decision
                if (fechaDeLanzamiento < 2023){
                    System.out.println("Pelicula popular del momento");
                } else {
                    System.out.println("Pelicula retro que vale la pena ver");
                }

                //Ciclo de repeticion
                for (int i = 0; i < 3; i++) {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Ingresa la nota o evaluacion que le darias a Matrix: ");
                    double notaMatrix = teclado.nextDouble();
                    mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaMatrix;
                }
                System.out.println("La media de la pelicula " +
                        "Matrix calculada por el usuario es: " + mediaEvaluacionesUsuario/3);
            }
        }