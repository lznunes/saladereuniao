package com.nunes.saladereuniao.saladereuniao.repository;
import com.nunes.saladereuniao.saladereuniao.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
