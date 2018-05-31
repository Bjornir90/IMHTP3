/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.view;


import javafx.event.Event;
import sample.controller.Percentage_Controller;
import sample.event.ValueChangedEvent;
import sample.event.ValueListener;

public class ConsoleView implements Percentage_View, ValueListener {

    private final Percentage_Controller myController;

    public ConsoleView (Percentage_Controller controller) {
        myController = controller;
    }

    @Override
    public void update(Event event) {

    }

    @Override
    public void valueChanged(ValueChangedEvent event) {

    }


    // TODO : create a views that display the percentage in the console of the application
    // Override the method of the interface..
    

}
