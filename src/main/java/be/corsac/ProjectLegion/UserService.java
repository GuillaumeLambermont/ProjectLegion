package be.corsac.ProjectLegion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void testDatabaseAccess() {
        long userCount = userRepository.count();
        System.out.println("Service initalized");
        System.out.println("Number of users: " + userCount);
    }
}
