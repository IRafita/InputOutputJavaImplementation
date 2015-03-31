package src.System.Modes.Command;

/* El Controlador superior */
import src.System.Modes.InicialitzadorModes;

public class NormalCommand
{
/* Els objectes que necessito per aquesta classe */
	private InicialitzadorModes		up;

	public NormalCommand (InicialitzadorModes e)
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
