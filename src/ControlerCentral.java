package src;

/* Els objectes que farem anar */
import src.InputOutput.ControlerInputOutput;

/**
  * Tronc principal de tot el programa
  *
  * Comunica basicament de Entrada Sortida als objectes que faran totes les operacions desitjades
  */
public class ControlerCentral
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInputOutput inputOutput;

/**
  * Inicialitza tot el sistema
  */
	public ControlerCentral ()
	{
		System.out.println ("Sistema arrancant");
		inputOutput = new ControlerInputOutput (this);
		System.out.println ("Adeu, Ja ha finalitzat");
	}
}
