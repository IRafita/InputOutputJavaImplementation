package src.System;

/* El Controlador superior */
import src.InicialitzadorCentral;


/* Els sub Controladors */
import src.System.Input.InicialitzadorInput;
import src.System.Output.InicialitzadorOutput;

import src.System.Modes.InicialitzadorModes;
import src.System.Navigate.ControlerNavigate;


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

	private InicialitzadorInput	input;
	private InicialitzadorOutput	output;

	private InicialitzadorModes	modes;
	private ControlerNavigate	navigate;

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

		input		= new InicialitzadorInput	(this);
		output		= new InicialitzadorOutput	();

		modes		= new InicialitzadorModes	(this);
		navigate	= new ControlerNavigate		(this);
	}

/**
  * Pregunta caracters
  */
	public char ReadKey	()		{ return input.ReadKey	();	}
	public void ShowWindows	(String e)	{ output.ShowWindows	(e);	}
	public void Normal	()		{ modes.NormalNormalKey	();	}
}
