package ragav.rest.service.resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/students")
public class StudentsResource {

	private final StudentsDao dao = new StudentsDao();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudents() {
		List<Student> students = dao.getStudents();
		return Response.ok(students).build();
	}

	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getCount() {
		int count = dao.getStudents().size();
		return Response.ok(count).build();
	}

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addStudent(Student student) {
		dao.insertStudent(student);
		return Response.ok(student).build();
	}
}
