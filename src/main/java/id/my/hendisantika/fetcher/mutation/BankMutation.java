package id.my.hendisantika.fetcher.mutation;

import id.my.hendisantika.domain.Bank;
import id.my.hendisantika.domain.input.BankInput;
import id.my.hendisantika.repository.BankRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;

/**
 * Created by IntelliJ IDEA.
 * Project : Graphql-Quarkus-Sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
@GraphQLApi
@RequiredArgsConstructor
public class BankMutation {

    private final BankRepository repository;

    @Mutation("createBank")
    @Transactional
    public Bank createBank(@Name("bank") BankInput bankInput) {
        var bankToSave = new Bank(null, bankInput.getName(), bankInput.getCountry(), null, null);
        repository.persist(bankToSave);
        return bankToSave;
    }
}
