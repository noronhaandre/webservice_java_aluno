package service.andre.projeto_aluno;

import java.util.ArrayList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// http://localhost:8080/aluno
@Path("aluno")

public class RecursoAluno {
	
	ArrayList<Aluno> listaAluno;
	
	public RecursoAluno() {
		listaAluno = new ArrayList<Aluno>();
		listaAluno.add(new Aluno(0, "Matheus Silva", "matheus.s@gmail.com", 2, "Canoas"));
		listaAluno.add(new Aluno(1, "Maria Souza", "maria23@hotmail.com", 1, "Sapucaia"));
		listaAluno.add(new Aluno(2, "Alessandra de Oliveira", "ale.oli@gmail.com", 1, "Porto Alegre"));
		listaAluno.add(new Aluno(3, "Fernando Machado", "fernando.m@gmail.com", 5, "Gravatai"));
		listaAluno.add(new Aluno(4, "Silvano Medeiros", "s.m.2023@yahoo.com", 4, "Canoas"));
		listaAluno.add(new Aluno(5, "Cesar Bezerra", "cesar_bezerra@hotmail.com", 3, "Esteio"));
		listaAluno.add(new Aluno(6, "Silvia Macedo", "silvinha@gmail.com", 4, "Sapucaia"));
		listaAluno.add(new Aluno(7, "Fabricio Freitas", "f_freitas@yahoo.com", 5, "Guaiba"));
		listaAluno.add(new Aluno(8, "Marcio de Almeida", "marcio_al@gmail.com", 3, "São Leopoldo"));
		listaAluno.add(new Aluno(9, "Marcia Louzada", "marcia-l@hotmail.com", 2, "Novo Hamburgo"));
	}
	
	// http://localhost:8080/aluno/getaluno
	@GET
	@Path("getaluno")
	@Produces(MediaType.APPLICATION_JSON)
	public Aluno getAluno() {
		Aluno aluno = new Aluno(0, "Matheus Silva", "matheus.s@gmail.com", 2, "Canoas");
		
		return aluno;
	}
	
	// http://localhost:8080/aluno/getalunos
	@GET
	@Path("getalunos")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Aluno> getAlunos(){
		return listaAluno;
	}
	
	// http://localhost:8080/aluno/identificador/
	@GET
	@Path("identificador/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Aluno getAlunoParametro(@PathParam("id") int id){
		for(Aluno aluno:listaAluno) {
			if(aluno.getId() == id) {
				return aluno;
			}
		}
		return null;
	}

}
