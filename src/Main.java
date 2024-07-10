import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*1. Pide un nombre por teclado y haz que te salude.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre : ");
        String nombre = sc.nextLine();
        System.out.println("Hola "+ nombre);*/


        /*2. Pide el precio de un producto sin IVA y calcula su precio con IVA.
        El IVA es del 21%. Formatea el resultado para q c muestre con dos decimales.

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio del producto :");
        int valor = sc.nextInt();
        System.out.println("el valor del producto es :" + valor + "y el valor con iva es :"+ (valor * 1.21)); */

        /*3. Pide dos números por teclado e indica si el segundo es divisible por el primero Por ejemplo,
        si numero1 = 10 y numero2 = 5 debería mostrar: "El numero 5 es divisible de 10"
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero :");
        int num1 = sc.nextInt();
        System.out.println("ingrese el segundo numero :");
        int num2 = sc.nextInt();
        if(num1 % num2 ==0)
        {
            System.out.println("el numero :" +num2 + " es divisible entre " + num1);
        }else {
            System.out.println("el numero " +num2 + " NO ES divisible entre " +num1);
        }*/

        /*4. Pide un año por teclado e indica si es bisiesto o no.
        Un año es bisiesto cuando es divisible entre 4 y no divisible por 100 o es divisible por 400.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año : ");
        int ano = sc.nextInt();
        if(ano % 4 == 0 && ano % 100 !=0 || ano % 400 ==0)
        {
            System.out.println("el año :" +ano + "es bisiesto");
        }
        else
        {
            System.out.println("el año "+ ano + " no es bisiesto");
        }*/

        /*5. Pide 3 números por teclado e indica cual es el mayor.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer valor :");
        int num1 = sc.nextInt();
        System.out.println("ingrese el segundo valor :");
        int num2 = sc.nextInt();
        System.out.println("ingrese el tarcer valor :");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println("el numero mayor es el :" + num1);
        }else if(num2 >= num3)
        {
            System.out.println("el numero mayor es : "+ num2);
        }else {
            System.out.println("el numero mayor es :" +num3);
        }*/

        /*6. Pide 2 operandos, un operador (+ - * /) y realiza la operación correspondiente.
        Si el operador es invalido o el 2º operando es 0 en el caso de la división,
        debes indicar que no se puede realizar la operación.
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        sc.useDelimiter("\n");

        System.out.println("introduce el valor 1");
        double operando1 = sc.nextDouble();
        System.out.println("ingrese el operando + , -, *, /");
        String operando = sc.nextLine();
        System.out.println("introduce el valor 2");
        double operando2 = sc.nextDouble();
        double resultado=0;
        boolean correcto = true;

        switch(operando)
        {
            case "+" -> resultado = operando1 + operando2;
            case "-" -> resultado = operando1 - operando2;
            case "*" -> resultado = operando1 * operando2;
            case "/" -> {
                            if(operando2 !=0)
                            {
                                resultado = operando1 / operando2;
                            }
                            else
                            {
                                System.out.println("no se puede dividir entre 0");
                                correcto = false;
                            }
                        }
            default -> {
                System.out.println("el operador no es correcto");
                       }
        }
        if(correcto)
        {
            System.out.println("el resultado es : " + resultado);
        }*/

        /*7. Mostrar la suma de los números hasta que el usuario introduzca un -1.
        Scanner sc = new Scanner(System.in);
        int numero =0;
        int suma =0;
        while(numero != -1)
        {
            suma = suma + numero;
            System.out.println("introduce un numero , y -1 para acabar");
            numero = sc.nextInt();
        }
        System.out.println("la suma es : " + suma);*/

        /*8. Muestra los números del 1 al 100 que sean divisibles entre 2 y 3.
        System.out.println("numeros del 1 al 100 divisbles entre 2 y 3");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0 && i % 3 == 0)

                System.out.println("numeros : " + i);
        }*/


        /*9. Pide un numero por teclado y muestra su tabla de multiplicar hasta 10.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero :");
        int numero = sc.nextInt();
        System.out.println("numero elejido : " +numero);
        for(int i =0; i <= 10; i++)
        {
            int resultado = numero *i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }*/

        /*10. Pide un numero por teclado y valida que sea positivo.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero :");
        int numero = sc.nextInt();
        if(numero < 0)
        {
            System.out.println("el numero es negativo");
        }
        else
        {
            System.out.println("el numero es positivo");
        }*/

        /*11. Pide una frase por teclado y cuenta cuentas vocales tiene.
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca una palabara :");
        String palabra = sc.nextLine().toLowerCase();
        int cont=0;
        char caracter;
        for(int i =0; i < palabra.length(); i++)
        {
            caracter = palabra.charAt(i);

            switch(caracter)
            {
                case 'a', 'e', 'i', 'o', 'u' -> cont++;
            }
        }
        System.out.println("hay "+ cont + " vocales");*/



        //12. Pide una frase por teclado y cuenta cuantas mayúsculas y minúsculas hay.

        //13. Pide una frase por teclado, elimina los espacios y guardarlos en otra variable.

    }
}