package br.com;

import br.com.xmls.tableView.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Alisson F.
 */
public class TelaController implements Initializable {

   
   @FXML
   private TableView<User> tbl;
   
   @FXML
   private TableColumn<User, Integer> columnN;
   
   @FXML
   private TableColumn<User, String> columnNome;
   
   @FXML
   private TableColumn<User, String> columnSexo;
   
   @FXML
   private TableColumn<User, Integer> columnIdade;
   
   @FXML
   private TableColumn<User, String> columnAprovado;
   
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       initTable();
    }    
    
    private void initTable(){
        initColumns();
        tableLoad();
    }
    
    private void initColumns(){
        columnN.setCellValueFactory(new PropertyValueFactory<User, Integer>("n"));
        columnNome.setCellValueFactory(new PropertyValueFactory<User, String>("nome"));
        columnSexo.setCellValueFactory(new PropertyValueFactory<User, String>("sexo"));
        columnIdade.setCellValueFactory(new PropertyValueFactory<User, Integer>("idade"));
        columnAprovado.setCellValueFactory(new PropertyValueFactory<User, String>("aprovado"));
    }
    
    private void tableLoad(){
        ObservableList<User> users = FXCollections.observableArrayList();
        
        users.add(new User(1, "Thalisson M. Montibelo", "Masc", 20, "Sim"));
        users.add(new User(2, "Hakel Brito", "Fem", 23, "Não"));
        users.add(new User(3, "Brenda C. Ribeiro", "Fem", 25, "Sim"));
        
        tbl.setItems(users);
    }
    
}
