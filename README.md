# 🌤️ Simulación de Estación Meteorológica (POO en Java)

Este proyecto es una aplicación en Java que modela el funcionamiento de una estación meteorológica. Muestra cómo coordinar múltiples componentes independientes (sensores) para simular la recolección de lecturas aleatorias y la generación de un informe de clima en tiempo de ejecución.

---

## 🧩 Clases y Estructura del Sistema

El sistema está organizado en 3 clases principales:

*   **`Sensor`**: Modela un dispositivo de medición específico.
    *   **Atributos:** `tipo` (ej. "Temperatura", "Humedad", "Presion").
    *   **Métodos:** `obtenerLectura()`, utiliza `Math.random()` para generar y retornar un valor numérico aleatorio en un rango de 0.0 a 100.0.
*   **`EstacionMeteorologica`**: Representa la central de monitoreo.
    *   **Atributos de Composición:** Mantiene las referencias de tres objetos `Sensor` distintos (`sensorTemperatura`, `sensorHumedad`, `sensorPresion`).
    *   **Métodos:** `generarReporteClimatico()`, consulta la lectura actual de cada sensor e imprime el reporte consolidado por pantalla.
*   **`Main`**: Instancia los tres sensores requeridos, los pasa como argumentos al constructor de la estación meteorológica y solicita la emisión del reporte.

---

## ⚙️ Flujo de Operación

1. **Instanciación y Composición:** Se crean tres objetos de tipo `Sensor` configurando su tipo. Luego, se pasan al constructor de `EstacionMeteorologica` mediante **inyección de dependencias**.
2. **Consulta en Tiempo Real:** Al invocar `generarReporteClimatico()`, la estación delega la medición a cada sensor ejecutando su método `obtenerLectura()`.
3. **Simulación de Datos:** Cada invocación al método del sensor genera un nuevo valor dinámico no persistido.

---

## 💻 Ejemplo de Salida por Consola

Al ejecutar la clase `Main`, el programa genera un reporte con valores aleatorios como el siguiente:

```text
Temperatura: 48.21983058864039
Humedad: 82.51037592471802
Presion: 12.084795301824712
