package com.app.repositories;

import com.app.models.Pie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Dewa on 4/11/2017.
 */
public interface PieRepository extends CrudRepository<Pie, Long> {
    List<Pie> findByName(String name);
}
