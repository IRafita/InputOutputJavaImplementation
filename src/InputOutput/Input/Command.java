package src.InputOutput.Input;

public class Command
{
/* Els objectes que necessito per aquesta classe */
	private ControlerInput	up;
	private boolean		keyVSfile;
	private String		menu;

	public Command (ControlerInput e)
	{
		System.out.println ("Command: Inicialitzant les commandes");
		up		= e;
		keyVSfile	= true;
		menu		= "normalKey";
	}

/* Comenzo a dubtar si aixo ha d'estar aqui :) */
	public void Char (char e)
	{
		System.out.println ("llegit: " + (int) e + "\t->\t" + e);
		switch (menu)
		{
		case "normalKey":
			if (e != 'q')
				MenuStateNormalKey (e);
			break;
		default:
//			if (keyVSfile) // Per saber qui controla, ara dubto de si fer-ho aqui o al controlador...
//				up.ReadKey (); // por algo se llamara controlador nops?
			break;
		}
	}

/* Metodes propis per aquest objecte */
	private void MenuStateNormalKey (char e)
	{
		up.ReadKey ();
	}
}
