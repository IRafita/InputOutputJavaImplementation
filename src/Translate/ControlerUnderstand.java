package src.Understand;

/* El Controlador superior */
import src.ControlerCentral;

/* Els sub Controladors */
package src.Understand.LaTeX.ControlerLaTeX;
package src.Understand.Help.ControlerHelp;

/**
  * Plantilla per ajudar-me a fer codi amb un cert ordre, copiat de ControlerInput el 27-3-2015 a les 0:50
  */
public class ControlerUnderstand
{
/* Els objectes que necessito per aquest controlador */
	ControlerCentral	up;
	ControlerLaTeX		latex;
	ControlerHelp		help;

	public ControlerUnderstand (ControlerCentral e)
	{
		up	= e;
		latex	= new ControlerLaTeX	(this);
		help	= new ControlerHelp	(this);
	}
}
