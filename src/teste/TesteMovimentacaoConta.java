package teste;

import javax.persistence.EntityManager;

import model.Movimentacao;
import util.JPAUtil;

public class TesteMovimentacaoConta {
	
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		Movimentacao movimentacao = manager.find(Movimentacao.class, 1);
		
		System.out.println(movimentacao.getConta().getTitular());
		
	}

}
