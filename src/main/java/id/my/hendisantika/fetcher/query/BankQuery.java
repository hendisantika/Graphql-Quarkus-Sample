package id.my.hendisantika.fetcher.query;

import id.my.hendisantika.domain.Bank;
import id.my.hendisantika.repository.BankRepository;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : Graphql-Quarkus-Sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
@GraphQLApi
@RequiredArgsConstructor
public class BankQuery {

    private final BankRepository repository;

    @Query("banks")
    public List<Bank> findAll() {
        return repository.findAll().stream().collect(Collectors.toList());
    }

    @Query("bank")
    public Bank findById(@Name("id") Long id) {
        return repository.findById(id);
    }
}
