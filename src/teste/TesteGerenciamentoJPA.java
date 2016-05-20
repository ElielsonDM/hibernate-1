package teste;

import javax.persistence.EntityManager;

import model.Conta;
import util.JPAUtil;

public class TesteGerenciamentoJPA {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Conta conta = manager.find(Conta.class, 1);
		
		manager.getTransaction().commit();
		
		conta.setTitular("W6 Solutions");
		
		manager.getTransaction().begin();
		manager.merge(conta);
		System.out.println(conta.getTitular());
		manager.getTransaction().commit();
		
		
	
		manager.close();
		
	}
}
