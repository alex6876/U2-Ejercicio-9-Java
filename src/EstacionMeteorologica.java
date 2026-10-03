public class EstacionMeteorologica {
    Sensor sensorTemperatura;
    Sensor sensorHumedad;
    Sensor sensorPresion;

    public EstacionMeteorologica(Sensor sensorTemperatura, Sensor sensorHumedad, Sensor sensorPresion)
    {
        this.sensorTemperatura = sensorTemperatura;
        this.sensorHumedad = sensorHumedad;
        this.sensorPresion = sensorPresion;
    }

    public void generarReporteClimatico(){
        System.out.println("Temperatura: "+sensorTemperatura.obtenerLectura());
        System.out.println("Humedad: "+sensorHumedad.obtenerLectura());
        System.out.println("Presion: "+sensorPresion.obtenerLectura());

    }

}
