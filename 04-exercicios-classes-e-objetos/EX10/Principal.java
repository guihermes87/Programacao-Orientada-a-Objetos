public class Principal {

    public static void main(String[] args) {
        Time time1 = new Time("Time A");
        Time time2 = new Time("Time B");

        time1.marcarGol();
        time1.marcarGol();
        time1.sofrerGol();

        time2.marcarGol();
        time2.sofrerGol();
        time2.sofrerGol();

        System.out.println(time1.resultadoPartida()); // Saída: Vitória
        System.out.println(time2.resultadoPartida()); // Saída: Derrota
    }

}
