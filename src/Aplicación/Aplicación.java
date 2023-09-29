package Aplicación;

import Logica.Peon;
import Logica.Rey;
import Logica.Torre;
import uniandes.dpoo.taller2.modelo.Restaurante;

public class Aplicación {
	public static void main(String[] args) {
		ejecutarAplicacion();
	}

	private static void ejecutarAplicacion() {
		Peon peon1= new Peon("11");
		Rey rey= new Rey("00");
		System.out.println("Aplicaión");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					System.out.println(peon1.calcularCasillas());
				else if (opcion_seleccionada == 2)
					System.out.println(rey.calcularCasillas());

		
		
	}
}
