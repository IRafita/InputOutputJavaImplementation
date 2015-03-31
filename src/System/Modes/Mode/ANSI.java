package src.System.Modes.Mode;

/* El Controlador superior */
import src.System.Modes.InicialitzadorModes;

/* Les commandes que necessita */
//import src.System.Modes.Mode.Command.ANSI;

public class ANSI
{
/* Els objectes que necessito per aquest mode */
	private Normal	cmd;

	public ANSI (InicialitzadorModes e)
	{
		System.out.println ("ANSI: 'mode' testejar");
		cmd	= new ANSI (e);
	}
}
/*
\u001B[
tinc previts una classe per descobrir els objectes que
amaga el ansii :)


Aixi descobrir un mon amagat de forma mes agradable
*/
