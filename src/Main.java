public class Main {
    public static void main(String[] args) {
        Sensor sensorTemperatura = new Sensor("Temperatura");
        Sensor sensorHumedad = new Sensor("Humedad");
        Sensor sensorPresion = new Sensor("Presion");

        EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica(
                sensorTemperatura, sensorHumedad, sensorPresion);


        estacionMeteorologica.generarReporteClimatico();
    }
}