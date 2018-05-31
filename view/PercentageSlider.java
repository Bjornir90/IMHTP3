package sample.view;

import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.scene.control.Slider;
import sample.controller.Controller_Interface;
import sample.controller.Percentage_Controller;
import sample.event.ValueChangedEvent;
import sample.event.ValueListener;

/**
 * A PercentagePieSlider acts boths as a MVC View and Controller of a Percentage
 * It maintains a reference to its model in order to update it.
 */
public class PercentageSlider extends Slider implements Percentage_View, ValueListener {

	private static final long serialVersionUID = 1L;
	
	private final Percentage_Controller myController;

	public PercentageSlider(Percentage_Controller controller) {
		myController = controller;
		setMin(0);
		setMax(100);

		this.setMinorTickCount(5);
		this.setMajorTickUnit(10);
		this.setShowTickLabels(true);
		this.setShowTickMarks(true);
		this.setBlockIncrement(10);
		this.setSnapToTicks(true);

		// "Controller" behaviour : when the value of the slider changes,
		// The model must be updated
		valueProperty().addListener(new javafx.beans.value.ChangeListener<Number>() {
            @Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				myController.setValue((double) newValue / 100.0);
			}
		});
	}



	//getter of the controller
    public Controller_Interface getController() {
        return controller;
    }

	@Override
	public void update(Event event) {

	}

	@Override
	public void valueChanged(ValueChangedEvent event) {
		this.setValue(event.getNewValue());
	}
}
