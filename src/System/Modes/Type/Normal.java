package src.System.Modes.Type;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

/* Les commandes que necessita */
import src.System.Modes.Command.CommandNormal;

public class Normal
{
/* Els objectes que necessito per aquest mode */
	private ControlerModes	up;
	private CommandNormal	cmd;

	public Normal (ControlerModes e)
	{
		System.out.println ("Normal:'mode' ara command qui fa tot");
		up	= e;
		cmd	= new CommandNormal (e);
	}

	public void NormalKey () { cmd.Char (up.ReadKey ()); }
}
