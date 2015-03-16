package src.System.Output;

/* Els sub Controladors */
import src.System.Output.Windows.ControlerWindows;
import src.System.Output.File.ControlerFile;

/**
  * Com que nomes es de sortida, no necessita ni coneixer al seu pare
  */
public class ControlerOutput
{
/* Els objectes que necessito per aquest controlador */
	private ControlerWindows	windows;
	private ControlerFile		file;
	private LaTeX			latex;
	private Help			help;

	public ControlerOutput ()
	{
		System.out.println ("ControlerOutput: Discutible up // ni file ni help");
		windows	= new ControlerWindows	();
		file	= new ControlerFile	();
		latex	= new LaTeX		();
		help	= new Help		();
	}

	public void Error (String e) { windows.Error (e); }
}
