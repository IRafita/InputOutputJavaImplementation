package src.InputOutput.Input.Key;

/* El Controlador superior */
import src.InputOutput.Input.ControlerInput;

public class ControlerKey
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInput	up;
	private ReadKey		key;

	public ControlerKey (ControlerInput e)
	{
		System.out.println ("ControlerKey: Casi casi puc llegir text // Nomes cal inicialitzar la lectura");
		up	= e;
		key	= new ReadKey (this);
	}

	public void Error (String e) { up.Error ("Error amb el teclat:\n" + e); }
	public void Begin () { while (true) { up.Char (key.Read ()); } }
}
