package dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Conta;
import model.TipoMovimentacao;

public class MovimentacaoDAO {
	
	EntityManager manager;
	
	public MovimentacaoDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	
	public BigDecimal maiorMovimentacao(Conta conta) {
		
		TypedQuery<BigDecimal> query = manager.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta", BigDecimal.class);
		query.setParameter("pConta", conta);
		BigDecimal maior = query.getSingleResult();

		return maior;
	}
	
	public Double mediaDaContaNQ(Conta conta) {
		
		TypedQuery<Double> query = manager.createNamedQuery("mediaDeSaidaDeMovimentacaoDaConta", Double.class);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAÍDA);
		
		Double media = query.getSingleResult();
		return media;
	}
	
	
	public BigDecimal maiorMovimentacaoNQ(Conta conta) {
		
		TypedQuery<BigDecimal> query = manager.createNamedQuery("maiorMovimentacaoDaConta", BigDecimal.class);
		query.setParameter("pConta", conta);
		BigDecimal maior = query.getSingleResult();

		return maior;
	}
	
	public Double mediaDaConta(Conta conta) {
		
		TypedQuery<Double> query = manager.createQuery("select avg(valor) from Movimentacao m where m.conta=:pConta and m.tipoMovimentacao=:pTipo", Double.class);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAÍDA);
		
		Double media = query.getSingleResult();
		return media;
	}

}
