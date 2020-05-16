package guiTest02;

import guiTest02.datamodel.BookData;
import guiTest02.datamodel.Book;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

/**
 * Created by timbuchalka on 8/05/2016.
 */
public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public Book processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        Book newItem = new Book(shortDescription, details, deadlineValue);
        BookData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
