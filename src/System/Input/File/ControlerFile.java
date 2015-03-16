package src.System.Input.File;

/* El Controlador superior */
import src.System.Input.ControlerInput;

public class ControlerFile
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInput	up;
	private ReadFile	file;

	public ControlerFile (ControlerInput e)
	{
		System.out.println ("ControlerFile: Te pinta de facil");
		up	= e;
		file	= new ReadFile ();
	}
}
