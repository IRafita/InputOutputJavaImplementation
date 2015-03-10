package src.InputOutput.Input;

public class Command
{
/* Els objectes que necessito per aquesta classe */
	private ControlerInput up;

	public Command (ControlerInput e)
	{
		System.out.println ("Command: Inicialitzant les commandes");
		up = e;
	}

	public void Char (char e)
	{
		System.out.println ("llegit: " + e);
		switch (e)
		{
		case 'q':
			up.Qquit ();
			break;
		}
	}
}
