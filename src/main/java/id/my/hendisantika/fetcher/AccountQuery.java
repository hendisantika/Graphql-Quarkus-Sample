package id.my.hendisantika.fetcher;

import id.my.hendisantika.domain.Account;
import id.my.hendisantika.repository.AccountRepository;
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
public class AccountQuery {

    private final AccountRepository repository;

    @Query("accounts")
    public List<Account> findAll() {
        return repository.findAll().stream().collect(Collectors.toList());
    }

    @Query("account")
    public Account findById(@Name("id") Long id) {
        return repository.findById(id);
    }
}
