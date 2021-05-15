package hrsm.hrsm.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrsm.hrsm.entities.Concretes.Position;

public interface PositionDao extends JpaRepository<Position,Integer>{

}
