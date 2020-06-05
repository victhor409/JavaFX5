package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViwerController {

	//atributo com anotacao de @FXML
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click");
	}
}
