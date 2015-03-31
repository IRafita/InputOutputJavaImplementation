package src.System.Navigate;

/* El Controlador superior */
import src.System.InicialitzadorSystem;

public class ControlerNavigate
{
/* Els objectes que necessito per aquest controlador */
	private InicialitzadorSystem	up;


	public ControlerNavigate (InicialitzadorSystem e)
	{
		System.out.println ("Controler Navigate: No fa RES");
		up	= e;
	}
}
