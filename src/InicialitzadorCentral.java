package src;

/* Els objectes que farem anar */
import src.System.InicialitzadorSystem;
import src.Intermedia.InicialitzadorIntermedia;

/**
  * Tronc principal de tot el programa
  *
  * Comunica basicament de Entrada Sortida als objectes que faran totes les operacions desitjades
  */
public class InicialitzadorCentral
{
/* Els objectes que necessito per aquest controlador */
	private InicialitzadorSystem			system;
	private InicialitzadorIntermedia		intermedia;

/**
  * Inicialitza tot el sistema
  */
	public InicialitzadorCentral ()
	{
		System.out.println ("ControlerCentral: Sistema arrancant");
		system		= new InicialitzadorSystem		(this);
		intermedia	= new InicialitzadorIntermedia		(this);
		System.out.println ("ControlerCentral: Adeu, Ja ha finalitzat");
	}

	public void Begin () { system.Normal (); }
	public InicialitzadorIntermedia Kill	()
	{
		return intermedia;
	}
	public void Inicialitzar	()
	{
	}
}
