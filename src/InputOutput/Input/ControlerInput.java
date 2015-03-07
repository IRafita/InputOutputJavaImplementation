package src.InputOutput.Input;

/* El Controlador superior */
import src.InputOutput.ControlerInputOutput;

/* Els sub Controladors */
//impor

public class ControlerInput
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInputOutput up;

	public ControlerInput (ControlerInputOutput e)
	{
		System.out.println ("ControlerInput, no mira fitxers, ni navega, ni fa commandes, i tampoc teclat");
		up = e;
	}
}
