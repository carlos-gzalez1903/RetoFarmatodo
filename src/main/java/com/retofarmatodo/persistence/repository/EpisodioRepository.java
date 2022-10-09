package com.retofarmatodo.persistence.repository;

import com.retofarmatodo.persistence.entity.Episodio;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public interface EpisodioRepository extends CrudRepository<Episodio, Integer> {



}
