package src.System.Modes.Mode;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

/* Les commandes que necessita */
import src.System.Modes.Mode.Command.WriteTypedCommand;

public class WriteTyped
{
/* Els objectes que necessito per aquest mode */
	private WriteTypedCommand	cmd;

	public WriteTyped (ControlerModes e)
	{
		System.out.println ("WriteTyped: et diu el digit del escrit :)");
		cmd	= new WriteTypedCommand (e);
	}
	public void NormalKey () { cmd.Char (); }
}
/*
Per a mes ajuda:
https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
*/
