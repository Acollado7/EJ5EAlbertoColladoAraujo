package supermercado;

public enum Iva {
    //La clase va a tener diferentes tipos de IVA, del 4%, 10% y 21%
    //Por lo cual creamos una clase Enum para que nos permita tener los diferentes tipos de IVA

    //Creamos los diferentes tipos de IVA
    IVA4(4),
    IVA10(10),
    IVA21(21);

    //Creamos un atributo privado para que no se pueda modificar
    private final double valor;

    //Creamos un constructor para que no se pueda modificar

    private Iva(double valor) {
        this.valor = valor;
    }

    //Creamos un método para que nos devuelva el valor del IVA

    public double getValor() {
        return valor;
    }



}
