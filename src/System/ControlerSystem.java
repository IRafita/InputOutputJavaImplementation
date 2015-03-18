package src.System;

/* El Controlador superior */
import src.ControlerCentral;


/* Els sub Controladors */
import src.System.Input.ControlerInput;
import src.System.Output.ControlerOutput;

import src.System.Modes.ControlerModes;
import src.System.Navigate.ControlerNavigate;


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
  */
	public ControlerSystem (ControlerCentral e)
	{
		System.out.println ("C.System: Almenys, crida a tothom que ha de cridar");
		up		= e;

		input		= new ControlerInput	(this);
		output		= new ControlerOutput	();

		modes		= new ControlerModes	(this);
		navigate	= new ControlerNavigate	(this);
	}

/**
  * Pregunta caracters
  */
	public char ReadKey	()		{ return input.ReadKey (); }
	public void ShowWindows	(String e)	{ output.ShowWindows (e); }
	public void Begin	()		{ modes.Tst (); }
}
