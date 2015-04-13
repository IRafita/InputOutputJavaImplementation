package src.System.Input.Key;

/* El Controlador superior */
import src.System.Input.InicialitzadorInput;

public class ControlerKey
{
/* Els objectes que necessito per aquest controlador */
	private InicialitzadorInput	up;
	private ReadKey			key;

	public ControlerKey (ReadKey e)
	{
		key	= e;
	}

//	public void Error (String e) { up.Error (e); }
	public char Read () { return key.Read (); }
}
