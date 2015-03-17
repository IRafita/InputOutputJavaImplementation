package src;

/* Els objectes que farem anar */
import src.System.ControlerSystem;

/**
  * Tronc principal de tot el programa
  *
  * Comunica basicament de Entrada Sortida als objectes que faran totes les operacions desitjades
  */
public class ControlerCentral
{
/* Els objectes que necessito per aquest controlador */
	private ControlerSystem system;

/**
  * Inicialitza tot el sistema
  */
	public ControlerCentral ()
	{
		System.out.println ("ControlerCentral: Sistema arrancant");
		system = new ControlerSystem (this);
		System.out.println ("ControlerCentral: Adeu, Ja ha finalitzat");
	}

	public void Begin () { system.Tst (); }// no pot ser el nom de Begin...
}
