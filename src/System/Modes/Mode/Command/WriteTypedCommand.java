package src.System.Modes.Mode.Command;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

/**
  * Classe que no necessita res mes que poder imprimir per pantalla
  */
public class WriteTypedCommand
{
/* Els objectes que necessito per aquesta classe */
	private ControlerModes	up;

	public WriteTypedCommand (ControlerModes e)
	{
		System.out.println ("CommandWriteTyped: Inicialitzant les commandes digits");
		up	= e;
	}

/* Comenzo a dubtar si aixo ha d'estar aqui :) */
	public void Char ()
	{
		char e = up.ReadKey ();
		up.ShowWindows ("llegit: " + (int) e + "\t->\t" + e);
		switch (e)
		{
		case 'c':
			switch (up.ReadKey ())
			{
			case 'n': //normal
				up.NormalNormalKey ();
			}
			e = 'q';
		}
		if (e != 'q')
			up.WriteTypedKey ();
	}
}
