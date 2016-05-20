package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Conta;
import model.Movimentacao;
import model.TipoMovimentacao;
import util.JPAUtil;

public class TesteConsultasJPQL {
	
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		Conta conta = new Conta();
		conta.setId(1);
		
		Query query = manager.createQuery("select m from Movimentacao m where m.conta=:pConta and m.tipoMovimentacao=:pMovimentacao");
		query.setParameter("pConta", conta);
		query.setParameter("pMovimentacao", TipoMovimentacao.SAÍDA);
		List<Movimentacao> movimentacoes = query.getResultList();
		
		for(Movimentacao m: movimentacoes){
			System.out.println("Descrição ..: " + m.getDescricao());
			System.out.println("Valor ..: " + m.getValor());
		}
		
		manager.close();
		
	}

}
