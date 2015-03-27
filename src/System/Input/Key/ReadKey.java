package src.System.Input.Key;

/* Classes propies de Java que necessito */
import java.io.Console;
import java.io.IOException;
import java.io.Reader;

/**
  * Aquest te una feina forza simple, nomes cal que pugui llegir el teclat
  * Cada cop que llegeix un caracter, l'enviara fins a Mode-Commandes, on ell sabra que fer-ne
  *
  * També dotat per a generar error "pasara si no funciones amb consola, clar està"
  */
public class ReadKey
{
/* Classes necessaries per aquesta classe */
	private ControlerKey	up;
	private Reader		reader;

/**
  * Inicialitzador del Input Key
  *
  * Ara és quan un realitza que ja no recorda absolutament res de res de com generar un javadoc jajajaja
  */
	public ReadKey (ControlerKey e)
	{
		up = e;

		Console console	= System.console ();
		reader		= console.reader ();
	}

	public char Read () {
		try			{ return (char) reader.read (); }
		catch (IOException ex)	{ up.Error ("Error al teclat ReadKey\n" + ex.toString ()); return '~'; } }
}
