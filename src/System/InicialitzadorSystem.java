package src.System;

/* El Controlador superior */
import src.InicialitzadorCentral;


/* Els sub Controladors */
import src.System.Run.InicialitzadorRun;


/**
  * El controlador del Systema
  *
  * Simula gairebe un sistema operatiu
  * Aquest te com a projecte controlar:
  * - Temps
  * - Temperatura
  * - CPU
  * - RAM
  * - Entrada
  * - Sortida
  * - Navegacio
  * - Modes
  */
public class InicialitzadorSystem
{
/* Els objectes que necessito per aquest controlador */
	private InicialitzadorCentral	up;

	private InicialitzadorRun	run;

/**
  * Inicialitzant tot el apartat de controlar el systema
  *
  * Tenim:
  * - Input
  * - Output
  * - Modes
  * - Navigate
  *
  * On tots ells son basics, menys el modes, que es per a simplificar l'Interpret
  */
	public InicialitzadorSystem (InicialitzadorCentral e)
	{
		up		= e;
	}

}

/*
import src.System.Input.InicialitzadorInput;
import src.System.Output.InicialitzadorOutput;

import src.System.Modes.InicialitzadorModes;
import src.System.Navigate.ControlerNavigate;
*/

/*
public class InicialitzadorSystem
	public InicialitzadorSystem (InicialitzadorCentral e)
		/*
		input		= new InicialitzadorInput	(this);
		output		= new InicialitzadorOutput	();

		modes		= new InicialitzadorModes	(this);
		navigate	= new ControlerNavigate		(this);
		*/
/*	}

/**
  * Pregunta caracters

  Un inicialitzador... No hauria de pensar en aquestes cursilades!
  */
  /*
	public char ReadKey	()		{ return input.ReadKey	();	}
	public void ShowWindows	(String e)	{ output.ShowWindows	(e);	}
	public void Normal	()		{ modes.NormalNormalKey	();	}
	*/
