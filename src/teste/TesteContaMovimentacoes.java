package teste;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Conta;
import util.JPAUtil;

public class TesteContaMovimentacoes {

	public static void main(String[] args) {
	
		EntityManager manager = new JPAUtil().getEntityManager();
		

		Query query = manager.createQuery("select c from Conta c join fetch c.movimentacoes where c.id =:pId");
		query.setParameter("pId", 2);
		Conta conta = (Conta) query.getSingleResult();
		System.out.println(conta.getTitular());
		System.out.println(conta.getBanco());
		manager.close();
		
		System.out.println(conta.getMovimentacoes().size());

	}
	
	
}
