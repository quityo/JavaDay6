package hrsm.hrsm.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrsm.hrsm.business.Abstracts.PositionService;
import hrsm.hrsm.dataAccess.Abstracts.PositionDao;
import hrsm.hrsm.entities.Concretes.Position;


public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}
	
	@Override
	public List<Position> getAll() {
		return this.positionDao.findAll();
		}
	

}
