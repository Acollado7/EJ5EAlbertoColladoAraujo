package supermercado;



//Creamos una clase record que podremos reutilizar, la clase record la usamos para no tener que crear contructores, getter setter, etc
public record Producto (String nombre, double precio, int cantidad, double iva) {
}

