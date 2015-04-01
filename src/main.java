package src;

// centralControler
import src.Intermedia.InicialitzadorIntermedia;

/**
  * Part necessaria i inutil :)
  */
public class main
{
	public static void main (String [] args)
	{
		InicialitzadorCentral lola	= new InicialitzadorCentral	();
		lola.Begin ();
		lola.Inicialitzar						();
		InicialitzadorIntermedia loli	= lola.Kill			();
		loli.Begin							();
	}
}
