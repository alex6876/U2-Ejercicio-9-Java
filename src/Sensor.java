public class Sensor {
    String tipo;

    public Sensor(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerLectura(){
        return Math.random() * 100;

    }

}
