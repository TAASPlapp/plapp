package com.plapp.gardenerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plapp.entities.schedules.ScheduleAction;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleAction, Long> {

}

