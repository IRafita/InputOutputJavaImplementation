package src.System.Modes.Type;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

public class Normal
{
/* Els objectes que necessito per aquest mode */
	ControlerModes up;

	public Normal (ControlerModes e)
	{
		System.out.println ("Normal: nomes per comprovar que puc fer anar-ho tot des d'aqui");
		up = e;
	}

	public void Ximplet ()
	{
	char e;
	while (true)
	{
		e = up.ReadKey	();
		up.ShowWindows	("llegit: " + (int)e + "\t" + e);
		if (e == 'q')
			break;
	}
	}
}
