package src.System.Output.Windows;

public class ControlerWindows
{
/* Els objectes que necessito per aquest controlador */
	private WriteWindows windows;

	public ControlerWindows ()
	{
		System.out.println ("ControlerWindows: Suposo que no cal guardar el pare, apenes fa res ara per ara");
		windows = new WriteWindows ();
	}

//	public void Error (String e) { windows.Error (e); }
	public void Show (String e) { windows.Write (e); }
}
