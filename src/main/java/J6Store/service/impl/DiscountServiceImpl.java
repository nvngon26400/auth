package J6Store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import J6Store.dao.DiscountDAO;
import J6Store.entity.Discount;
import J6Store.service.DiscountService;

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    DiscountDAO dao;

    @Override
    public List<Discount> findAll() {
        return dao.findAll();
    }

    @Override
    public <S extends Discount> S save(S entity) {
        return dao.save(entity);
    }

    @Override
    public Discount findById(String id) {
        return dao.findById(id).get();
    }

    @Override
    public Discount create(Discount Discount) {
        return dao.save(Discount);
    }

    @Override
    public Discount update(Discount Discount) {
        return dao.save(Discount);
    }

    @Override
    public void delete(String id) {
        dao.deleteById(id);
    }

    public long count() {
        return dao.count();
    }
}
