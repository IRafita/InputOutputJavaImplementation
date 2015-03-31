package src.System.Input.File;

/* El Controlador superior */
import src.System.Input.InicialitzadorInput;

public class ControlerFile
{
/* Els objectes que necessito per aquest controlador */
	private InicialitzadorInput	up;
	private ReadFile		file;

	public ControlerFile (InicialitzadorInput e)
	{
		System.out.println ("ControlerFile: Te pinta de facil");
		up	= e;
		file	= new ReadFile ();
	}
}
