package proyecto.compiladores;

public class texto {
String texto;

public texto(String texto) {
	this.texto=texto;
}

public void imprimir(){
	Area_de_trabajo tr = new Area_de_trabajo();
	tr.gettext();
	System.out.print(texto);
	}
}
