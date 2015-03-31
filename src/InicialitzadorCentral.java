package src;

/* Els objectes que farem anar */
import src.System.InicialitzadorSystem;
import src.Intermedia.ControlerIntermedia_HumaMaquina_;

/**
  * Tronc principal de tot el programa
  *
  * Comunica basicament de Entrada Sortida als objectes que faran totes les operacions desitjades
  */
public class InicialitzadorCentral
{
/* Els objectes que necessito per aquest controlador */
	private InicialitzadorSystem			system;
	private ControlerIntermedia_HumaMaquina_	intermedia;

/**
  * Inicialitza tot el sistema
  */
	public InicialitzadorCentral ()
	{
		System.out.println ("ControlerCentral: Sistema arrancant");
		system		= new InicialitzadorSystem		(this);
		intermedia	= new ControlerIntermedia_HumaMaquina_	(this);
		System.out.println ("ControlerCentral: Adeu, Ja ha finalitzat");
	}

	public void Begin () { system.Normal (); }
}
