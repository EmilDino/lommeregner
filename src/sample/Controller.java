package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    // laver et string array
    ArrayList<String> numbersArray = new ArrayList<String>();
    //
    int resultat;

    @FXML
    public TextField talDisplay;

    // denne Metode styrer ligmed knappen som viser resultatet af alle tallende
    public void equalsMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        numbersArray.add(s);
        talDisplay.clear();
        System.out.println(s + " er nu tilføjet");

        // sørger for at systemet ikke bryder ned hvis der er en runtime error
        try {
            for (String number : numbersArray) {
                System.out.println(number);
                resultat += Integer.parseInt(number);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("OBS NumberFormatExeption " + e.getCause() + e.getMessage());
        }
        catch (Exception e) {

        }

        System.out.println(resultat);
        talDisplay.setText(Integer.toString(resultat));

    }

    // denne Methode styrer plus knappen som lægger tallende sammen
    public void plusmetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        System.out.println("Plusknappen virker");
        numbersArray.add(s);
        talDisplay.clear();
        System.out.println(s + " er nu tilføjet");
    }
}
