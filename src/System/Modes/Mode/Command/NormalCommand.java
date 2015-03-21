package src.System.Modes.Mode.Command;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

public class NormalCommand
{
/* Els objectes que necessito per aquesta classe */
	private ControlerModes		up;

	public NormalCommand (ControlerModes e)
	{
		System.out.println ("CommandNormal: Inicialitzant les commandes normals");
		up		= e;
	}

/* Comenzo a dubtar si aixo ha d'estar aqui :) */
	public void Char ()
	{
		char e = up.ReadKey ();
		up.ShowWindows ("llegit: " + (int) e);
		switch (e)
		{
		case 'c':
			switch (up.ReadKey ())
			{
			case 'd': //digit
				up.WriteTypedKey ();
				e = 'q';
				break;
			default: break;
			}
			break;
		default: break;
		}

		Next (e);
	}

	private void Next (char e)
	{
		if (e != 'q')
			up.NormalNormalKey ();
	}
}
