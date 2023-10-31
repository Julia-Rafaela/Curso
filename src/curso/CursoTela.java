package curso;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CursoTela extends Application {
	private TextField txtId = new TextField ();
	private TextField txtNome = new TextField ();
	private TextField txtCod = new TextField ();
	private TextField txtNomeCor = new TextField ();  
	private TextField txtQuant = new TextField (); 
	private CursoControl control = new CursoControl();

	@Override
	public void start(Stage stage) throws Exception {
	
			GridPane pane = new GridPane();
	        pane.setHgap(8);
	        pane.setVgap(8);
	        pane.setPadding(new Insets(7));
	       
	        Scene scene = new Scene (pane, 400,200);
			 Label id = new Label ("Id:");
			 Label nome = new Label ("Nome:"); 
			 Label cod = new Label ("Codigo do curso:");
			 Label nomecor= new Label ("Nome do coordenador:"); 
			 Label quant = new Label ("quantidade de alunos:");
			 txtId = new TextField ();
		     txtNome = new TextField ();
		     txtCod = new TextField ();  
		     txtNomeCor = new TextField(); 
		     txtQuant = new TextField();
		     Button add =new Button("Adicionar");
		     Button pesquisar =new Button("Pesquisar");
		     
		     add.setOnMouseClicked( 
		             e-> { 
		                 control.adicionar( toEntity() );
		                 
		                 clearBoundary();
		             }
		         );

		     pesquisar.setOnMousePressed(
		             e -> { 
		                 Curso c = control.pesquisar( txtNome.getText() );
		                 fromEntity(c);
		                
		             }
		         );
		        pane.addRow(0, id, txtId);
		        pane.addRow(1, nome, txtNome);
		        pane.addRow(2, cod, txtCod);
		        pane.addRow(3, nomecor, txtNomeCor);
		        pane.addRow(4, quant, txtQuant);
		       
		        pane.addRow(5, add);
		        pane.addRow(5, pesquisar);  

		       stage.setTitle("Gestão de Alunos");
		       stage.setScene(scene);
		       stage.show();
		}

		public void clearBoundary() {
			    txtId.setText("");
			    txtNome.setText("");
			    txtCod.setText("");
		        txtNomeCor.setText("");
		        txtQuant.setText(""); 
		    
		    }

		    public Curso toEntity() { 
		    	
		        Curso c = new Curso();
		        c.setId(txtId.getText());
		        c.setNome(txtNome.getText());
		        c.setCod(txtCod.getText());
		        c.setNomeCor(txtNomeCor.getText());
		        c.setQuant(txtQuant.getText());
		        return c;
		    }

		    public void fromEntity(Curso c) { 
		        if (c != null) {
		        	txtId.setText(c.getId());
		        	txtNome.setText(c.getNome());
		        	txtCod.setText(c.getCod());
		            txtNomeCor.setText(c.getNomeCor());
		            txtQuant.setText(c.getQuant());
		        } else { 
		            Alert a = new Alert(
		                AlertType.INFORMATION, 
		                    "Curso não encontrado", 
		                    new ButtonType("Ok")
		            );
		            a.show();
		        }
		    }
		 public static void main(String[] args) {
	    	 Application.launch(args);
	}
}
