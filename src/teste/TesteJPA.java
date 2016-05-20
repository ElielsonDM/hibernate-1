package teste;

import javax.persistence.EntityManager;


import model.Conta;
import util.JPAUtil;

public class TesteJPA {

	public static void main(String[] args) {
		
		double inicio = System.currentTimeMillis();
		Conta conta = new Conta();
		conta.setTitular("Elielson");
		conta.setBanco("Bradesco");
		conta.setAgencia("3527");
		conta.setNumero("123312");
		
		Conta conta1 = new Conta();
		conta1.setTitular("Ana Guerra");
		conta1.setBanco("Itaú");
		conta1.setAgencia("3212");
		conta1.setNumero("12121212");
		
		Conta conta2 = new Conta();
		conta2.setTitular("Raiza Normanha");
		conta2.setAgencia("4321");
		conta2.setBanco("Banco do Brasil");
		conta2.setNumero("919191");
		
		Conta conta3 = new Conta();
		conta3.setTitular("Patricia Normanha");
		conta3.setAgencia("1212");
		conta3.setBanco("HSBC");
		conta3.setNumero("323232");
		
		Conta conta4 = new Conta();
		conta4.setTitular("Osvaldina Normanha");
		conta4.setAgencia("5454");
		conta4.setNumero("213131");
		conta4.setBanco("Banco do Nordeste");
		
	
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		manager.persist(conta1);
		manager.persist(conta2);
		manager.persist(conta3);
		manager.persist(conta4);
		
		manager.getTransaction().commit();
		
		manager.close();
	
		double fim = System.currentTimeMillis();
		
        System.out.println("Executado em: " + (fim - inicio)/1000 + "s");

	}
	
	
}
