	package teste;
	
	import java.math.BigDecimal;
	
	import javax.persistence.EntityManager;
	import javax.persistence.TypedQuery;
	
	import model.Conta;
	import util.JPAUtil;
	
	public class TesteConsultaFuncaoMax {
	
		public static void main(String[] args) {
			
			EntityManager manager = new JPAUtil().getEntityManager();
			Conta conta = manager.find(Conta.class, 1);
			
			
			
			TypedQuery<BigDecimal> query = manager.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta", BigDecimal.class);
			query.setParameter("pConta", conta);
			BigDecimal maior = query.getSingleResult();
			
			System.out.println(maior);
	
		}
		
	}
