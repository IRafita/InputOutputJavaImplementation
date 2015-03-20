package src.System.Modes.Type;

/* El Controlador superior */
import src.System.Modes.ControlerModes;

/* Les commandes que necessita */
import src.System.Modes.Command.CommandWriteTyped;

public class WriteTyped
{
/* Els objectes que necessito per aquest mode */
	private CommandWriteTyped	cmd;
	private ControlerModes		up;

	public WriteTyped (ControlerModes e)
	{
		System.out.println ("WriteTyped: et diu el digit del escrit :)");
		up	= e;
		cmd	= new CommandWriteTyped (e);
	}
/* Queda millor no borrar i deixar aixo per tota la vida. Per si acas xD
	public void NormalKey ()
	{
		char e;
		while (true)
		{
			e = up.ReadKey	();
			up.ShowWindows	("llegit: " + (int)e + "\t" + e);
			if (e == 'q')
				break;
		}
	}*/
	public void NormalKey () { cmd.Char (up.ReadKey ()); }
}
