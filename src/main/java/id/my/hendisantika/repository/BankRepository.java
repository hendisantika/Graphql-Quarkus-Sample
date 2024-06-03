package id.my.hendisantika.repository;

import id.my.hendisantika.domain.Bank;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Created by IntelliJ IDEA.
 * Project : Graphql-Quarkus-Sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 20:31
 * To change this template use File | Settings | File Templates.
 */
@ApplicationScoped
public class BankRepository implements PanacheRepository<Bank> {
}
