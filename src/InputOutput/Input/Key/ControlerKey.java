package src.InputOutput.Input.Key;

/* El Controlador superior */
import src.InputOutput.Input.ControlerInput;

public class ControlerKey
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInput	up;
	private ReadKey		key;
//	private boolean		True;

	public ControlerKey (ControlerInput e)
	{
		System.out.println ("ControlerKey: Casi casi puc llegir text // Nomes cal inicialitzar la lectura");
		up	= e;
		key	= new ReadKey (this);
//		True	= true;
	}

//	public void False () { True = false; }
	public void Error (String e) { up.Error ("Error amb el teclat:\n" + e); }
	public void Read () { up.Char (key.Read ()); }
}
