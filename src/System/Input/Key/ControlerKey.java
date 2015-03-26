package src.System.Input.Key;

/* El Controlador superior */
import src.System.Input.ControlerInput;

public class ControlerKey
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInput	up;
	private ReadKey		key;

	public ControlerKey (ControlerInput e)
	{
		up	= e;
		key	= new ReadKey (this);
	}

	public void Error (String e) { up.Error (e); }
	public char Read () { return key.Read (); }
}
