package src.InputOutput.Input.Key;

/* Classes propies de Java que necessito */
import java.io.Console;
import java.io.IOException;
import java.io.Reader;

/**
  * Aquest te una feina forza simple, nomes cal que pugui llegir el teclat
  * Cada cop que llegeix un caracter, l'enviara fins a Commandes, on ell sabra que fer-ne
  */
public class ReadKey
{
/* Classes necessaries per aquesta classe */
	private ControlerKey	up;
	private Reader		reader;

	public ReadKey (ControlerKey e)
	{
		System.out.println (" - ReadKey: Suposo que ja llegeix correctament");
		up = e;

		Console console	= System.console ();
		reader		= console.reader ();
	}

	public char Read () {
		try			{ return (char) reader.read (); }
		catch (IOException ex)	{ up.Error (ex.toString ()); } return '~'; }
}
