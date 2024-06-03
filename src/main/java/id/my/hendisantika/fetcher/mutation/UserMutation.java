package id.my.hendisantika.fetcher.mutation;

import id.my.hendisantika.domain.User;
import id.my.hendisantika.domain.input.UserInput;
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
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
@GraphQLApi
@RequiredArgsConstructor
public class UserMutation {

    private final UserRepository userRepository;

    @Mutation("createUser")
    @Transactional
    public User createUser(@Name("user") UserInput user) {
        var userToSave = new User(null, user.getFirstName(), user.getLastName(), user.getAge(), user.getAddress(), user.getCountry(), user.getCity(), null, null);
        userRepository.persistAndFlush(userToSave);
        return userToSave;
    }
}
