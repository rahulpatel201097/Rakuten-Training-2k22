package com.rakuten;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {
	
	@Autowired
	WorkoutRepository repository;
	
	public void save(Workout workout) {
		repository.save(workout);
		System.out.println("workout saved");
	}
	
	public List<Workout> getAllWorkouts() {
		return repository.findAll();
	}
	
	public Workout getWorkoutById(int id) throws Exception {
		System.out.println("Get workout by id");
		Optional<Workout> optional = repository.findById(id);
		if(optional.isEmpty()) {
			throw new Exception();
		}
		return optional.get();
	}
	
	public void deleteWorkoutById(int id) {
		System.out.println("workout deleted");
		repository.deleteById(id);
	}
	
	public void updateWorkoutById(Workout workout) throws Exception {
		if(!repository.existsById(workout.getId())) {
			throw new Exception();
		}
		repository.save(workout);
		System.out.println("Data Updated");
	}
	
}
