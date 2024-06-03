package id.my.hendisantika.fetcher.query;

import id.my.hendisantika.domain.User;
import id.my.hendisantika.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

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
public class UserQuery {

    private final UserRepository userRepository;

    @Query("users")
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Query("user")
    public User findById(@Name("id") Long id) {
        return userRepository.findById(id);
    }
}
