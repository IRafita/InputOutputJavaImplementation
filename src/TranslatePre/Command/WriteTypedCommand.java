package src.System.Modes.Command;

/* El Controlador superior */
import src.System.Modes.InicialitzadorModes;

/**
  * Classe que no necessita res mes que poder imprimir per pantalla
  */
public class WriteTypedCommand
{
/* Els objectes que necessito per aquesta classe */
	private InicialitzadorModes	up;

	public WriteTypedCommand (InicialitzadorModes e)
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
		}
		if (e != 'q')
			up.WriteTypedKey ();
	}
}
