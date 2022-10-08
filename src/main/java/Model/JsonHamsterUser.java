package Model;

import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.management.relation.Role;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class JsonHamsterUser {
    @Id
    private volatile long id;
    @Indexed
    private String username;
    @Indexed
    private String email;
    @Indexed
    private String password;

    @Indexed
    private Set<String> roles = new HashSet<>();

    public JsonHamsterUser(String username, String email, String password, Set<String> roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "JsonHamsterUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}