public class ejTema4 {

public static void main(String[] args) {

    // Ejercicio 1

    System.out.println("Ejercicio 1 \n");

    var numeroIf = 5;

    if(numeroIf > 0) {
        System.out.println("Es positivo");
    } else if (numeroIf < 0) {
        System.out.println("Es negativo");
    } else {
        System.out.println("Es 0");
    }

    // Ejercicio 2

    System.out.println("\n Ejercicio 2 \n");

    var numeroWhile = 0;

    while(numeroWhile < 3) {
        System.out.println("El valor de numeroWhile es " + numeroWhile);
        numeroWhile++;
    }

    //Ejercicio 3

    System.out.println("\n Ejercicio 3 \n");

    var numeroDoWhile = 0;

    do {
        System.out.println("El valor de numeroDoWhile es " + numeroDoWhile);
        numeroDoWhile++;
    } while(numeroDoWhile < 1);

    //Ejercicio 4

    System.out.println("\n Ejercicio 4 \n");

    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
        System.out.println("El valor de numeroFor es " + numeroFor);
    }

    //Ejercicio 5

    System.out.println("\n Ejercicio 5 \n");

    var estacion = "primavera";

    switch(estacion){
        case "verano":
            System.out.println("Es Verano");
            break;
        case "inverno":
            System.out.println("Es Invierno");
            break;
        case "otono":
            System.out.println("Es Otono");
            break;
        case "primavera":
            System.out.println("Es Primavera");
            break;
        default:
            System.out.println("Debe ingresar una estacion.");
    }
    }
}


