import java.util.List;

import br.gov.rr.smsa.rodio.dao.DaoServicosImpl;
import br.gov.rr.smsa.rodio.entidades.RodServicos;




public class Teste {
	public static void main(String[] args) {
		DaoServicosImpl dao = new DaoServicosImpl();
		List<RodServicos> lista = dao.lista();
		System.out.println("print lista: " + lista.toString());
		
	}
	
	
}
