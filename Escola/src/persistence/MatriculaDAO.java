package persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Disciplina;
import model.Matricula;
import model.Aluno;



public class MatriculaDAO implements IMatriculaDao {

	private SessionFactory sf;

	public MatriculaDAO (SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void insert(Matricula mt) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(mt);
		transaction.commit();
	}


	@Override
	public void delete(Matricula mt) throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("DELETE FROM matricula ");
		sql.append("WHERE ra_aluno = ?1 ");
				
		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(sql.toString());
		query.setParameter(1, mt.getAluno().getRaAluno());
		query.executeUpdate();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Matricula> selectAll() throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT al.email_aluno, al.nome_aluno, al.ra_aluno, dp.cod_disciplina, dp.carga_horaria, dp.nome_disc ");
		sql.append("mt.ra_aluno, mt.cod_disciplina, mt.ano, mt.semestre ");
		sql.append("FROM aluno al, disciplina dp, matricula mt ");
		sql.append("WHERE al.ra_aluno  = mt.ra_aluno ");
		sql.append("AND dp.cod_disciplina = mt.cod_disciplina ");

		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(sql.toString());

		List<Object[]> matriculasResultSet = query.getResultList();
		List<Matricula> matriculas = new ArrayList<Matricula>();

		for (Object[] o : matriculasResultSet) {
			Aluno al = new Aluno();
			al.setEmailAluno(o[0].toString());
			al.setNomeAluno(o[1].toString());
			al.setRaAluno(o[2].toString());
			
			Disciplina dp = new Disciplina();
			dp.setCodDisciplina(Integer.parseInt(o[0].toString()));
			dp.setCargaHoraria(Integer.parseInt(o[1].toString()));
			dp.setNomeDisci(o[2].toString());

			Matricula mt = new Matricula();
			mt.setSemestre(Integer.parseInt(o[1].toString()));
			mt.setAno(Integer.parseInt(o[0].toString()));
			
			matriculas.add(mt);
		}
		return matriculas;
	}
}
