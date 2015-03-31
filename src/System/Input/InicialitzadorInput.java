package src.System.Input;

/* El Controlador superior */
import src.System.InicialitzadorSystem;

/* Els sub Controladors */
import src.System.Input.Key.ControlerKey;
import src.System.Input.File.ControlerFile;

public class InicialitzadorInput
{
/* Els objectes que necessito per aquest controlador */
	private InicialitzadorSystem	up;
	private ControlerKey		key;
	private ControlerFile		file;

	public InicialitzadorInput (InicialitzadorSystem e)
	{
		System.out.println ("ControlerInput: en breus sera 100% funcional 'breu notequal ara'.");
		up	= e;
		key	= new ControlerKey 	(this);
		file	= new ControlerFile	(this);
	}

	public void Error (String e) {}// up.Error (e); }
	public char ReadKey () { return key.Read (); }
}
