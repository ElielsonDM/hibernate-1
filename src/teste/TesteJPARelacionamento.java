package teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;


import model.Conta;
import model.Movimentacao;
import model.TipoMovimentacao;
import util.JPAUtil;

public class TesteJPARelacionamento {

	public static void main(String[] args) {
		
		double inicio = System.currentTimeMillis();
		
		EntityManager manager = new JPAUtil().getEntityManager();
		Conta conta1 = manager.find(Conta.class, 1);
		Conta conta2 = manager.find(Conta.class, 2);
		Conta conta3 = manager.find(Conta.class, 3);
		Conta conta4 = manager.find(Conta.class, 4);
		Conta conta5 = manager.find(Conta.class, 5);
		Conta conta6 = manager.find(Conta.class, 6);
		Conta conta7 = manager.find(Conta.class, 7);
		Conta conta8 = manager.find(Conta.class, 8);

		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setConta(conta1);
		
		movimentacao1.setData(Calendar.getInstance());
		movimentacao1.setDescricao("Pagamento RINOMED");
		movimentacao1.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao1.setValor(new BigDecimal("625"));
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setConta(conta2);
		
		movimentacao2.setData(Calendar.getInstance());
		movimentacao2.setDescricao("Pagamento RINOMED");
		movimentacao2.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao2.setValor(new BigDecimal("625"));
		
		Movimentacao movimentacao3 = new Movimentacao();
		movimentacao3.setConta(conta3);
		
		movimentacao3.setData(Calendar.getInstance());
		movimentacao3.setDescricao("Pagamento RINOMED");
		movimentacao3.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao3.setValor(new BigDecimal("625"));
		
		Movimentacao movimentacao4 = new Movimentacao();
		movimentacao4.setConta(conta4);
		
		movimentacao4.setData(Calendar.getInstance());
		movimentacao4.setDescricao("Pagamento RINOMED");
		movimentacao4.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao4.setValor(new BigDecimal("625"));
		
		Movimentacao movimentacao5 = new Movimentacao();
		movimentacao5.setConta(conta5);
		
		movimentacao5.setData(Calendar.getInstance());
		movimentacao5.setDescricao("Pagamento RINOMED");
		movimentacao5.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao5.setValor(new BigDecimal("625"));
		
		Movimentacao movimentacao6 = new Movimentacao();
		movimentacao6.setConta(conta1);
		
		movimentacao6.setData(Calendar.getInstance());
		movimentacao6.setDescricao("Pagamento RINOMED");
		movimentacao6.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao6.setValor(new BigDecimal("625"));
		
		Movimentacao movimentacao7 = new Movimentacao();
		movimentacao7.setConta(conta2);
		
		movimentacao7.setData(Calendar.getInstance());
		movimentacao7.setDescricao("Pagamento RINOMED");
		movimentacao7.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao7.setValor(new BigDecimal("625"));
		
		Movimentacao movimentacao8 = new Movimentacao();
		movimentacao8.setConta(conta1);
		
		movimentacao8.setData(Calendar.getInstance());
		movimentacao8.setDescricao("Pagamento RINOMED");
		movimentacao8.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao8.setValor(new BigDecimal("625"));
		
		manager.getTransaction().begin();
		manager.persist(movimentacao1);
		manager.persist(movimentacao2);
		manager.persist(movimentacao3);
		manager.persist(movimentacao4);
		manager.persist(movimentacao5);
		manager.persist(movimentacao6);
		manager.persist(movimentacao7);
		manager.persist(movimentacao8);
		
		
		manager.getTransaction().commit();
		
		manager.close();
	
		double fim = System.currentTimeMillis();
		
        System.out.println("Executado em: " + (fim - inicio)/1000 + "s");

	}
	
	
}
