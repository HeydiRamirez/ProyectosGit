package clase;
import java.io.*;

import excepciones.ZapatoExcepciones;
/**Clase Zapato.java
 * @author Heydi Ramírez Cortés
 * 21/08/15
 * Funcionalidad de Clase Zapato.
 * La Clase Zapato es la responsable de crear toda las características del manejo Zapato
 * y las validaciones correspondientes de cada característica.
 *  Última actualización 04/09/2015
 */
public class Zapato implements Serializable {	
	private static final long serialVersionUID = 1L;
	private char  sexo;
	private String marca;
	private String modelo;
	private String tipoZapato;
	private boolean otrosTipos;
	private boolean otrosTipos2;
	private boolean otrosTipos3;
	private boolean otrosTipos4;
	private float precio;
	private String color;
	private String talla;
	private String descripcion;

	//Constructor Vacío con cada caracterítica reciben valor por default
	public Zapato() {
		sexo = 'M';
		marca = "Andrea";
		modelo = "MA23DE";
		color = "Rojo";
		tipoZapato = "Sandalia";
		precio = 200.0f;
		color = "Rojo";
		talla = "23";
		descripcion = "Sandalia de mujer, con detalles de rosas";
	}
	
	//CREACION DE GETTERS Y SETTERS
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char lbSexo) {
		this.sexo = lbSexo;				
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String lbMarca) throws ZapatoExcepciones {
		if (lbMarca.trim().isEmpty()) {
			//Mandar excepción si se encuentra vacío
			throw new ZapatoExcepciones(ZapatoExcepciones.MARCA);
		} else {
			this.marca = lbMarca;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String lbModelo) throws ZapatoExcepciones {
		if (lbModelo.trim().isEmpty()) {
			//Mandar excepción si se encuentra vacío
			throw new ZapatoExcepciones(ZapatoExcepciones.MODELO);
		} else {
			this.modelo = lbModelo;	
		}
	}

	public String getTipoZapato() {
		return tipoZapato;
	}

	public void setTipoZapato(String lbTipoZapato) {
		this.tipoZapato = lbTipoZapato;
	}

	public boolean isOtrosTipos2() {
		return otrosTipos2;
	}

	public void setOtrosTipos2(boolean lbOtrosTipos2) {
		this.otrosTipos2 = lbOtrosTipos2;
	}

	public boolean isOtrosTipos() {
		return otrosTipos;
	}

	public void setOtrosTipos(boolean lbOtrosTipos) {
		this.otrosTipos = lbOtrosTipos;
	}

	public boolean isOtrosTipos3() {
		return otrosTipos3;
	}

	public void setOtrosTipos3(boolean lbOtrosTipos3) {
		this.otrosTipos3 = lbOtrosTipos3;
	}

	public boolean isOtrosTipos4() {
		return otrosTipos4;
	}

	public void setOtrosTipos4(boolean lbOtrosTipos4) {
		this.otrosTipos4 = lbOtrosTipos4;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float lbPrecio) {
		this.precio = lbPrecio;
	}

	public void setPrecio(String precio) throws ZapatoExcepciones {
		if (precio.trim().isEmpty()) {
			//Mandar excepción si se encuentra vacío
			throw new ZapatoExcepciones(ZapatoExcepciones.PRECIO);
		} 
		if (!precio.matches("([0-9]{2,7}|[0-9]{2,7}.[0-9]{1,2})")) {
			//Mandar excepción si no se encuentra en el formato
			throw new ZapatoExcepciones(ZapatoExcepciones.PRECIO_FORMATO);
		}
		try {
			float valor;		
			valor = Float.parseFloat(precio);
			setPrecio(valor);
		} catch (NumberFormatException e) {
			//Mandar excepción si no es un formato numérico
			throw new ZapatoExcepciones(ZapatoExcepciones.PRECIO_FORMATO);
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String lbColor) {
		this.color = lbColor;	
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String lbTalla) {
		this.talla = lbTalla;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Nombre método: toString 
	 * Funcionalidad: El método toString se encargará de recibir los get's() que se mostrará en 
	 * el combo Zapato.
	 */
	public String toString() {
		return "Para: " + getSexo() + ", " + "Marca: " + getMarca() + ", " + "Modelo: " +getModelo();
	}
}
