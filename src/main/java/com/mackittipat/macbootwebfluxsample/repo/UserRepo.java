package com.mackittipat.macbootwebfluxsample.repo;

import com.mackittipat.macbootwebfluxsample.model.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepo extends ReactiveCrudRepository<User, Integer> {

    @Query("select name from users where id = $1")
    Mono<String> findNameById(int id);

}
