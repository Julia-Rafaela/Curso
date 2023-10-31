package curso;

import java.util.ArrayList;
import java.util.List;
public class CursoControl {
	 private List<Curso> lista = new ArrayList<>();

	    public void adicionar( Curso c) { 
	        lista.add(c);
	        System.out.println("Tamanho Lista: " + lista.size());
	    }

	    public Curso pesquisar( String texto ) { 
	        for (Curso c : lista) { 
	            if (c.getNome().contains(texto)) { 
	                return c;
	            }
	        }
	        return null;
	    }
}
