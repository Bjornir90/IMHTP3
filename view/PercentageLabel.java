package sample.view;

import javafx.event.Event;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import sample.controller.Percentage_Controller;
import sample.event.ValueChangedEvent;
import sample.event.ValueListener;


/**
 * A MVC View of a Percentage as a label.
 * This is not a MVC Controller, so it does not allow to change the Percentage value
 * This class implements ValueListener, to be informed of changes in the Percentage
 */

//Implements something
public class PercentageLabel extends Label implements Percentage_View, ValueListener {

	private static final long serialVersionUID = 1L;

	private final Percentage_Controller myController;

	public PercentageLabel(Percentage_Controller controller) {
		myController = controller;
	}

	@Override
	public void update(Event event) {

	}

	@Override
	public void valueChanged(ValueChangedEvent event) {
		this.setText(Double.toString(event.getNewValue()));
	}

	//Override methods




}
