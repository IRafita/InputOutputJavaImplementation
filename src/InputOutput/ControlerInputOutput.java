package src.InputOutput;

/* El Controlador superior */
import src.ControlerCentral;

/* Els sub Controladors */
import src.InputOutput.Input.ControlerInput;
import src.InputOutput.Output.ControlerOutput;

/**
  * Classe basica per a poder tenir un control tant de la entrada de dades com de la sortida
  * En consequencia, passen tambe totes les communicacions directes de entrada i sortida
  * // - Per aquest motiu, tinc previst que ereti d'aquets, o sigui crear una classe per a simplificar el codi en si d'aquest
  */
public class ControlerInputOutput
{
/* Els objectes que necessito per aquest controlador */
	private ControlerCentral	up;
	private ControlerInput		CI;
	private ControlerOutput		CO;

/**
  * Aqui inicialitzem:
  * up /- Serveix per a enviar missatges al controlador de sobre
  */
	public ControlerInputOutput (ControlerCentral e)
	{
		System.out.println ("ControlerInputOutput, ni mira la sortida");
		up = e;
		CI = new ControlerInput  (this);
		CO = new ControlerOutput (this);
	}

	public void Begin () { CI.Begin (); }

	public void Error (String e) { CO.Error (e); }
}
