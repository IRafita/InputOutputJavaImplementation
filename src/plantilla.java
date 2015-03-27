package src;

/* El Controlador superior */
import src.System.ControlerSystem;

/* Els sub Controladors */
import src.System.Input.Key.ControlerKey;
import src.System.Input.File.ControlerFile;

/**
  * Plantilla per ajudar-me a fer codi amb un cert ordre, copiat de ControlerInput el 27-3-2015 a les 0:50
  */
public class plantilla
{
/* Els objectes que necessito per aquest controlador */
	private ControlerSystem		up;
	private ControlerKey		key;
	private ControlerFile		file;

	public ControlerInput (ControlerSystem e)
	{
		System.out.println ("ControlerInput: en breus sera 100% funcional 'breu notequal ara'.");
		up	= e;
		key	= new ControlerKey 	(this);
		file	= new ControlerFile	(this);
	}

	public void Error (String e) {}// up.Error (e); }
	public char ReadKey () { return key.Read (); }
}
