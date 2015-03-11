package src.InputOutput.Input;

/* El Controlador superior */
import src.InputOutput.ControlerInputOutput;

/* Els sub Controladors */
import src.InputOutput.Input.Key.ControlerKey;

public class ControlerInput
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInputOutput	up;
	private ControlerKey		key;
	private Command			cmd;

	public ControlerInput (ControlerInputOutput e)
	{
		System.out.println ("ControlerInput, no mira fitxers, ni navega, ni fa commandes,");
		up	= e;
		key	= new ControlerKey (this);
		cmd	= new Command (this);
	}

	public void Error (String e) { up.Error (e); }
	public void ReadKey () { key.Read (); }
	public void Char (char e) { cmd.Char (e); }
//	public void Qquit () { key.False (); }
}
