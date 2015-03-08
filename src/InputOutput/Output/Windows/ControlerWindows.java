package src.InputOutput.Output.Windows;

/* El Controlador superior */
import src.InputOutput.Output.ControlerOutput;

public class ControlerWindows
{
/* Els objectes que necessito per aquest controlador */
	private WriteWindows windows;

	public ControlerWindows ()
	{
		System.out.println ("ControlerWindows: Suposo que no cal guardar el pare, apenes fa res ara per ara");
		windows = new WriteWindows ();
	}

	public void Error (String e) { windows.Error (e); }
}
