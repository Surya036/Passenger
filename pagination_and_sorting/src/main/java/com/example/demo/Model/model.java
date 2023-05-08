import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class passenger_service{
	@Autowired
	public pass_repo p_repo;
	public Model saveinfo(Model m)
	{
		return p_repo.save(m);
	}
	public List<Model> getInfo()
	{
		return p_repo.findAll();
	}
	public Model updateInfo(Model n)
	{
		return p_repo.saveAndFlush(sf)
	}
}