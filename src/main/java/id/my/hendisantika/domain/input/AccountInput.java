package id.my.hendisantika.domain.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : Graphql-Quarkus-Sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/3/24
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountInput {

    private String name;

    private String alias;

    private BigDecimal amount;

    private Long userId;

    private Long bankId;
}
