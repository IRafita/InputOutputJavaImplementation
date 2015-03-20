package src.System.Modes.Command;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

public class CommandNormal
{
/* Els objectes que necessito per aquesta classe */
	private ControlerModes		up;
	private CommandWriteTyped	WT;

	public CommandNormal (ControlerModes e)
	{
		System.out.println ("CommandNormal: Inicialitzant les commandes normals");
		up		= e;
		WT		= new CommandWriteTyped (e);
	}

/* Comenzo a dubtar si aixo ha d'estar aqui :) */
	public void Char (char e)
	{
		System.out.println ("llegit: " + (int) e);
		switch (e)
		{
		case 'c':
			switch (up.ReadKey ())
			{
			case 'd': //digit
				WT.Char (up.ReadKey ());
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
