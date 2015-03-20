package src.System.Modes.Command;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

public class CommandWriteTyped
{
/* Els objectes que necessito per aquesta classe */
	private ControlerModes	up;

	public CommandWriteTyped (ControlerModes e)
	{
		System.out.println ("CommandWriteTyped: Inicialitzant les commandes digits");
		up	= e;
	}

/* Comenzo a dubtar si aixo ha d'estar aqui :) */
	public void Char (char e)
	{
		System.out.println ("llegit: " + (int) e + "\t->\t" + e);
		if (e != 'q')
			up.WriteTypedKey ();
	}
}
