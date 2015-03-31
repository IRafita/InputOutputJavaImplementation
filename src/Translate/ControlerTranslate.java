package src.Translate;

/* El Controlador superior */
import src.ControlerCentral;

/* Els sub Controladors */
import src.Translate.LaTeX.ControlerLaTeX;
import src.Translate.Help.ControlerHelp;

/**
  * Plantilla per ajudar-me a fer codi amb un cert ordre, copiat de ControlerInput el 27-3-2015 a les 0:50
  */
public class ControlerTranslate
{
/* Els objectes que necessito per aquest controlador */
	ControlerCentral	up;
	ControlerLaTeX		latex;
	ControlerHelp		help;

	public ControlerTranslate (ControlerCentral e)
	{
		up	= e;
		latex	= new ControlerLaTeX	(this);
		help	= new ControlerHelp	(this);
	}
}
