package dev.khusanjon.mobileappservice.repository;

import dev.khusanjon.mobileappservice.model.entity.ReaderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends CrudRepository<ReaderEntity,Long> {
    ReaderEntity findByEmail(String email);
}
