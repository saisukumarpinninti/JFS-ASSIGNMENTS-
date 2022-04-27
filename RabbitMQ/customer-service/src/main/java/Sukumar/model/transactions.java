package Sukumar.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class transactions implements custrepo{
    @Autowired
    private  custrepo Custrepo;

    public customer saveCustomer(customer c){
        return Custrepo.save(c);
    }

    @Override
    public <S extends customer> S save(S s) {
        return Custrepo.save(s);
    }

    @Override
    public <S extends customer> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<customer> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<customer> findAll() {
        return null;
    }

    @Override
    public Iterable<customer> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(customer entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends customer> entities) {

    }

    @Override
    public void deleteAll() {

    }

}
