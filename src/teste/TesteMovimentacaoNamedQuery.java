package teste;

import javax.persistence.EntityManager;

import dao.MovimentacaoDAO;
import model.Conta;
import util.JPAUtil;

public class TesteMovimentacaoNamedQuery {
	
	public static void main(String[] args) {
		
	EntityManager manager = new JPAUtil().getEntityManager();
	Conta conta = manager.find(Conta.class, 1);
	
	MovimentacaoDAO dao = new MovimentacaoDAO(manager);
	
	System.out.println(dao.maiorMovimentacaoNQ(conta));
	System.out.println(dao.mediaDaContaNQ(conta));
	}
}
