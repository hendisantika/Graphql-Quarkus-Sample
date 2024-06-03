package id.my.hendisantika.fetcher.mutation;

import id.my.hendisantika.domain.Account;
import id.my.hendisantika.domain.Bank;
import id.my.hendisantika.domain.User;
import id.my.hendisantika.domain.input.AccountInput;
import id.my.hendisantika.repository.AccountRepository;
import id.my.hendisantika.repository.BankRepository;
import id.my.hendisantika.repository.UserRepository;
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
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */
@GraphQLApi
@RequiredArgsConstructor
public class AccountMutation {

    private final AccountRepository accountRepository;

    private final BankRepository bankRepository;

    private final UserRepository userRepository;

    @Mutation("createAccount")
    @Transactional
    public Account createAccount(@Name("account") AccountInput accountInput) {
        User user = userRepository.findById(accountInput.getUserId());
        Bank bank = bankRepository.findById(accountInput.getBankId());

        var accountToSave = new Account(null, accountInput.getName(), accountInput.getAlias(), accountInput.getAmount(), user, bank);
        accountRepository.persistAndFlush(accountToSave);
        return accountToSave;
    }
}
