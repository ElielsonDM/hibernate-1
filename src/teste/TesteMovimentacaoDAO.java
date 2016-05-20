package teste;

import javax.persistence.EntityManager;

import dao.MovimentacaoDAO;
import model.Conta;
import util.JPAUtil;

public class TesteMovimentacaoDAO {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		MovimentacaoDAO dao = new MovimentacaoDAO(manager);
		
		Conta conta = new Conta();
		conta.setId(1);
		System.out.println(dao.mediaDaConta(conta));
	}
	
	
	
}
