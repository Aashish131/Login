package Services;
import Model.User;

import java.util.Optional;


public interface UserService {

    Integer saveUser(User user);

    Optional<User> findByUsername(String username);
}