package src.System.Modes.Mode;

/* El Controlador superior */
import src.System.Modes.InicialitzadorModes;

/* Les commandes que necessita */
import src.System.Modes.Command.NormalCommand;

public class Normal
{
/* Els objectes que necessito per aquest mode */
	private NormalCommand	cmd;

	public Normal (InicialitzadorModes e)
	{
		System.out.println ("Normal:'mode' ara command qui fa tot");
		cmd	= new NormalCommand (e);
	}

	public void NormalKey () { cmd.Char (); }
}
