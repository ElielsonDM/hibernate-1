package teste;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Conta;
import util.JPAUtil;

public class TesteConsultaFuncaoCount {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		Conta conta = manager.find(Conta.class, 1);
		
		TypedQuery<Long> query = manager.createQuery("select count(m) from Movimentacao m where m.conta = :pConta", Long.class);
		query.setParameter("pConta", conta);
		Long quantidade = query.getSingleResult();
		System.out.println(quantidade + " de movimentações de " + conta.getTitular());
	}
	
}
