public class ejTema3 {

public static void main(String[] args) {
    int param1 = 10;
    int param2 = 30;
    int param3 = 50;

    suma(param1, param2, param3);

    Coche nuevoCoche = new Coche();
    nuevoCoche.sumaPuertas();
    nuevoCoche.sumaPuertas();
    nuevoCoche.sumaPuertas();
    nuevoCoche.sumaPuertas();
    System.out.println(nuevoCoche.cantPuertas);
}
public static void suma(int a, int b, int c) {
    System.out.println(a + b + c);
}

static class Coche{
    public int cantPuertas = 0;

    public void sumaPuertas() {
    this.cantPuertas++;
    }
}
}


