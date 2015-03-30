package src.System;

/* El Controlador superior */
import src.ControlerCentral;


/* Els sub Controladors */
import src.System.Input.ControlerInput;
import src.System.Output.ControlerOutput;

import src.System.Modes.ControlerModes;
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
public class ControlerSystem
{
/* Els objectes que necessito per aquest controlador */
	private ControlerCentral	up;

	private ControlerInput		input;
	private ControlerOutput		output;

	private ControlerModes		modes;
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
	public ControlerSystem (ControlerCentral e)
	{
		up		= e;

		input		= new ControlerInput	(this);
		output		= new ControlerOutput	();

		modes		= new ControlerModes	(this);
		navigate	= new ControlerNavigate	(this);
	}

/**
  * Pregunta caracters
  */
	public char ReadKey	()		{ return input.ReadKey	();	}
	public void ShowWindows	(String e)	{ output.ShowWindows	(e);	}
	public void Normal	()		{ modes.NormalNormalKey	();	}
}
