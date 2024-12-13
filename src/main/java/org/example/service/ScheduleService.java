package org.example.service;

import org.example.model.Schedule;
import org.example.repository.ScheduleRepository;

import java.util.List;

public class ScheduleService {
    private ScheduleRepository repository;

    public ScheduleService() {
        repository = new ScheduleRepository();
    }

    public List<Schedule> findAll() {
        return repository.findAll();
    }

    public Schedule findById(Long id){return repository.findById(id);}
}
