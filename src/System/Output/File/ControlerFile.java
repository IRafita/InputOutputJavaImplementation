package src.System.Output.File;

public class ControlerFile
{
/* Els objectes que necessito per aquest controlador */
	private WriteFile	file;

	public ControlerFile ()
	{
		System.out.println ("Controler File: No fa res");
		file	= new WriteFile ();
	}
}
