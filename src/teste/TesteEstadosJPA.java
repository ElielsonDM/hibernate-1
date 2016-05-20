package teste;

import javax.persistence.EntityManager;

import model.Conta;
import util.JPAUtil;

public class TesteEstadosJPA {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();
		
		Conta conta = manager.find(Conta.class, 1);
		conta.setTitular("Elielson");
		System.out.println(conta.getTitular());
		
		manager.getTransaction().commit();
		
		manager.close();
	}
}
