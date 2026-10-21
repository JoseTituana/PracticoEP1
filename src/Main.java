public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo(1, "Sensor A");

        System.out.println("Consultar resumen: " + d1.obtenerResumen());
        System.out.println("Desactivar dispositivo: " + d1.desactivar());
        System.out.println("Desactivarlo nuevamente: " + d1.desactivar());

        d1.setNombre("");
        System.out.println("Cambiar nombre a \"\": " + d1.getNombre());

        try { new Dispositivo(-1, "Malo"); } catch (Exception e) { System.out.println("Error atrapado: " + e.getMessage()); }
        try { new Dispositivo(2, ""); } catch (Exception e) { System.out.println("Error atrapado: " + e.getMessage()); }

        new Dispositivo(2, "Sensor B");
        new Dispositivo(3, "Sensor C");
        System.out.println("Contador total de dispositivos creados: " + Dispositivo.getContadorDispositivos());
    }
}