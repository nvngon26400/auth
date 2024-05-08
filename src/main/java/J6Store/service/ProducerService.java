package J6Store.service;

import java.util.List;

import J6Store.entity.Producer;

public interface ProducerService {

    List<Producer> findAll();

    Producer findById(String id);

    Producer create(Producer producer);

    Producer update(Producer producer);

    void delete(String id);

    <S extends Producer> S save(S entity);

    long count();
}
