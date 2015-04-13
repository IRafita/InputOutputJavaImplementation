package src.System.Input.Key;

/* El Inicialitzador superior */
import src.System.Input.InicialitzadorInput;

/**
  * En un futur proxim, aixo tindra totes les classes on se comunica
  */
public class InicialitzadorKey
{
	ControlerKey		ctl;
	ReadKey			obj;
	InicialitzadorInput	iit;
	HermesChar		hcr;
	HermesError		her;

	public InicialitzadorKey	(InicialitzadorInput e)
	{
		iit = e;

		obj = new ReadKey	();
		ctl = new ControlerKey	(obj);
	}

	public void DefineCommunicationChar	(Char e)
	{ HermesChar	= new HermesChar	(e); }

	public void DefineCommunicationError	(Error e)
	{ HermesError	= new HermesError	(e); }

	public ControlerKey Control		() { return ctl; }
}
