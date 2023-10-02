package wantedpreonboardingbackend.JobRecruit.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class User {
    private Long user_sequence_id;
    private String user_id;
    private String user_pw;

    public User(String user_id, String user_pw) {
        this.user_id = user_id;
        this.user_pw = user_pw;
    }


}
