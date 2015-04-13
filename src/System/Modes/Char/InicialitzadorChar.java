package src.System.Modes.Char;

/* El Inicialitzador superior */
import src.System.Modes.InicialitzadorModes;

/**
  * En un futur proxim, aixo tindra totes les classes on se comunica
  */
public class InicialitzadorChar
{
	Char			chr;

	ControlerChar		ctl;
	HermesInput		hit;

	public InicialitzadorChar	()
	{
		chr = e;

		ctl = new ControlerChar	(chr);
		hit = new HermesInput	(ctl);
	}

	public void DefineCommunicationInput	(ControlerInput e) { hit.Def (e); }

	public ControlerKey Control		() { return ctl; }
}
