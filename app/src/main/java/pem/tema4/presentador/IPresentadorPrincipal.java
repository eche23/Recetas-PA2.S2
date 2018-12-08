package pem.tema4.presentador;

public interface IPresentadorPrincipal {
	
	// TODO A�adir el m�todo obtenerDatos() de tipo void que solicita los datos de la lista maestro al modelo.
    void obtenerDatos();

	// TODO A�adir el m�todo obtenerDetalles() que recupera los datos de una receta dada su posici�n
	// en la lista maestro.
    void obtenerDetalle(int posicion);

	// TODO A�adir el m�todo tratarAgregar() que lanza la vista de agregaci�n por medio del mediador.
    void tratarAgregar();

}
