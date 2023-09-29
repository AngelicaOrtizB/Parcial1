package Logica;

import java.util.List;
import java.util.Map;

public class Peon{
	public String Ubicación;
	
	public Peon(String ubicacion) {
		this.Ubicación= Ubicación;

	}
	public String calcularCasillas()
	{	
		Ubicación= this.Ubicación;
		String delCas= "";
		String ubini= "13";
		String ubini2= "11";
		String ubini3= "16";
		if (Ubicación== ubini || Ubicación== ubini2 ||Ubicación== ubini3)
		{
			delCas= "2 casllas al frente";
		}
		else {
			delCas="1 casilla al frente";
		}
		return delCas;
		}
	
}

