package src.InputOutput.Output;

/* El Controlador superior */
import src.InputOutput.ControlerInputOutput;

/* Els sub Controladors */
import src.InputOutput.Output.Windows.ControlerWindows;

public class ControlerOutput
{
/* Els objectes que necessito per aquest controlador */
	private ControlerInputOutput	up;
	private ControlerWindows	windows;

	public ControlerOutput (ControlerInputOutput e)
	{
		System.out.println ("ControlerOutput: Discutible up // ni file ni help");
		up	= e;
		windows	= new ControlerWindows ();
	}

	public void Error (String e) { windows.Error (e); }
}
