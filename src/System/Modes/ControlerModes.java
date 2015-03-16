package src.System.Modes;

/* El Controlador superior */
import src.System.ControlerSystem;

public class ControlerModes
{
/* Els objectes que necessito per aquest controlador */
	private ControlerSystem	up;

	public ControlerModes (ControlerSystem e)
	{
		System.out.println ("Controler Modes: No fa RES");
		up	= e;
	}
}
